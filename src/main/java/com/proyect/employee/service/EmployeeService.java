package com.proyect.employee.service;

import java.util.List;

import com.proyect.employee.model.Employee;

public interface EmployeeService {

	public void create(Employee emp);
	
	public void update(Employee emp);
	
	public void delete(Employee emp);
	
	public List<Employee> getAllEmployee();
	
	
}
