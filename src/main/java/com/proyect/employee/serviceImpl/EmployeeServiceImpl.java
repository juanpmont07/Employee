package com.proyect.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.employee.dao.EmployeeDao;
import com.proyect.employee.model.Employee;
import com.proyect.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao emplDao;
	
	@Override
	public void create(Employee emp) {
		emplDao.save(emp);
		
	}

	@Override
	public void update(Employee emp) {
		emplDao.save(emp);
		
	}

	@Override
	public void delete(Employee emp) {
		emplDao.delete(emp);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return (List<Employee>) emplDao.findAll();
	}

}
