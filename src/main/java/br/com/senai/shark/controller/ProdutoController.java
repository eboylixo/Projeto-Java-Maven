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

import br.com.senai.shark.dto.ProdutoDto;
import br.com.senai.shark.model.Produto;
import br.com.senai.shark.service.ProdutoService;

@RestController

@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping
	public ResponseEntity<ProdutoDto> criaProduto(@RequestBody ProdutoDto produtoDto) {
		Produto produto = produtoService.insereProduto(produtoDto);
		return ResponseEntity.ok(new ProdutoDto(produto));
	}

	@GetMapping
	public ResponseEntity<List<ProdutoDto>> listaProduto() {
		List<Produto> produto = produtoService.listarProduto();
		List<ProdutoDto> produtoDto = produto.stream().map(ProdutoDto::new).toList();
		return ResponseEntity.ok(produtoDto);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirProduto(@PathVariable Integer id) {
		produtoService.excluirProduto(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping
	public ResponseEntity<ProdutoDto> atualizaJogo(@RequestBody ProdutoDto produtoDto) {
		Produto produtoAtualizado = produtoService.insereProduto(produtoDto);
		return ResponseEntity.ok(new ProdutoDto(produtoAtualizado));
	}
	
	
}
