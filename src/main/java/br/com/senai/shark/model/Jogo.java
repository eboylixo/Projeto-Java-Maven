package br.com.senai.shark.model;

import java.time.LocalDate;

import br.com.senai.shark.dto.JogoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descricao;
	private Double preco;
	private LocalDate dtLancamento;
	private String nomeDesenvolvedora;
	private String nomePublisher;

	public Jogo(JogoDto jogoDto) {
		this.titulo = jogoDto.getTitulo();
		this.descricao = jogoDto.getDescricao();
		this.preco = jogoDto.getPreco();
		this.dtLancamento = jogoDto.getDtLancamento();
		this.nomeDesenvolvedora = jogoDto.getNomeDesenvolvedora();
		this.nomePublisher = jogoDto.getNomePublisher();
	}

	public Jogo() {
		super();
	}

	public Jogo(Integer id, String titulo, String descricao, Double preco, LocalDate dtLancamento,
			String nomeDesenvolvedora, String nomePublisher) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
		this.dtLancamento = dtLancamento;
		this.nomeDesenvolvedora = nomeDesenvolvedora;
		this.nomePublisher = nomePublisher;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalDate getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(LocalDate dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public String getNomeDesenvolvedora() {
		return nomeDesenvolvedora;
	}

	public void setNomeDesenvolvedora(String nomeDesenvolvedora) {
		this.nomeDesenvolvedora = nomeDesenvolvedora;
	}

	public String getNomePublisher() {
		return nomePublisher;
	}

	public void setNomePublisher(String nomePublisher) {
		this.nomePublisher = nomePublisher;
	}

}
