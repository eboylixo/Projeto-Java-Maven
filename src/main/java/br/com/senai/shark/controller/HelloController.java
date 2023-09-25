package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.HelloService;

@RestController

public class HelloController {
	
	@Autowired
	private HelloService helloService;
		
	@GetMapping("/ola")
	public String olaMundo(@RequestParam(defaultValue = "mundo") String nome,@RequestParam Integer idade) {
		helloService.validaIdade(idade);
		return "Olá "+nome + ", idade:" +idade;
	}

	@GetMapping("/{nome}")
	public String olaMundoNome(@PathVariable String nome) {
		return "Olá "+ nome;
	}
}
