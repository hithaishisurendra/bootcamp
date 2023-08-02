package com.telstra.javasess.day7;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> nums=new Stack<>();
		nums.add(2);
		nums.push(4);
		nums.push(6);
		nums.add(8);
		
		System.out.println(nums);
		
		nums.pop();
		System.out.println(nums);
		nums.pop();
		System.out.println(nums);
	}

}
