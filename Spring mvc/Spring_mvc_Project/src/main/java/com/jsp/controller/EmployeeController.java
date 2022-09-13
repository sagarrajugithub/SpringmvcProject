package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeDao empdao;
	
	@RequestMapping("/emp")
	public  ModelAndView insertEmployee()
	{
		ModelAndView mv = new ModelAndView();
	    mv.addObject("employee", new Employee());//creating object
	    mv.setViewName("create.jsp");
	    return mv;
	}
	
	@RequestMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee)
	{
		empdao.insertValues(employee);
		return "``Employee Details Inserted``";
	}
	
	@RequestMapping("/search")
	public ModelAndView getEmployee()
	{
		ModelAndView mv = new ModelAndView();
	    mv.addObject("employee",new Employee());
	    mv.setViewName("Display.jsp");
	    return mv;
	}
	
	@RequestMapping("/get")
	public ModelAndView acceptId(@ModelAttribute Employee emp)
	{
		ModelAndView vm = new ModelAndView();
		Employee e = empdao.getEmployee(emp.getId());
		vm.addObject("employee",e);
		vm.setViewName("view.jsp");
		return vm;
		
	}
	
	
}
