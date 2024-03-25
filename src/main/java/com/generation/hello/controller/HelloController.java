package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController      //Requisições
@RequestMapping("/hello") //localhost:8080/hello
public class HelloController {
	
	@GetMapping() //Requisições do tipo GET/Busca
	public String hello() {
		return "Hello World!" + "<br><br><br>Lista de BSM's:<br><br>Persistência <br> Mentalidade de Crescimento <br>Orientação ao Futuro <br>Responsabilidade Pessoal <br>Proatividade <br>Comunicação <br>Trabalho em Equipe <br>Orientação ao Detalhe" + "<br><br><br>Objetivos de aprendizagem:<br><br>Desenvolvimento pessoal<br>Desenvolvimento profissional " +"<br><br>Turma 73 <br> Andressa Rocha";
	}
}
