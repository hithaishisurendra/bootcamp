package com.telstra.javasess.day6.exception;

class invalidAgeException extends RuntimeException
{
	String msg;
	
	public invalidAgeException(String msg)
	{
		super();
		this.msg = msg;
	}
	public String getMsg()
	{
		return msg;
	}
}

class Citizen
{
	public void checkEligibility(int age)
	{
		if (age>=18)
			System.out.println("Eligible");
		else
			throw new invalidAgeException("Not eligible");
	}
}

public class userDefinedException {

	public static void main(String[] args) {
		Citizen c =new Citizen ();
		try
		{
			c.checkEligibility(110);
		}
		catch(invalidAgeException e)
		{
			System.out.println(e.getMsg());
		}
	}

}
