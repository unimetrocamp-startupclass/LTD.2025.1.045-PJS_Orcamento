package com.pjs.orcamento;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrcamentoClienteDTO 
{
	@JsonProperty("idsOrcamentos")
	private List<String> idsOrcamentos;
	
	@JsonProperty("idCliente")
	private String idCliente;

	public List<String> getIdsOrcamentos() {
		return idsOrcamentos;
	}

	public void setIdsOrcamentos(List<String> idsOrcamentos) {
		this.idsOrcamentos = idsOrcamentos;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
}
