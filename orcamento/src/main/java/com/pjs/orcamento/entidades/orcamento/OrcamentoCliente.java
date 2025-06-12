package com.pjs.orcamento.entidades.orcamento;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.pjs.orcamento.entidades.usuario.Cliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "orcamentoCliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrcamentoCliente 
{
	@Id
	@JsonProperty("_id")
	private ObjectId idOrcamentoCliente;
	
	@JsonProperty("status")
	private int status; 

	@JsonProperty("data")
	private Date data;
	
	@JsonProperty("valorTotal")
	private double valorTotal;
	
	@DocumentReference(lazy = false)
	private List<Orcamento> orcamentos; 
	
	@DocumentReference(lazy = false)
	private Cliente cliente; 
	
	public OrcamentoCliente() {}

	public OrcamentoCliente(int status, Date data, double valorTotal, List<Orcamento> orcamentos, Cliente cliente) 
	{
		this.status = status;
		this.data = data;
		this.valorTotal = valorTotal;
		this.cliente = cliente;

		if(this.orcamentos == null) { this.orcamentos = new ArrayList<Orcamento>(); }
		this.orcamentos.addAll(orcamentos);
	}

	public ObjectId getIdOrcamentoCliente() {
		return idOrcamentoCliente;
	}

	public void setIdOrcamentoCliente(ObjectId idOrcamentoCliente) {
		this.idOrcamentoCliente = idOrcamentoCliente;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Orcamento> getOrcamentos() {
		return orcamentos;
	}

	public void setOrcamentos(List<Orcamento> orcamentos) {
		this.orcamentos = orcamentos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
