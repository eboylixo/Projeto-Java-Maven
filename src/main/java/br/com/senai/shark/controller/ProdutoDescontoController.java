package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.ProdutoDescontoService;

@RestController
public class ProdutoDescontoController {
	
	@Autowired
	ProdutoDescontoService produtoDescontoService;
	
	
	@GetMapping("/desconto")
	public String produtoDesconto(@RequestParam Double valor) {
		String retorno = produtoDescontoService.calculaDesconto(valor);
		
		return retorno;
	}
	
	//localhost:9090/desconto/15500
	@GetMapping("/desconto/{valor}")
	public String calculaDesconto(@PathVariable Double valor) {
		String retorno = produtoDescontoService.calculaDesconto(valor);
		
		return retorno;
		
		
	}
	
}
