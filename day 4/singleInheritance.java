package com.telstra.javasess.inheritance;


class Employee1 {
 int salary = 60000;
}


class Engineer extends Employee1 
{
		 int benefits = 10000;
		 int salary=50000;
				 void superCheck()
				 {
					     int salary =40000;
						 System.out.println(this.salary);
						 System.out.println(super.salary);
						 System.out.println(salary);
				 
				 }
		 
}

public class singleInheritance {

	 public static void main(String args[])
	 {
	     Engineer E1 = new Engineer();
	     System.out.println("Salary : " + E1.salary
	                        + "\nBenefits : " + E1.benefits);
	     E1.superCheck();
	 }
}
