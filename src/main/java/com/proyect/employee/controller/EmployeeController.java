package com.proyect.employee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.employee.model.Employee;
import com.proyect.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})

public class EmployeeController {

	@Autowired
	EmployeeService emploServ;
	
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> save(HttpServletRequest request,
			@RequestBody Employee emp) {	
		emploServ.create(emp);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	@PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> update(HttpServletRequest request,
			@RequestBody Employee emp) {	
		emploServ.update(emp);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	@PostMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> delete(HttpServletRequest request,
			@RequestBody Employee empleado) {	
		emploServ.delete(empleado);
		return new ResponseEntity<>(empleado, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAll(HttpServletRequest request) {	
		
		return new ResponseEntity<>(emploServ.getAllEmployee(), HttpStatus.OK);
	}
}
