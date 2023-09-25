package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.CalculoGeometricoService;

@RestController
public class CalculoGeometricoController {

	@Autowired
	private CalculoGeometricoService calculoGeometricoService;

	@GetMapping("/forma")
	public String calcularArea(@RequestParam String figura, @RequestParam(required = false) Double ladoA,
			@RequestParam(required = false) Double ladoB, @RequestParam(required = false) Double altura,
			@RequestParam(required = false) Double raio, @RequestParam(required = false) Double baseMaior,
			@RequestParam(required = false) Double baseMenor) {

		 String retorno = calculoGeometricoService.calculoFormas(figura, ladoA, ladoB, altura, raio, baseMaior, baseMenor);
				
		return retorno;

	}
	
	//localhost:9090/area/quadrado?ladoA=10.0
	@GetMapping("/area/{tipo}")
	public String area(@PathVariable String tipo, @RequestParam(required = false) Double ladoA,
			@RequestParam(required = false) Double ladoB, @RequestParam(required = false) Double altura,
			@RequestParam(required = false) Double raio, @RequestParam(required = false) Double baseMaior,
			@RequestParam(required = false) Double baseMenor) {
		
		return "A aréa do "+tipo+" é igual a "+calculoGeometricoService.calculaArea(tipo, ladoA, ladoB, altura, raio, baseMaior, baseMenor);
	}
	
}
