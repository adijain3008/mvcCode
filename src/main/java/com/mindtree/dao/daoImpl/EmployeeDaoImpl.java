package com.mindtree.dao.daoImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	 private HibernateTemplate hibernateTemplate;
	@Transactional(readOnly=false)
	public String createEmploye(Employee employee) {
             hibernateTemplate.save(employee);
             return "Inserted successfully";
        }
        
	

	@Override
	
	public List<Employee> getAllDetails()
	{
		/*String query = "select * from Employee";*/
		
		List<Employee> empList =hibernateTemplate.loadAll(Employee.class);
		
		return empList;
	}

	

	@Override
	public Employee getbyid(Long id) {
		Employee employee=hibernateTemplate.get(Employee.class, id);
		return employee;
	}
    @Transactional(readOnly=false)
	@Override
	public String deleteById(Long id) 
	{
		hibernateTemplate.delete(getbyid(id));
		return "deleted successfully";
	}
	@Transactional(readOnly=false)
	@Override
	public String Update(Employee employee)
	{
		hibernateTemplate.update(employee);
		return "updated successfully";
	}

	
	 public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	        this.hibernateTemplate = hibernateTemplate;
	    }



	
}
