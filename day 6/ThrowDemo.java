package com.telstra.javasess.day6.exception;

import java.io.IOException;

class User
{
	public void checkEligibility(int age)
	{
		if(age>=18)
			System.out.println("eligible");
		else
			throw new ArithmeticException("Not eligible");
	}
	
	//checked during compile time
	public void checkEligibility2(int age) throws IOException
	{
		if(age>=18)
			System.out.println("eligible");
		else
			throw new IOException("Not eligible");
	}
}

public class ThrowDemo {

	public static void main(String[] args) {
		User user =new User();
//		user.checkEligibility(2);
//		user.checkEligibility2(2);
		try
		{
			user.checkEligibility(22);
			user.checkEligibility2(4);
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong");
		}
	}

}
