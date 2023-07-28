package com.telstra.javasess.day5.polymorphism;


class Flipkart
{
	void filter()
	{
		System.out.println("Default search");
	}
	void filter(int price)
	{
		if(price>10000)
			System.out.println("Discount:"+price*0.05);
		else if (price>20000&&price<50000)
			System.out.println("Discount:"+price*0.1);
		else
			System.out.println("Discount:"+price*0.15);
	}
	void filter(char gender)
	{
		if (gender=='m')
			System.out.println("Men");
		else
			System.out.println("Women");
	}
	
	
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Flipkart f=new Flipkart();
		f.filter('f');

	}

}
