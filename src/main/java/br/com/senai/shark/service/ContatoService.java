package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.ContatoDto;
import br.com.senai.shark.model.Contato;
import br.com.senai.shark.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;
	
	public Contato insereContato(ContatoDto contatoDto) {
		Contato contato = new Contato(contatoDto);
		return contatoRepository.save(contato);
	}
	
	public List<Contato> listarContato(){
		return contatoRepository.findAll();
	}
	
	public void excluirContato(Integer id) {
		contatoRepository.deleteById(id);
	}
}
