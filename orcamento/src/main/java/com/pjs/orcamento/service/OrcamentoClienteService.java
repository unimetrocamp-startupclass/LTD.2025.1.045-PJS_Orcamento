package com.pjs.orcamento.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.pjs.orcamento.constantes.StatusConstantes;
import com.pjs.orcamento.entidades.orcamento.Orcamento;
import com.pjs.orcamento.entidades.orcamento.OrcamentoCliente;
import com.pjs.orcamento.entidades.usuario.Cliente;
import com.pjs.orcamento.repository.ClienteRepository;
import com.pjs.orcamento.repository.OrcamentClienteRepository;
import com.pjs.orcamento.repository.OrcamentoRepository;

@Service
public class OrcamentoClienteService 
{
	@Autowired
	OrcamentClienteRepository orcamentClienteRepository;
	
	@Autowired
	OrcamentoRepository orcamentoRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public List<OrcamentoCliente> buscarTodosOrcamentosClientes()
	{
		return orcamentClienteRepository.findAll();
	}
	
	public OrcamentoCliente criarOrcamentoCliente(List<String> idsOrcamentos, String idCliente) 
	{
		List<ObjectId> objectIdsOrcamentos = idsOrcamentos.stream().map(ObjectId::new).collect(Collectors.toList());
		ObjectId objectIdCliente = new ObjectId(idCliente);
		
		List<Orcamento> orcamentos = orcamentoRepository.findAllById(objectIdsOrcamentos);
		Cliente cliente = clienteRepository.findById(objectIdCliente).get();
		
		double valorTotal = orcamentos.stream().mapToDouble(orcamento -> orcamento.getValor()).sum();
		
		OrcamentoCliente orcamentoCliente = orcamentClienteRepository.insert(new OrcamentoCliente(StatusConstantes.AGUARDANDO_APROVACAO, new Date(), valorTotal, orcamentos, cliente)); 
		
		mongoTemplate.update(Cliente.class)
					 .matching(Criteria.where("_id").is(cliente.getIdUsuario()))
					 .apply(new Update().push("orcamentosClientes", orcamentoCliente))
					 .first();
		
		for(Orcamento orcamento: orcamentos) 
		{
			mongoTemplate.update(Orcamento.class)
			 			 .matching(Criteria.where("_id").is(orcamento.getIdOrcamento()))
			 			 .apply(new Update().push("orcamentosClientes", orcamentoCliente))
			 			 .first();
		}
		
		return orcamentoCliente; 
	}
}
