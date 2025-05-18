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
}
