package com.mindtree.hibernateTemplate;

import java.util.Scanner;

import com.mindtree.entity.Employee;
import com.mindtree.service.serviceImpl.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
    	EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
    	try(Scanner sc = new Scanner(System.in);)
		{
		
		System.out.println("Hibernate Template");
		int flag = 0;
		do {
			System.out.println("Menu: \n1. Insert Employee \n2. Display Details \n3. Get by id \n4. Delete by Id \n5. Update \n6. EXIT \n Enter the choice");
			int ch = sc.nextInt();
			Employee employee=new Employee();
			switch (ch) {
			case 1:
				System.out.println("Enter the id");
				employee.setId(sc.nextLong());
				System.out.println("Enter the name");
				employee.setName(sc.next());
				System.out.println("Enter the Contact");
				employee.setContact(sc.next());
			System.out.println(employeeServiceImpl.createEmployee(employee));
				break;
			
			case 2:
				System.out.println(employeeServiceImpl.getAllDetails());
				break;
				
			case 3:
				System.out.println("Enter employee id");
				Long id =sc.nextLong();
				System.out.println(employeeServiceImpl.getbyid(id));
				break;
				
			case 4:
				System.out.println("Enter employee id");
				Long id1 =sc.nextLong();
				System.out.println(employeeServiceImpl.deleteById(id1));
				break;
				
			case 5:
				System.out.println("Enter the id");
				employee.setId(sc.nextLong());
				System.out.println("Enter the name");
				employee.setName(sc.next());
				System.out.println("Enter the Contact");
				employee.setContact(sc.next());
			    System.out.println(employeeServiceImpl.Update(employee));
				break;
				
				
			case 6:
				flag = 1;
				break;
			}
		} while (flag == 0);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

    }
}
