package com.telstra;

public class Calc {
		
		public int addition(int a, int b)
		{
			return a+b;
		}
		
		public int subtraction(int a, int b)
		{
			return a-b;
		}
		public boolean checkEligibility(int age)
		{
			if (age>=18)
			{
				return true;
			}
			else 
				return false;
		}

}

