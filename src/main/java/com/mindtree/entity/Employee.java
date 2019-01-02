package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	private long id;
    private String name;
    private String contact;
    
	public Employee(long id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Employee() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
    
    
}
