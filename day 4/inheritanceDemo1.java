package com.telstra.javasess.inheritance;


class Person
{
	public Person() {
	System.out.println("in person");
	}
}

class Employee extends Person
{
	public Employee() {
	System.out.println("in employee");
	}
}



public class inheritanceDemo1 {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("in main");
		Employee employee=new Employee();

	}

}
