package com.telstra.restcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.restcrud.model.Employee;
import com.telstra.restcrud.repository.EmployeeRepository;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee)
	{
		employeeRepository.save(employee);
		return "emp added";
	}
	
	
	@GetMapping("/employee")
	public List<Employee> viewEmployee()
	{
		return employeeRepository.findAll();
	}
}
