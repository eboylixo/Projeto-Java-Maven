package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.senai.shark.service.OrdenaNomeService;

@RestController
public class OrdenaNomeController {
	@Autowired
	private OrdenaNomeService ordenaNomeService;

	// localhost:9090/ordena?nomes=Ruan,Amanda,Jorge,Carlos
	@GetMapping("/ordena")
	public String nomeOrdena(@RequestParam String nomes) {
		String retorno = ordenaNomeService.ordenacao(nomes);

		return retorno;
	}

}
