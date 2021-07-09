package com.estruturadados.JavaArray;

import java.util.ArrayList;

public class javaArrayList {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("a");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add("f");

		//arrayList.add(1, "b");

		//arrayList.remove(1);

		System.out.println(arrayList.size());
		System.out.println(arrayList.contains("f"));
		System.out.println(arrayList.toString());
		System.out.println(arrayList.lastIndexOf("c"));
		
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		
		arrayList2.add(10);
		
		for(int i = 20; i <=  70; i++ ){ 
			
			System.out.println(i * 10);
			
			
		}
	}

}
