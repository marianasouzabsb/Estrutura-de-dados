package com.estruturadados.lista;

import com.estruturadados.model.Contato;

public class TesteLista {

	public static void main(String[] args) throws Exception {

		
		ListaGeneric<Contato> vetorLista = new ListaGeneric<Contato>(1);
		
		Contato c1 =  new Contato("Mariana","61 98457-6856", "mari@gmail.com");
		
		vetorLista.adiciona(c1);
		
		System.out.println(vetorLista);
		System.out.println(vetorLista.tamanho());
		
		
	}

}
