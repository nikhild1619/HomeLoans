package com.lti.web.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


import com.lti.core.entities.Employee;
import com.lti.core.exception.EmpException;
import com.lti.core.services.EmpService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//http://localhost:8082/Spring080_MvcSpringJPA/home.hr
//http://localhost:8082/Spring080_MvcSpringJPA/empList.hr

@Controller
public class EmpController {
	
	
	@Autowired
	private EmpService service;
	
	@RequestMapping("home.hr")
	public ModelAndView getHomePage() {
		String company="Larsen and Toubro Information Services";
		String jspName="HomePage";
		
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("companyName",company);
		mAndV.setViewName(jspName);
		return mAndV;
	}
	@RequestMapping("empList.hr")                                            
	public ModelAndView getEmpList(HttpServletRequest req,HttpServletResponse res,HttpSession session) throws EmpException {
		List<Employee> empList=service.getAllEmps(); 
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
	
	@RequestMapping(path="registration.hr",method=RequestMethod.GET)
	public String adduserpage(){
		return "Registration";
	}
	
	//http://localhost:8081/Spring080_MvcSpringJPA1/registration.hr
	@RequestMapping(path="registration.hr",method=RequestMethod.POST)
	public String adduser(@RequestParam("userId") int userId,@RequestParam("firstname") String firstname, @RequestParam("middlename") String middlename,@RequestParam("lastname") String lastname,@RequestParam("contactnumber") long contactnumber,@RequestParam("dateofbirth") String dateofbirth,@RequestParam("gender") String gender,@RequestParam("nationality") String nationality,@RequestParam("aadharnumber") String aadharnumber,@RequestParam("pass") String pass ) throws EmpException
	{
		Employee epm = new Employee();
		
		epm.setFirstname(firstname);
		epm.setUserId(userId);
		epm.setMname(middlename);
		epm.setLname(lastname);
		epm.setPhone(contactnumber);
		epm.setDob(dateofbirth);
		epm.setGender(gender);
		epm.setNation(nationality);
		epm.setAadhar(aadharnumber);
		epm.setPan(pass);
		
		boolean result = service.adduser(epm);
		if(result){
			return "redirect:empList.hr";
		}
		return "error";
	
	}

	
	
}
