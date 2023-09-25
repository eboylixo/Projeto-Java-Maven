package br.com.senai.shark.service;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrdenaNomeService {
	
	public String ordenacao(String nomes) {
		
		String recebe[] = nomes.split(",");
		
		List<String> ordenaNome = Arrays.asList(recebe);
		//ArrayList<String> novaLista =  new ArrayList<>();
		//novaLista.addAll(ordenaNome);
		
		
		Collections.sort(ordenaNome);		
		//Collections.sort(null, null);
		return ordenaNome.toString();
	}
	
}
