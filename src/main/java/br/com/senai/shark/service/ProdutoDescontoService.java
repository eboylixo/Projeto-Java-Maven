package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class ProdutoDescontoService {

	public String calculaDesconto(Double valor) {

		if (valor <= 1500) {

			double porcentagem = (5d / 100); // 5% de desconto

			double valordesconto = valor * porcentagem;

			double valordescontado = valor - valordesconto;

			return "O valor do produto é de R$" + valor + " , o seu porcentual de desconto é de " + porcentagem*100 + "% "
					+ ", o valor do desconto fica em torno de R$" + valordesconto + " , e o valor final fica R$"
					+ valordescontado;

		} else if (valor > 1500 && valor <= 10000) {

			double porcentagem = (10d / 100); // 10% de desconto

			double valordesconto = valor * porcentagem;

			double valordescontado = valor - valordesconto;

			return "O valor do produto é de R$" + valor + " , o seu porcentual de desconto é de " + porcentagem*100 + "% "
					+ ", o valor do desconto fica em torno de R$" + valordesconto + " , e o valor final fica R$"
					+ valordescontado;

		} else {

			double porcentagem = (12d / 100); // 12% de desconto

			double valordesconto = valor * porcentagem;

			double valordescontado = valor - valordesconto;

			return "O valor do produto é de R$" + valor + " , o seu porcentual de desconto é de " + porcentagem*100 + "% "
					+ ", o valor do desconto fica em torno de R$" + valordesconto + " , e o valor final fica R$"
					+ valordescontado;

		}
	}
}
