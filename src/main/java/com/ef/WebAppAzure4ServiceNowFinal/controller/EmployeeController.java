package com.ef.WebAppAzure4ServiceNowFinal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ef.WebAppAzure4ServiceNowFinal.object.Employee;
import com.ef.WebAppAzure4ServiceNowFinal.repository.EmployeeRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
public class EmployeeController {

	private final EmployeeRepository repository;

	EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/employees")
	List<Employee> getAll() {
		return (List<Employee>) repository.findAll();
	}

	@GetMapping("/getemployeesbyid/{id}")
	Optional<Employee> getById(@PathVariable int id) {
		return repository.findById(id);
	}
	
	@GetMapping("/testazure")
	String getAzureTest(@PathVariable int id) {
		return "sono online su azure";
	}
}