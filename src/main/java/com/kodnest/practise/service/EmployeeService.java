package com.kodnest.practise.service;

import java.util.List;

import com.kodnest.practise.entity.Employee;

public interface EmployeeService {

	
	public List<Employee> findAll();
	public Employee findById(int id);
	public Employee save(Employee theEmployee);
	public Employee update(Employee theEmployee);
	public void deleteEmpById(int id);
}
