package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Employee;

public interface EmployeeService
{
	 public String createEmployee(Employee employee);
	 public List<Employee> getAllDetails();
	 public Employee getbyid(Long id);
	 String deleteById(Long id);
	 String Update(Employee employee);
	
}
