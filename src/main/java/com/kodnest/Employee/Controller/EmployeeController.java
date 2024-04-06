package com.kodnest.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.Employee.Entity.Employee;
import com.kodnest.Employee.Service.EmployeeService;

@RestController
@RequestMapping("/empapi")
public class EmployeeController {

	@Autowired
	EmployeeService empser;
	
	@Autowired
	public EmployeeController(EmployeeService empser) {
		this.empser=empser;
	}
	
	
	@GetMapping("/getallEmployees")
	public List<Employee> findAllEmployee(){
		return empser.findAll();
	}
	
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee saveemp) {
		return empser.save(saveemp);
	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee updaeemp) {
		return empser.update(updaeemp);
	}
	
	
	@GetMapping("/getEmpById/{empid}")
	public Employee getEmployeeById(@PathVariable int empid) {
		return empser.findById(empid);
	}
	
	
	@DeleteMapping("/deleteEmployee/{empid}")
	public String deleteEmployee(@PathVariable int empid) {
		empser.delete(empid);
		return "Delete Success";
	}
	
	
	
}
