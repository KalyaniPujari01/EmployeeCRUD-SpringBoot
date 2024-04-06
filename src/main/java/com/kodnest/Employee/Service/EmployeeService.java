package com.kodnest.Employee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodnest.Employee.Entity.Employee;

public interface EmployeeService {

	
	public List<Employee> findAll();
	public Employee findById(int id);
	public Employee save(Employee theEmployee);
	public Employee update(Employee theEmployee);
	public void delete(int id);
}
