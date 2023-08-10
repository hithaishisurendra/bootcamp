package com.telstra.restcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telstra.restcrud.model.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

}
