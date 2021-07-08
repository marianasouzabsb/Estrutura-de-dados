package com.estruturadados.lista;

import com.estruturadados.model.Contato;

public class TesteLista {

	public static void main(String[] args) throws Exception {

		
		ListaGeneric<Contato> vetorLista = new ListaGeneric<Contato>(1);
		
		Contato c1 =  new Contato("Mariana","61 98457-6856", "mari@gmail.com");
		Contato c2 =  new Contato("amanda","61 dfdfdfdf", "dsfs@gmail.com");
		
		vetorLista.adiciona(c1);
		
		System.out.println(vetorLista);
		System.out.println(vetorLista.tamanho());
		
		
		System.out.println(vetorLista.contem(c2));
		
	}

}
