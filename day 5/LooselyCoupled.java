package com.telstra.javasess.day5.looselycoupling;

interface Sports
{
	void players();
	void country();
}

class Tennis implements Sports
{

	@Override
	public void players() {
		System.out.println("Novak Djokovic, Roger Federer, Pete Sampras");
		
	}

	@Override
	public void country() {
		System.out.println("Serbia, Swiss, USA");
		
	}
	
}

class Cricket implements Sports
{

	@Override
	public void players() {
		System.out.println("Virat Kohli, AB, Ben Stokes");
	}

	@Override
	public void country() {
		System.out.println("India, SA, England");
		
	}
	
}


public class LooselyCoupled {

	public static void main(String[] args) {
		Sports sports= new Cricket();
		sports.country();
		sports.players();

	}

}
