package br.com.senai.shark.dto;

import br.com.senai.shark.model.Carro;

public class CarroDto implements Comparable<CarroDto> {

	private Integer id;
	private String marca;
	private String modelo;
	private Integer ano;

	public CarroDto() {
		super();
	}

	public CarroDto(Carro carro) {
		this.id = carro.getId();
		this.marca = carro.getMarca();
		this.modelo = carro.getModelo();
		this.ano = carro.getAno();

	}

	public CarroDto(String marca, String modelo, Integer ano, Integer id) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int compareTo(CarroDto o) {
		// TODO Auto-generated method stub

		return ano.compareTo(o.getAno());
	}
}
