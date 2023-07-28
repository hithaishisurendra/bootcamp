package com.telstra.service;

import com.telstra.dao.Payment;
import com.telstra.dao.NetBanking;
import com.telstra.dao.UPI;


public class PaymentMethod {
	
	Payment paymentmethod;
	
	public PaymentMethod()
	{
		paymentmethod = new UPI();
	}
	
	public void pay()
	{
		paymentmethod.doPayment();
		System.out.println("logic");
	}

}
