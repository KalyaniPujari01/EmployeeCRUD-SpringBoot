package com.kodnest.Employee.DAO;

import java.util.List;

import com.kodnest.Employee.Entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	public Employee save(Employee theEmployee);
//	public Employee update(Employee theEmployee);
	public Employee findById(int id);
	public void delete(int id);
	
}
