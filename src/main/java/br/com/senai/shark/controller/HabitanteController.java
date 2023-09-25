package br.com.senai.shark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.HabitanteDto;

@RestController

@RequestMapping("/habitante")
public class HabitanteController {

	private static List<HabitanteDto> habitantes = new ArrayList<>();

	@PostMapping
	public ResponseEntity<HabitanteDto> criaHabitante(@RequestBody HabitanteDto habitante) {
		habitantes.add(habitante);

		return ResponseEntity.ok(habitante);
	}

	@GetMapping
	public ResponseEntity<List<HabitanteDto>> findHabitante(@RequestParam(required = false) Double salario,
			@RequestParam(required = false) Integer filhos) {

		if (salario != null || filhos != null) {
//		List<HabitanteDto> habitanteRetorno = new ArrayList<>();
//		for (HabitanteDto habitanteDto : habitantes) {
//			if (salario > habitanteDto.getSalario() || filhos > habitanteDto.getFilhos()) {
//				habitanteRetorno.add(habitanteDto);
//			}
//		}
			List<HabitanteDto> habitanteRetorno = habitantes.stream()
					.filter(habitanteDto -> salario != null && habitanteDto.getSalario() > salario
							|| filhos != null && habitanteDto.getFilhos() > filhos)
					.toList();

			return ResponseEntity.ok(habitanteRetorno);
		}
		return ResponseEntity.ok(habitantes);
	}

}
