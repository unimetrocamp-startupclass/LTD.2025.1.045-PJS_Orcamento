package com.pjs.orcamento.entidades;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Usuario 
{
	public void pedirOrcamento(){
        System.out.println("O cliente está pedindo um orçamento");
    }
    
}
