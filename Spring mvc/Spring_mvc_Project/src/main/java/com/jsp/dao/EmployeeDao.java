package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.dto.Employee;

@Repository
public class EmployeeDao
{
	@Autowired
	EntityManager  em;
	
	@Autowired
	EntityTransaction et;
	
	public void insertValues(Employee emp)
	{
		et.begin();
		em.persist(emp);
		et.commit();
		
	}
	
	public Employee getEmployee(int id)
	{
		Employee e = em.find(Employee.class,id);
		return e;
	}
	
	
}
