package com.kodnest.practise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kodnest.practise.entity.Employee;
import com.kodnest.practise.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empser;
	
	
	
	
	public EmployeeController(EmployeeService empser) {
		this.empser = empser;
	}




	@GetMapping("/Employees")
	public String findAll(Model theModel){
		theModel.addAttribute("list", empser.findAll());
		return "employee";
	}
	
	@PostMapping("/saveEmployee")
	public Employee saveEmp(@RequestBody Employee theEmployee) {
		return empser.save(theEmployee);
	}
	
	
	
	
	
	
	
	
	
}
