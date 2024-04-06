package com.kodnest.Employee.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodnest.Employee.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	
	@Autowired
	EntityManager entman;
	@Autowired
	public EmployeeDAOImpl(EntityManager entman) {
		this.entman=entman;
	}
	

	// Finding All Employee
	@Override
	public List<Employee> findAll() {
		TypedQuery Query = entman.createQuery("from Employee" , Employee.class);
		List<Employee> emplist = Query.getResultList();
		return emplist;
	}

	
	// Save Employee
	@Override
	public Employee save(Employee theEmployee) {
		Employee saveemp = entman.merge(theEmployee);
		return saveemp;
	}

//	@Override
//	public Employee update(Employee theEmployee) {
//		
//		return null;
//	}

	
	// Find Employee By ID
	@Override
	public Employee findById(int id) {
//		return entman.getReference(Employee.class, id);
		return entman.find(Employee.class, id);
		
	}

	
	//Delete Employee By ID
	@Override
	public void delete(int id) {
	 Employee delete =entman.getReference(Employee.class, id);
	 entman.remove(delete);
		
	}

}
