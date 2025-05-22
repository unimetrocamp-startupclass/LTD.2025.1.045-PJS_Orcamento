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

	public ObjectId getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(ObjectId idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	} 
	
	
}
