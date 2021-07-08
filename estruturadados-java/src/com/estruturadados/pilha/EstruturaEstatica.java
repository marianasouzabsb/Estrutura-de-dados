package com.estruturadados.pilha;

public class EstruturaEstatica<T> {


	protected T[] elementos;
	protected int tamanho;

	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} return false;	

	}

	//add em qualquer posição
	protected boolean adicionapos(int posicao,T elemento) {

		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentaCapacidade();

		for(int i  = this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	@SuppressWarnings("unchecked")
	private void aumentaCapacidade(){
		if(this.tamanho == this.elementos.length) {
			
			T[] elementoNovos = (T[])new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i ++) {
				elementoNovos[i] = this.elementos[i];
			}
			this.elementos=  elementoNovos;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}

	public boolean estaVazia() {
		return this.tamanho == 0;
	}
}
