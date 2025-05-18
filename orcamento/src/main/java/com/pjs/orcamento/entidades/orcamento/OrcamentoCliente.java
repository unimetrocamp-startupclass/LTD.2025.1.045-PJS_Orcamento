package com.pjs.orcamento.entidades.orcamento;

import java.sql.Date;
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
	
	@DocumentReference
	private List<Orcamento> orcamentos; 
	
	@DocumentReference
	private Cliente cliente; 
}
