package br.com.senai.shark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.JogoDto;
import br.com.senai.shark.model.Jogo;
import br.com.senai.shark.service.JogoService;

@RestController

@RequestMapping("/jogo")
public class JogoController {

	@Autowired
	private JogoService jogoService;
	
	@PostMapping
	public ResponseEntity<JogoDto> criaJogo(@RequestBody JogoDto jogoDto){
		Jogo jogo = jogoService.insereJogo(jogoDto);
		return ResponseEntity.ok(new JogoDto(jogo));
	}
	
	@GetMapping
	public ResponseEntity<List<JogoDto>> listarJogo(){
		List<Jogo> jogo = jogoService.listarJogos();
		List<JogoDto> jogoDto = jogo.stream().map(JogoDto :: new).toList();
		return ResponseEntity.ok(jogoDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirJogo(@PathVariable Integer id){
		jogoService.excluirJogo(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping
	public ResponseEntity<JogoDto> atualizaJogo(@RequestBody JogoDto jogoDto) {
		Jogo jogoAtualizado = jogoService.insereJogo(jogoDto);
		return ResponseEntity.ok(new JogoDto(jogoAtualizado));
	}
	
}
