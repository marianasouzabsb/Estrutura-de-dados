package com.estruturadados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<Integer>();
		
		
		fila.enfileirar(45);
		fila.enfileirar(2);
		fila.enfileirar(3);
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		System.out.println(fila.toString());
		System.out.println(fila.primeiroElemento());
		System.out.println(fila.remove());
		System.out.println(fila.toString());
		
		
		Queue<Integer> filaQueue = new LinkedList<>();
		
		filaQueue.add(71);
		filaQueue.add(2);
		filaQueue.add(25);
		filaQueue.add(27);
		
		System.out.println("fila Queue");
		System.out.println("fila espiar peek: " + filaQueue.peek()); // espiar
		System.out.println(filaQueue);
		//System.out.println("remover" + filaQueue.remove());//remover o elemento da pos 0 
		System.out.println(filaQueue);
		System.out.println("poll  " +filaQueue.poll());
 		
	}
	
}
