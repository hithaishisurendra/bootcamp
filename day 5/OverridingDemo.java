package com.telstra.javasess.day5;

class RBI
{
	void holiday()
	{
		System.out.println("2 days");
	}
	void dailyLimit()
	{
		System.out.println("10 lakhs");
	}
	int salary;
}

class SBI extends RBI
{
/*	void holiday()
	{
		System.out.println("2 days");
	}*/
	void dailyLimit()
	{
		System.out.println("20 lakhs");
	}
	void sbirule()
	{
		System.out.println("All working days");
	}
	int bonus=20000;
}


public class OverridingDemo {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		sbi.dailyLimit();
		sbi.holiday();
		sbi.sbirule();
		System.out.println(sbi.salary);
		System.out.println(sbi.bonus);
		
		System.out.println("============");
		RBI sbi2=new SBI();
		sbi2.dailyLimit();
		sbi2.holiday();
	//	sbi2.sbirule();
		System.out.println(sbi2.salary);
	//	System.out.println(sbi2.bonus);

	}

}
