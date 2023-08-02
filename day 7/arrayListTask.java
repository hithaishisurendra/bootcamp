package com.telstra.javasess.day7;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListTask {

	public static void main(String[] args) {
		
		ArrayList<String> batch1 = new ArrayList<>();
		batch1.add("hithu");
		batch1.add("novak");
		batch1.add("carlos");
		batch1.add("rafa");
		batch1.add("seb");
		
		ArrayList<String> batch2=new ArrayList<>();
		batch2.add("max");
		batch2.add("virat");
		batch2.add("serena");
		batch2.add("elena");
		batch2.add("iga");
		
		System.out.println(batch1);
		System.out.println(batch2);
		
		ArrayList<String> batch3=new ArrayList<>();
		ArrayList<String> batch4=new ArrayList<>();
		
		batch3.addAll(batch1);
		batch3.addAll(batch2);
		
		batch4.addAll(batch3);
		
		Collections.sort(batch4);
		
		System.out.println(batch3);
		System.out.println(batch4);

		
	
	
	
	}

		



}
