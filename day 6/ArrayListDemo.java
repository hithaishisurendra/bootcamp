package com.telstra.javasess.day6.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList ob = new ArrayList();
		System.out.println("Before size :"+ob.size());
		System.out.println(ob);

		
		ob.add(1);
		ob.add(4);
		ob.add(22);
		ob.add(80);
		ob.add("Hithu");
		System.out.println("After size :"+ob.size());
		
		System.out.println(ob);
		
		ob.set(2, 200);
		
		System.out.println(ob);
		
		ob.remove(0);
		
		System.out.println(ob.contains(1)); 
		
		System.out.println(ob);
		

	}

}
