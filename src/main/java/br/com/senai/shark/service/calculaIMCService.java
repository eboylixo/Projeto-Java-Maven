package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class calculaIMCService {

	public String calculaIMC(Double peso, Double altura, String genero) {

		double IMC = peso / (altura * altura);

		if (IMC < 18.5) {
			return "Seu IMC:" + IMC + " - Abaixo do peso.";

		} else if (IMC >= 18.5 && IMC < 24.9) {
			return "Seu IMC:" + IMC + " - Peso normal.";

		} else if (IMC >= 25 && IMC < 29.9) {


			return "Seu IMC:" + IMC + " - Sobrepeso.";
		} else if (IMC >= 30 && IMC < 34.9) {

			return "Seu IMC:" + IMC + " - Obesidade Grau I.";

		} else if (IMC >= 35 && IMC < 39.9) {

			return "Seu IMC:" + IMC + " - Obesidade Grau II.";

		} else {

			return "Seu IMC:" + IMC + " - Obesidade Grau III (Obesidade Mórbida).";
		}

	}
}
