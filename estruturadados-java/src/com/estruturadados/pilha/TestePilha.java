package com.estruturadados.pilha;

import java.util.Stack;

public class TestePilha {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		

		System.out.println(pilha);

		System.out.println(pilha.tamanho());
		System.out.println(pilha.estaVazia());
		
		System.out.println(pilha.topo());
		
		System.out.println("desempilha: "+ pilha.desempilha());
		System.out.println(pilha);
		
		System.out.println("Pilha usando API Stack");
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(96);
		stack.push(14);
		stack.push(45);
		stack.push(68);
		stack.push(02);
		stack.push(98);
		
		System.out.println(stack.toString());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.peek()); 
		System.out.println(stack.toString());
		
	}

}
