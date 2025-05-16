package com.pjs.orcamento.entidades;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario 
{
	@Id
	@JsonProperty("_id")
	private ObjectId id;
	
	@JsonProperty("nome")
    private String nome;

	@JsonProperty("telefone")
    private String telefone;

	@JsonProperty("senha")
    private String senha;
}
