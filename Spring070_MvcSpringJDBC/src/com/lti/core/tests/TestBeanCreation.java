package com.lti.core.tests;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.core.entities.Employee;
import com.lti.core.services.EmpService;



public class TestBeanCreation {

		public static void main(String args[])
		{
	ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
	EmpService service = ctx.getBean("empService",EmpService.class);
	
	try {
//	List <Employee>empList =service.getAllEmps();
//		for(Employee emp : empList) {
//	System.out.println(emp);
//		}
		
//		Employee emp = service.getEmployeeDetails(150);
//		System.out.println(emp);
	
		Employee emp = new Employee();
		emp.setEmpid(300);
		emp.setFirstname("Shantanu");
		emp.setLastname("Bobde");
		emp.setEmail("shantanubobde@gmail.com");
		emp.setJobId("AC_ACCOUNT");
		emp.setSalary(2000);
		java.util.Date dt = new java.util.Date();// converting util date to sql date for bringing system date
		emp.setHireDate(new Date(dt.getTime()));
		
		int val=service.joinNewEmployee(emp);
		System.out.println(val);
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	ConfigurableApplicationContext cctx= (ConfigurableApplicationContext) ctx;
	cctx.close();// to bring destroy on screen
}
}
