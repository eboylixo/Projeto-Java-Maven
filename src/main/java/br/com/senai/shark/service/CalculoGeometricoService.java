package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class CalculoGeometricoService {

	public String calculoFormas(String figura, Double ladoA, Double ladoB, Double altura, Double raio, Double baseMaior,
			Double baseMenor) {

		double area = 0;

		switch (figura) {
		case "quadrado":
			area = ladoA * ladoA;
			break;
		case "retangulo":
			area = ladoA * ladoB;
			break;
		case "triangulo":
			area = (baseMaior * altura) / 2;
			break;
		case "circulo":
			area = Math.PI * raio * raio;
			break;
		case "trapezio":
			area = ((baseMaior + baseMenor) * altura) / 2;
			break;
		default:
			return "Figura não reconhecida";
		}

		return "A área da " + figura + " é: " + area;
	}


	public Double calculaArea(String tipo, Double ladoA, Double ladoB, Double altura, Double raio, Double baseMaior,
			Double baseMenor) {

		switch (tipo) {
		case "quadrado":
			return ladoA * ladoA;

		case "retangulo":
			return ladoA * ladoB;

		case "triangulo":
			return (baseMaior * altura) / 2;

		case "circulo":
			return Math.PI * raio * raio;

		case "trapezio":
			return ((baseMaior + baseMenor) * altura) / 2;

		default:
			return 0d;

		}
	}
}
