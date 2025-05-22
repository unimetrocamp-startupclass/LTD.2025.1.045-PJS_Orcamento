package com.pjs.orcamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.pjs.orcamento.entidades.orcamento.Orcamento;
import com.pjs.orcamento.repository.OrcamentoRepository;

@Service
public class OrcamentoService 
{
	@Autowired
	OrcamentoRepository orcamentoRepository;

	public Orcamento criarOrcamneto(double valor, String descricao) 
	{
		Orcamento orcamento = orcamentoRepository.insert(new Orcamento(valor, descricao)); 
		return orcamento; 
	}
}
