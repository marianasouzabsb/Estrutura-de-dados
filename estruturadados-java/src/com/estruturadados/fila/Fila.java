package com.estruturadados.fila;

import com.estruturadados.pilha.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{

	public Fila() {
		super();
	}
	
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileirar(T elemento) {
		this.adiciona(elemento);
	}
	
	
	//Metodo espia o inicio da fila
	
	public T primeiroElemento() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}
	
	//Remover o primeiro elemento	
	public T remove() {

		final int POS = 0;
		if(this.estaVazia()) {
			return null;
		}

		T elementoRemovido = this.elementos[POS];
		this.remove(POS);

		return elementoRemovido;

	}
}
