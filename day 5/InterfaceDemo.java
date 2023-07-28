package com.telstra.javasess.day5.looselycoupling;

interface Bank
{
	int salary=5000;
	
	void greet();
}

interface RBI// extends Bank
{
	void atmGuidelines();
}

class Axis implements Bank,RBI//****** Multiple inheritance
{

	@Override
	public void greet() {
		System.out.println("Welcome all");
	}

	@Override
	public void atmGuidelines() {
		System.out.println("Guide Book");
		
	}
	
	
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Axis axis = new Axis();
		axis.greet();
		axis.atmGuidelines();
		Bank bank = new Axis();//child obj, parent ref
		bank.greet();
//		bank.atmGuidelines(); -> will not work because parent only has its own properties but child will have all

	}

}
