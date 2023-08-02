package com.telstra.app;

import com.telstra.model.Employee;

public class LombokDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(4,"hithu","ceo");
		Employee e2=new Employee();
		
		e2.setId(4);
		e2.setDept("finance");
		e2.setName("leo");
		
		System.out.println(e1.getName()+" "+e1.getDept()+" "+e1.getId());
		System.out.println(e2.getName()+" "+e2.getDept()+" "+e2.getId());
		
		
		System.out.println(e1);
		System.out.println(e2);

		
		
	}

}
