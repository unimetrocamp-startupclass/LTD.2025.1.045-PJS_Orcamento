package com.pjs.orcamento.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.orcamento.entidades.Cliente;
import com.pjs.orcamento.repository.ClienteRepository;

@Service
public class ClienteService 
{
	@Autowired
	private ClienteRepository repository; 
	
	/**
	 * Metodo que busca todos os Clientes existentes no banco
	 * @return
	 */
	public List<Cliente> buscaTodosClientes() 
	{
		return repository.findAll();
	}
	
	/**
	 * Metodo que busca todos os Clientes existentes no banco
	 * @return
	 */
	public Optional<Cliente> buscaCliente(ObjectId id) 
	{
		return repository.findById(id);
	}
	
}
