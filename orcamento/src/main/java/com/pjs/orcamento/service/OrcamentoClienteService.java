package com.pjs.orcamento.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.pjs.orcamento.constantes.StatusConstantes;
import com.pjs.orcamento.entidades.orcamento.Orcamento;
import com.pjs.orcamento.entidades.orcamento.OrcamentoCliente;
import com.pjs.orcamento.entidades.usuario.Cliente;
import com.pjs.orcamento.repository.OrcamentClienteRepository;

@Service
public class OrcamentoClienteService 
{
	@Autowired
	OrcamentClienteRepository orcamentClienteRepository;
	
	@Autowired
	StatusConstantes constantes; 
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public OrcamentoCliente criarOrcamentoCliente(List<Orcamento> orcamentos, Cliente cliente) 
	{
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
