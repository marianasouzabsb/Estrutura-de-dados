package com.estruturadados.vetor;

public class Remover{
	
public static void main(String[] args)  {
		
		//Remove o elemento do vetor
		
		Vetor vetor = new Vetor(10);
		
		try {
			vetor.adiciona("1");
			vetor.adiciona("2");
			vetor.adiciona("3");
			vetor.adiciona("4");
			vetor.adiciona("5");
			
			System.out.println(vetor);
			
			System.out.println("indice do elemento: " + vetor.busca2("2"));
			
			
			  int pos = vetor.busca2("2");
			  
			  if (pos > -1) {
				  vetor.remove(pos);
			  }else { 
				  System.out.println("Elemento não existe");
			}	 
			
			System.out.println(vetor);
		
			System.out.println(vetor.tamanho());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	
//
}
