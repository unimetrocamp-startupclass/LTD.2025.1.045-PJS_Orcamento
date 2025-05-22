package com.pjs.orcamento.entidades.orcamento; 

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "orcamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orcamento 
{
	@Id
	@JsonProperty("_id")
	private ObjectId idOrcamento;
	
	@JsonProperty("valor")
    double valor;
    
	@JsonProperty("descricao")
    String descricao;
	
	@DocumentReference
	private List<OrcamentoCliente> orcamentosClientes;

	
	public Orcamento(double valor, String descricao) 
	{
		this.valor = valor;
		this.descricao = descricao;
	}


	public ObjectId getIdOrcamento() {
		return idOrcamento;
	}


	public void setIdOrcamento(ObjectId idOrcamento) {
		this.idOrcamento = idOrcamento;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public List<OrcamentoCliente> getOrcamentosClientes() {
		return orcamentosClientes;
	}


	public void setOrcamentosClientes(List<OrcamentoCliente> orcamentosClientes) {
		this.orcamentosClientes = orcamentosClientes;
	}

	
	
}


