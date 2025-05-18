package com.pjs.orcamento.entidades.usuario;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pjs.orcamento.entidades.contato.Contato;

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
	private ObjectId idUsuario;
	
	@JsonProperty("nome")
    private String nome;

	@JsonProperty("telefone")
    private String telefone;

	@JsonProperty("senha")
    private String senha;
	
	@DocumentReference
	private Contato contato; 
}
