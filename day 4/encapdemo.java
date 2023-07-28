package com.telstra.javasess.encapsulation;

public class encapdemo {

	public static void main(String[] args) {
		
		employee o=new employee();
//		o.id=1;
//		o.name="hithu";
		
		o.setID(1);
		o.setName("hithu");
		
		System.out.println(o.getID());
		System.out.println(o.getName());
		
	}

}
