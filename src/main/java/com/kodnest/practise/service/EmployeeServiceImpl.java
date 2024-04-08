package com.kodnest.practise.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.practise.entity.Employee;
import com.kodnest.practise.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeRepository emprep;
	
	
	@Override
	public List<Employee> findAll() {
		 return emprep.findAll();
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> fid = emprep.findById(id);
		return fid.get();
	}

	@Override
	public Employee save(Employee theEmployee) {
		return emprep.save(theEmployee);
	}

	@Override
	public Employee update(Employee theEmployee) {
		return emprep.save(theEmployee);
	}

	@Override
	public void deleteEmpById(int id) {
		emprep.deleteById(id);

	}

}
