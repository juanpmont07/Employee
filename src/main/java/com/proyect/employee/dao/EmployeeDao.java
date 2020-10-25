package com.proyect.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyect.employee.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long>{
	
}
