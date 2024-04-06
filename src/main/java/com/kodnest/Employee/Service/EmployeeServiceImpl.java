package com.kodnest.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.Employee.DAO.EmployeeDAO;
import com.kodnest.Employee.Entity.Employee;

import jakarta.transaction.Transactional;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeDAO empdao;
	
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO empdao) {
		this.empdao=empdao;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return empdao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return empdao.findById(id);
	}

	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		return empdao.save(theEmployee);
	}

	@Override
	@Transactional
	public Employee update(Employee theEmployee) {
		return empdao.save(theEmployee);
	}

	@Override
	@Transactional
	public void delete(int id) {
		empdao.delete(id);	
	}

}
