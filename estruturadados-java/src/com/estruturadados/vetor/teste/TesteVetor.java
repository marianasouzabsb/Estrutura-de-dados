package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class TesteVetor {

	/*
	 * public static void main(String[] args) { 
	 * Vetor vetor = new Vetor(5);
	 *  int i =
	 * 0; i++; }
	 */

	public static void main(String[] args)  {

		Vetor vetor = new Vetor(10);
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
			vetor.adiciona("Mariana 4");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Tamanho do Vetor: " + vetor.tamanho());
		System.out.println(vetor.toString());
		System.out.println(vetor.busca(3));
		
		System.out.println(vetor.busca2("elemento 2"));
	}

}
