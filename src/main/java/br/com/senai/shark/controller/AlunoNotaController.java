package br.com.senai.shark.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.AlunoNotaService;

@RestController
public class AlunoNotaController {
	@Autowired
	private AlunoNotaService alunoNotaService;
	
	
	@GetMapping("/media")
	public String alunoNota(@RequestParam String nome, @RequestParam(defaultValue = "sem notas") String notas) {
		String retorno  = alunoNotaService.calculaMedia(notas);
		
		
		return "O aluno "+nome+" "+retorno;
	}
}
