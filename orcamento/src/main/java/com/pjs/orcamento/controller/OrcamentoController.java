package com.pjs.orcamento.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjs.orcamento.OrcamentoClienteDTO;
import com.pjs.orcamento.entidades.orcamento.Orcamento;
import com.pjs.orcamento.entidades.orcamento.OrcamentoCliente;
import com.pjs.orcamento.entidades.usuario.Cliente;
import com.pjs.orcamento.service.OrcamentoClienteService;
import com.pjs.orcamento.service.OrcamentoService;

@RestController
@RequestMapping("/pjs/orcamento")
public class OrcamentoController 
{
	@Autowired
	OrcamentoService orcamentoService; 

	@GetMapping("/buscarOrcamentos")
	public ResponseEntity<List<Orcamento>> buscarOrcamentos()
	{
		return new ResponseEntity<List<Orcamento>>(orcamentoService.buscaTodosOrcamentos(), HttpStatus.OK); 
	} 
	
	@PostMapping("/criarOrcamento")
	public ResponseEntity<Orcamento> criarOrcamento(@RequestBody Map<String, String> orcamentoJson)
	{
		return new ResponseEntity<Orcamento>(orcamentoService.criarOrcamneto(Double.parseDouble(orcamentoJson.get("valor")), orcamentoJson.get("descricao")), HttpStatus.CREATED);
	}
	
	@Autowired
	OrcamentoClienteService orcamentoClienteService;
	
	@PostMapping("/criarOrcamentoCliente")
	public ResponseEntity<OrcamentoCliente> criarOrcamentoCliente(@RequestBody OrcamentoClienteDTO dto)
	{
		return new ResponseEntity<OrcamentoCliente>(orcamentoClienteService.criarOrcamentoCliente(dto.getIdsOrcamentos(), dto.getIdCliente()), HttpStatus.CREATED);
	}
	
	@GetMapping("/buscarOrcamentosClientes")
	public ResponseEntity<List<OrcamentoCliente>> buscarOrcamentosClientes()
	{
		return new ResponseEntity<List<OrcamentoCliente>>(orcamentoClienteService.buscarTodosOrcamentosClientes(), HttpStatus.OK);
	}
}
