package com.telstra.javasess.day5;


import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a,n;
		System.out.println("Enter number");
		a = sc.nextInt();
		System.out.println("Enter how many times you want to print");
		n= sc.nextInt();
		for (int i =1;i<=n;i++)
		{
			System.out.println(a*i);
		}

	}

}