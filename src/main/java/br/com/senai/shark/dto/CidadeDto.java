package br.com.senai.shark.dto;

import java.time.LocalDate;

public class CidadeDto {

	private String nome;
	private LocalDate data;
	private double temperatura;

	public CidadeDto() {
		super();
	}

	public CidadeDto(String nome, LocalDate data, double temperatura) {
		super();
		this.nome = nome;
		this.data = data;
		this.temperatura = temperatura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
