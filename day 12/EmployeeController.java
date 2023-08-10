package com.telstra.restdemo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.restdemo.model.Employee1;

@RestController
public class EmployeeController {
	
	ArrayList<Employee1> employee = new ArrayList<Employee1>();
	
	public EmployeeController()
	{
		employee.add(new Employee1(1,"hithu","tech",80000,25));
		employee.add(new Employee1(2,"barbie","pink",90000,35));	
		employee.add(new Employee1(3,"ken","blue",60000,15));
	}
	
	@PostMapping("/employee")
	
	public String addEmployee(@RequestBody Employee1 employee1)
		{
			employee.add(employee1);
			return "Employee added successfully";
		}

	
	@PostMapping("/getemployee")
		public ArrayList<Employee1> getAllEmployees()
		{

			return employee;
		}
	
	
}
