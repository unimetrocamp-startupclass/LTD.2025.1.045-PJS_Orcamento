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
	
	public OrcamentoCliente(int status, Date date, double valorTotal, List<Orcamento> orcamentos, Cliente cliente) 
	{
		this.status = status;
		this.data = date;
		this.valorTotal = valorTotal;
		this.cliente = cliente;

		if(this.orcamentos == null) { this.orcamentos = new ArrayList<Orcamento>(); }
		this.orcamentos.addAll(orcamentos);
	}

	@JsonProperty("data")
	private Date data;
	
	@JsonProperty("valorTotal")
	private double valorTotal;
	
	@DocumentReference
	private List<Orcamento> orcamentos; 
	
	@DocumentReference
	private Cliente cliente; 
}
