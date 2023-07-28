package com.telstra.javasess.day5;

class Parent
{
	int id;
	public Parent (int id)
	{
		System.out.println("Parent cons "+ id);
	}
	public Parent ()
	{
		System.out.println("Parent cons default");
	}
}


class Child extends Parent
{
	public Child(int id)
	{
		super (id);
		System.out.println("Child cons");
	}
}



public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child(5);
	}

}
