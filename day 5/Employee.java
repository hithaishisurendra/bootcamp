package com.telstra.javasess.day5;

class Emp{
	final String dept;
	int id;
	String name;
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp.dept="developer";
		
		Emp e1=new Emp();
		e1.id=1;
		e1.name="hithu";
		e1.dept="cs";
		
		Emp e3=new Emp();
		e3.id=3;
		e3.name="chris";
		e3.dept="film";
		
		Emp e2=new Emp();
		e2.id=2;
		e2.name="novak";
		e2.dept="sport";
		
		
		System.out.println(e1.name+" "+e1.id+" "+e1.dept);
		System.out.println(e2.name+" "+e2.id+" "+e2.dept);
		System.out.println(e3.name+" "+e3.id+" "+e3.dept);
	}

}