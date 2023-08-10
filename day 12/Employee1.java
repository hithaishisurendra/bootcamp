package com.telstra.restdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor


public class Employee1 {
	
	private int id;
	private String name;
	private String dept;
	private int salary;
	private int age;
	
	

}
