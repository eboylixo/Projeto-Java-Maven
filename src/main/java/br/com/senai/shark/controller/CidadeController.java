package br.com.senai.shark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.CidadeDto;

@RestController

@RequestMapping("/clima")
public class CidadeController {

	private static List<CidadeDto> cidades = new ArrayList<>();
	
	
	
	@PostMapping
	public ResponseEntity<CidadeDto> criaCidade(@RequestBody CidadeDto cidade) {
		cidades.add(cidade);

		return ResponseEntity.ok(cidade);
	}

	@GetMapping
	public String findCidade(@RequestParam String nome) {
		double temperaturaMedia = 0;
		double media = 0;
		if (nome != null) {
			List<CidadeDto> cidadeRetorno = new ArrayList<>();

			for (CidadeDto cidadeDto : cidades) {
				if (cidadeDto.getNome().equals(nome)) {
					temperaturaMedia += cidadeDto.getTemperatura();
					cidadeRetorno.add(cidadeDto);

				}
				media = temperaturaMedia / cidadeRetorno.stream().count();

			}
		}
		return "A temperatura média da cidade é de:" + media + "ºC";

	}
}
