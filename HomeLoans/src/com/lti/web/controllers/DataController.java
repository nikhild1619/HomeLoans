package com.lti.web.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.Data;

import com.lti.core.exception.EmpException;
import com.lti.core.services.DataService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//http://localhost:8082/HomeLoans/home.hr
//http://localhost:8082/Spring080_MvcSpringJPA/empList.hr
@Controller
public class DataController {
	@Autowired
	private DataService service;
	@RequestMapping("home.hr")
	public ModelAndView getHomePage() {
		String company="Home Loans";
		String jspName="HomePage";
		
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("Show Details",company);
		mAndV.setViewName(jspName);
		return mAndV;
	}
	@RequestMapping("empList.hr")                                            
	public ModelAndView getEmpList(HttpServletRequest req,HttpServletResponse res,HttpSession session) throws EmpException {
		List<Data> empList=service.getAllEmps(); 
		String jspName="EmpList";
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("empList",empList);
		mAndV.setViewName(jspName);
		return mAndV;
	}
	
/*	@RequestMapping("empDetails.hr")
	public ModelAndView getEmpDetails(@RequestParam("id")int empId) throws EmpException {
		System.out.println(empId);
		Employee emp=service.getEmployeeDetails(empId); 
		String jspName="EmpDetails";
		
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("emp",emp);
		mAndV.setViewName(jspName);
		return mAndV;
}*/
}
