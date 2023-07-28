package com.telstra.javasess.oops;

class Account
{
	int accountID;
	String accName;
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", accName=" + accName + ", balance=" + balance + "]";
	}
	double balance;
	
/*	Account()
	{
//		System.out.println(" this is constructor ");
	}
	*/
	Account(int accountID, String accName, double balance)
	{
		this.accountID=accountID;
		this.accName = accName;
		this.balance = balance;
	}
	void withdraw(double amount)
	{
		balance-=amount;
	}
	void deposit(double amount)
	{
		balance+=amount;
	}
	double getBalance()
	{
		return balance;
	}
	
}



public class AccountApp {
	public static void main(String args[])
	{
	//	Account acc = new Account();
		Account acc1= new Account(5,"hithu",100000.0);
		acc1.withdraw(10000);
		acc1.deposit(1000);
		System.out.println("Balance = "+acc1.getBalance());
		
	}
}
