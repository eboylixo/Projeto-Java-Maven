package br.com.senai.shark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.CarroDto;
import br.com.senai.shark.model.Carro;
import br.com.senai.shark.service.CarroService;

@RestController

@RequestMapping("/carro")
public class CarroController {

	private static List<CarroDto> carros = new ArrayList<>();
	
	@Autowired
	private CarroService carroService;

	@PostMapping
	public ResponseEntity<CarroDto> criaCarro(@RequestBody CarroDto carroDto) {
		//carros.add(carro);
		Carro carro = carroService.salvarCarro(carroDto);
	
		return ResponseEntity.ok(new CarroDto(carro));
	}
	
	@GetMapping
	public ResponseEntity<List<CarroDto>> listarCarros(){
		List<Carro> carros =carroService.listarCarros();
		List<CarroDto> carrosDto =carros.stream().map(CarroDto::new).toList();
		return ResponseEntity.ok(carrosDto);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirCarro(@PathVariable Integer id){
		carroService.excluirCarro(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping
	public ResponseEntity<CarroDto> atualizaCarro(@RequestBody CarroDto carroDto){
		Carro carroAtualizado = carroService.salvarCarro(carroDto);
		return ResponseEntity.ok(new CarroDto(carroAtualizado));
	}

	@GetMapping("/filtrocarro")
	public ResponseEntity<List<CarroDto>> findCarro(@RequestParam(required = false) String marca,
			@RequestParam(required = false) String modelo, @RequestParam(required = false) Integer ano) {
		if (marca != null || modelo != null || ano != null) {

			for (CarroDto carroDto : carros) {

				if (carroDto.getMarca().equals(marca)) {
					List<CarroDto> carroRetorno = carros.stream().sorted().toList();
					return ResponseEntity.ok(carroRetorno);
				} else if (carroDto.getModelo().equals(modelo)) {
					List<CarroDto> carroRetorno = carros.stream().sorted().toList();
					return ResponseEntity.ok(carroRetorno);
				} else if (carroDto.getAno() == ano) {
					List<CarroDto> carroRetorno = carros.stream().sorted().toList();
					return ResponseEntity.ok(carroRetorno);
				}
			}

		}
		return ResponseEntity.ok(carros);

	}

}
