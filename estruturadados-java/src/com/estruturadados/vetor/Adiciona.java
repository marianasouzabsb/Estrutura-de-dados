package com.estruturadados.vetor;

public class Adiciona {
	
	public static void main(String[] args)  {
		
		//Adiciona um elemento em qualquer posicao do Vetor
		
		Vetor vetor = new Vetor(3);
		
		try {
			vetor.adiciona("B");
			vetor.adiciona("C");
			vetor.adiciona("D");
			vetor.adiciona("E");
			vetor.adiciona("F");
			
			System.out.println(vetor);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
