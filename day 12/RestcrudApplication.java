package com.telstra.restcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;


//@ComponentScan("com.telstra.restcrud.repository")
@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })
public class RestcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestcrudApplication.class, args);
	}

}
