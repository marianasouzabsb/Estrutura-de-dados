package com.estruturadados.pilha;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	//Adiciona elemento na pilha
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}

	// Retorna o elemento do topo da pilha
	public T topo() {

		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[tamanho-1];
	}

	// remove o ultimo elemento da pilha
	public T desempilha() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[--tamanho];
	}

	//
}
