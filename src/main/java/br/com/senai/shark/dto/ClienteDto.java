package br.com.senai.shark.dto;

import java.time.LocalDate;

import br.com.senai.shark.model.Cliente;

public class ClienteDto {
	
	private Integer id;
	private String nome;
	private String endereco;
	private String email;
	private LocalDate dtNascimento;
	private String cpf;

	
	
	public ClienteDto(Cliente cliente){
		
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.endereco = cliente.getEndereco();
		this.email = cliente.getEmail();
		this.dtNascimento = cliente.getDtNascimento();
		this.cpf = cliente.getCpf();
	}
	
	
	
	public ClienteDto() {
		super();
	}

	public ClienteDto(Integer id, String nome, String enderco, String email, LocalDate dtNascimento, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = enderco;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String enderco) {
		this.endereco = enderco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
