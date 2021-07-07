package com.estruturadados.vetor;

import com.estruturadados.model.Contato;

public abstract class TesteVetorObject {

	public static void main(String[] args) throws Exception  {

		VetorObject vetorObject = new VetorObject(10);
		
		Contato c1 =  new Contato("Mariana","61 98457-6856", "mari@gmail.com");
		Contato c2 =  new Contato("George","61 98457-6856", "amor@gmail.com");
		Contato c3 =  new Contato("Fabricio","61 98457-6856", "lucas@gmail.com");
		Contato c4 =  new Contato("Solteira","61 98457-6856", "feliz@gmail.com");

		vetorObject.adiciona(c1);
		vetorObject.adiciona(c2);
		vetorObject.adiciona(c3);
		vetorObject.adiciona(c4);
		
		int pos = vetorObject.busca2(c4);
				if(pos > -1) {
					System.out.println("O indice do elemento: " + pos);
				}

		System.out.println("Tamanho do Vetor: " + vetorObject.tamanho());
		System.out.println(vetorObject.toString());

	}
}