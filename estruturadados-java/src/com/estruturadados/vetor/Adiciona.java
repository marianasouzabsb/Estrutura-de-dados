package com.estruturadados.vetor;

public class Adiciona {
	
	public static void main(String[] args)  {
		
		//Adiciona um elemento em qualquer posicao do Vetor
		
		Vetor vetor = new Vetor(10);
		
		
		try {
			vetor.adiciona("B");
			vetor.adiciona("C");
			vetor.adiciona("D");
			vetor.adiciona("E");
			vetor.adiciona("F");
			
			System.out.println(vetor);
			
			
			vetor.adiciona3(0, "A");
			System.out.println(vetor);
			
			vetor.adiciona3(2, "X");
			System.out.println(vetor);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
