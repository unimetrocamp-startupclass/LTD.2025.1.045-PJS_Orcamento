package com.pjs.orcamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.orcamento.entidades.Usuario;
import com.pjs.orcamento.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository; 
	
	/**
	 * Metodo que busca todos os Usuarios existentes no banco
	 * @return
	 */
	public List<Usuario> buscaTodosUsuario() 
	{
		return repository.findAll();
	}
}
