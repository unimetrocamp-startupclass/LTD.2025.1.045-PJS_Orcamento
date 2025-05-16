package com.pjs.orcamento.controller;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjs.orcamento.entidades.Cliente;
import com.pjs.orcamento.entidades.Usuario;
import com.pjs.orcamento.service.ClienteService;
import com.pjs.orcamento.service.UsuarioService;

@RestController
@RequestMapping("/pjs/usuario")
public class UsuarioController 
{
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private ClienteService clienteService;
	
//	@GetMapping("/usuario")
//	public ResponseEntity<List<Usuario>> buscaTodosUsuarios() 
//	{ 
//		return new ResponseEntity<List<Usuario>>(usuarioService.buscaTodosUsuario(), HttpStatus.OK); 
//	}
	
	@GetMapping
	public ResponseEntity<List<Cliente>> buscaTodosCliente() 
	{ 
		return new ResponseEntity<List<Cliente>>(clienteService.buscaTodosClientes(), HttpStatus.OK); 
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Cliente>> buscaClienteUnico(@PathVariable ObjectId id)
	{
		return new ResponseEntity<Optional<Cliente>>(clienteService.buscaCliente(id), HttpStatus.OK); 
	}
}
