package com.telstra.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

import com.telstra.Calc;

public class CalcTest {
	
	Calc calc=null;
	
	@Test
	public void testaddition()
	{
		Calc calc =new Calc();
		assertEquals(4, calc.addition(2,2));
		System.out.println("--------ADD-------");

	}
	
	@Test
	public void testsubtration()
	{
		Calc calc =new Calc();
		assertEquals(0, calc.subtraction(2,2));
		System.out.println("--------SUB----------");

	}
	
	@Test
	public void eligibilityTrueTest()
	{
		Calc calc =new Calc();
		assertTrue(calc.checkEligibility(22));
		System.out.println("---------TRUE--------");

	}
	
	@Test
	public void eligibilityFalseTest()
	{
		Calc calc =new Calc();
		assertFalse(calc.checkEligibility(12));
		System.out.println("--------FALSE-------");

	}
	
	@Before
	public void test1()
	{
		System.out.println("--------BEFORE--------");
	}
	
	@After
	public void test2()
	{
		System.out.println("-------AFTER-----------");

		
	}
	
	
}
