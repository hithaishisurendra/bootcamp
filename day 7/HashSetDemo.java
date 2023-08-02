package com.telstra.javasess.day7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;



public class HashSetDemo {

	public static void main(String[] args) {
		
		//Own order
		HashSet<String> icecream = new HashSet<>();
		
		icecream.add("blueberry");
		icecream.add("chocolate");
		icecream.add("mint");
		icecream.add("vanilla");
		icecream.add("pista");
		icecream.add("chocolate");
		
		System.out.println(icecream);
		
		//Insertion order
		
		LinkedHashSet<String> ic=new LinkedHashSet<>();
		
		ic.add("blueberry");
		ic.add("chocolate");
		ic.add("mint");
		ic.add("vanilla");
		ic.add("pista");
		ic.add("chocolate");
		
		System.out.println(ic);
		
		
		//Sorted order
		
		
		TreeSet<String> icecream3 = new TreeSet<>();
		
		icecream3.add("blueberry");
		icecream3.add("chocolate");
		icecream3.add("mint");
		icecream3.add("vanilla");
		icecream3.add("pista");
		icecream3.add("chocolate");
		
		System.out.println(icecream3);
		
		
	}

}
