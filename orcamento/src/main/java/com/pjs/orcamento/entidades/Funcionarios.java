package com.pjs.orcamento.entidades;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "funcionario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionarios extends Usuario
{
    String cargo;
    int permicao;

    public void analisarOrcamento(){
        System.out.println("Analisando o orçamento...");
    }

    public void aprovarOrcamento(){
        System.out.println("Aprovando o orçamento...");
    }
        
    }
