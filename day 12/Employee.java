package com.telstra.restcrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
//import
import lombok.NoArgsConstructor;


import com.telstra.restcrud.repository.EmployeeRepository;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table

public class Employee {
	
	@Id
	private int id;
	private String name;
	private String dept;
	private int salary;
	private int age;
}
