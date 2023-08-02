package com.telstra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString

//@Data

public class Employee {
	
	int id;
	String name;
	String dept;
	
}
