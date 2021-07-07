package com.estruturadados.lista;

public class ListaGeneric<T> {

	//
	private T[] elementos;
	private int tamanho;

	// Construtor // Solução do livro Effective java
	public ListaGeneric(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	//Metodo que adiciona dado no vetor	 

	public void adiciona1(T elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null)  { 
				this.elementos[i] = elemento; break; 
			} 
		} 
	}

	//Método de busca de elemento por posição

	public Object busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}

	public int busca2(T elemento) {
		for(int i = 0; i < this.tamanho;i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}return -1;
	}

	//Metodo que adiciona dado no vetor	sem percorrer todo o vetor

	public void adiciona(T elemento) throws Exception {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else {
			throw new Exception("vetor esta cheio");	
		}
	}

	//Metodo que retorna o tamanho do vetor

	public int tamanho() {
		return this.tamanho;
	}

	// método que retorna os elementos do vetor
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

	//Metodo elemento em qualquer posicao do vetor

	public boolean adiciona3(int posicao,T elemento) {

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
	// Aumenta a capacidade do Vetor

	private void aumentaCapacidade(){
		if(this.tamanho == this.elementos.length) {

			T[] elementoNovos = (T[])new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i ++) {
				elementoNovos[i] = this.elementos[i];
			}
			this.elementos=  elementoNovos;
		}
	}

	//Metodo Remove

	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i = posicao; i < this.tamanho - 1; i++) {

			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
}
