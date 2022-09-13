package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@Component
@ComponentScan
@EnableAutoConfiguration

public class DemoApplicationTests implements CommandLineRunner{
	
	@Autowired
	EmployeeOperationsImpl operations;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationTests.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee james = new Employee();
		james.setId(100);
		james.setName("James Cooper");
		james.setAuthor("Ibochouba");
		operations.writeObject(james);
		
		System.out.println("Emloyee Name is :: "+ james.getName());
		System.out.println("Author Name is :: "+ james.getAuthor());
	}
}
