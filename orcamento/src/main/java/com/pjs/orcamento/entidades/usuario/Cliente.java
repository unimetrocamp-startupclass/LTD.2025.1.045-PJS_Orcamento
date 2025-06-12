package com.pjs.orcamento.entidades.usuario;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pjs.orcamento.entidades.orcamento.OrcamentoCliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Usuario 
{
	@DocumentReference @JsonIgnore
	private List<OrcamentoCliente> orcamentosClientes;

	public List<OrcamentoCliente> getOrcamentosClientes() {
		return orcamentosClientes;
	}

	public void setOrcamentosClientes(List<OrcamentoCliente> orcamentosClientes) {
		this.orcamentosClientes = orcamentosClientes;
	}
	
	
}
