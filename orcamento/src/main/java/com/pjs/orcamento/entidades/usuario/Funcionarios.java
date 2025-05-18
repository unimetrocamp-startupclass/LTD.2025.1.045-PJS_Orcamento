package com.pjs.orcamento.entidades.usuario;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "funcionario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionarios extends Usuario
{
	@JsonProperty("cargo")
    private String cargo;
	
	@JsonProperty("permicao")
    private List<Integer> permicao;
}
