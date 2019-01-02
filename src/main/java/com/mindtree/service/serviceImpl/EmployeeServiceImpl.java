package com.mindtree.service.serviceImpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.dao.daoImpl.EmployeeDaoImpl;
import com.mindtree.entity.Employee;
import com.mindtree.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
     EmployeeDao employeeDao=(EmployeeDao) context.getBean("empl1");

	public String createEmployee(Employee employee) 
	{
		return employeeDao.createEmploye(employee);

	}

	@Override
	public List<Employee> getAllDetails() {
		return employeeDao.getAllDetails();
	}

	@Override
	public Employee getbyid(Long id)
	{
		return employeeDao.getbyid(id);
	}

	@Override
	public String deleteById(Long id) 
	{
		return employeeDao.deleteById(id);
	}

	@Override
	public String Update(Employee employee)
	{
		return employeeDao.Update(employee);
	}

}
