package com.mindtree.dao;

import java.util.List;
import java.util.Set;

import com.mindtree.entity.Employee;

public interface EmployeeDao
{
	 public String createEmploye(Employee employee);
	 List<Employee> getAllDetails();
	Employee getbyid(Long id);
	String deleteById(Long id);
	String Update(Employee employee);
		
		
}
