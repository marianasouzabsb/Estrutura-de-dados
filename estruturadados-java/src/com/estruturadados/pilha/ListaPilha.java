package com.estruturadados.pilha;

public class ListaPilha<T> extends EstruturaEstatica<T>{

	public ListaPilha() {
		super();
	}

	public ListaPilha(int capacidade) {
		super(capacidade);
	}

	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}
	
	public boolean adicionapos(int pos, T elemento) {
		return super.adicionapos(0, elemento);
	}

}
