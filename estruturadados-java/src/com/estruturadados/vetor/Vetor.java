package com.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;


	// Construtor
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	//Metodo que adiciona dado no vetor	 

	public void adiciona1(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null)  { 
				this.elementos[i] = elemento; break; 
			} 
		} 
	}
	
	//Método de busca de elemento por posição
	
	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int busca2(String elemento) {
		for(int i = 0; i < this.tamanho;i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}return -1;
	}

	//Metodo que adiciona dado no vetor	sem percorrer todo o vetor

	public void adiciona(String elemento) throws Exception {
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
	
	public boolean adiciona3(int posicao,String elemento) {
		
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i  = this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
			
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
//	
}
