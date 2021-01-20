package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.dao.Employee;
import com.demo.service.EmployeeService;

@SpringBootApplication
public class EmprecordsApplication implements CommandLineRunner{

	
	@Autowired
	private EmployeeService empService;

	
	public static void main(String[] args) {
		SpringApplication.run(EmprecordsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		empService.save(new Employee("raj", 33));
//		empService.save(new Employee("ekta", 30));
//		empService.save(new Employee("gunika", 10));
//		empService.save(new Employee("keshav", 5));		
	}

}
