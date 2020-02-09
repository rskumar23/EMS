package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}
	

}
