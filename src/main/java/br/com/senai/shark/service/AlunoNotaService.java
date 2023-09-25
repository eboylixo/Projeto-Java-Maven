package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class AlunoNotaService {

	public String calculaMedia(String notas) {


		String recebe[]  = notas.split(",");
		double media=0;
		
		for (int i = 0; i < recebe.length; i++) {
			media = media + Double.parseDouble(recebe[i]);
		}
		media = media/recebe.length;
		
		if(media >= 7) {
			
			return "foi aprovado com média: " +media;
		
		
		}else {
			
			return "foi reprovado com média: "+media;
			
		}
		
	}
}