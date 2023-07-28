package com.telstra.javasess.oops;

class Employee
{
	int id;
	String name;
	String dept;
	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}

public class toStringDemo {
	public static void main(String[] args) {
		Employee emp=new Employee(404,"hithu","cse");
		double salary=100000;
		System.out.println("Salary="+salary);
		System.out.println(emp);
	}
	

}
