package com.telstra.javasess.day7;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> tennis = new HashMap<>();
		tennis.put("novak","aus open");
		tennis.put("carlos", "wimbledon");
		tennis.put("novak","rg");
		tennis.put("rafa","uso");
		
		System.out.println(tennis);
		
		System.out.println(tennis.get("novak"));
		System.out.println(tennis.get("rafa"));
		
		System.out.println("Values: "+tennis.values());
		System.out.println("Keys: "+tennis.keySet());
		
		
		//interating keys
		
		for (String key:tennis.keySet())
		{
			System.out.println("[Key: "+key+"] [Value: "+tennis.get(key)+"]");
		}
		

	}

}
