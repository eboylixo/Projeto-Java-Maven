package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.calculaIMCService;

@RestController
public class IMCController {
	@Autowired
	calculaIMCService calculaIMCService;
	
	
	// localhost:9090/imc?genero=M&peso=90&altura=1.8
	@GetMapping("/imc")
	public String calculadoraIMC(@RequestParam Double peso, @RequestParam Double altura, @RequestParam String genero) {
		String retorno = calculaIMCService.calculaIMC(peso, altura, genero);

		return retorno;
	}
}
