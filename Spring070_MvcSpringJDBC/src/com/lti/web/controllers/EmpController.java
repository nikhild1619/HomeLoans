package com.lti.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;
import com.lti.core.services.EmpService;
//http://localhost:9090/Spring070_MvcSpringJDBC/home.hr
//http://localhost:9090/Spring070_MvcSpringJDBC/empList.hr
//http://localhost:9090/Spring070_MvcSpringJDBC/empDetails.hr?id=300
@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;
	@RequestMapping("home.hr")
	public ModelAndView getHomePage() {
		String company="Larson And Toubro Information Services";
		String jspName="HomePage";

		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("companyName", company);
		mAndV.setViewName(jspName);
		return mAndV;
		
}
@RequestMapping("empList.hr")
public ModelAndView getEmpList() throws EmpException {

	List<Employee> empList = service.getAllEmps();
		
		String jspName="EmpList";
		
	
	ModelAndView mAndV = new ModelAndView();
	mAndV.addObject("empList", empList);
	mAndV.setViewName(jspName);
	return mAndV;
}
	
	
	@RequestMapping("empDetails.hr")
	public ModelAndView getEmpDetails(@RequestParam("id") int empid) throws EmpException {
		System.out.println(empid);
		Employee emp = service.getEmployeeDetails(empid);
	
		String jspName="EmpDetails";
		
		
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("emp", emp);
		mAndV.setViewName(jspName);
		
		
		return mAndV;
}}