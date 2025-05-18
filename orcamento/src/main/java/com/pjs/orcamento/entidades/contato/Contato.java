package com.pjs.orcamento.entidades.contato;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "contato")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contato 
{
	@Id
	@JsonProperty("_id")
	private ObjectId idContato; 
	
	@JsonProperty("tipo")
	private int tipo;
	
	@JsonProperty("contato")
	private String contato;
}
