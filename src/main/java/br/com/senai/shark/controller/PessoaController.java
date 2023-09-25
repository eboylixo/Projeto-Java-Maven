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

import br.com.senai.shark.dto.PessoaDto;
import br.com.senai.shark.model.Pessoa;
import br.com.senai.shark.service.PessoaService;

@RestController

//permite que a requisição seja a mesma dentro da classe
@RequestMapping("/pessoa")
public class PessoaController {
	
	private static List<PessoaDto> pessoas = new ArrayList<>();
	
	@Autowired
	private PessoaService pessoaService;
	
	
	@PostMapping
	public ResponseEntity<PessoaDto> criaPessoa(@RequestBody PessoaDto pessoaDto){
			//pessoas.add(pessoa);
			//Cria uma pessoa a partir da PESSOADTO
			Pessoa pessoa = new Pessoa(pessoaDto);
			//Insere a nova pessoa no banco
			pessoa = pessoaService.inserePessoa(pessoa);
			//
			return ResponseEntity.ok(new PessoaDto(pessoa));
		
	}
	@GetMapping
	public ResponseEntity<List<PessoaDto>> findPessoa() {
		List<Pessoa> pessoas = pessoaService.listarPessoa();
		List<PessoaDto> pessoasDto = pessoas.stream().map(PessoaDto::new).toList();
		return ResponseEntity.ok(pessoasDto);
	}
	
}
