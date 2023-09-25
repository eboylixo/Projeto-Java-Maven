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
import br.com.senai.shark.dto.ClienteDto;
import br.com.senai.shark.model.Cliente;
import br.com.senai.shark.service.ClienteService;

@RestController

@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<ClienteDto> criaCliente(@RequestBody ClienteDto clienteDto) {

		Cliente cliente = clienteService.insereCliente(clienteDto);
		return ResponseEntity.ok(new ClienteDto(cliente));
	}
	
	@GetMapping
	public ResponseEntity<List<ClienteDto>> listaCliente(){
		List<Cliente> cliente = clienteService.listaCliente();
		List<ClienteDto>clienteDto = cliente.stream().map(ClienteDto::new).toList();
		return ResponseEntity.ok(clienteDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirCliente(@PathVariable Integer id){
		clienteService.excluirCliente(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping
	public ResponseEntity<ClienteDto> atualizaCliente(@RequestBody ClienteDto clienteDto) {
		Cliente clienteAtualizado = clienteService.insereCliente(clienteDto);
		return ResponseEntity.ok(new ClienteDto(clienteAtualizado));
	}
	
}
