package com.pjs.orcamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class OrcamentoApplication {

	public static void main(String[] args) { SpringApplication.run(OrcamentoApplication.class, args); }
}
