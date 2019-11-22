package com.lti.core.tests;

import java.sql.Date;
import java.text.SimpleDateFormat;
//import java.util.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lti.core.entities.Employee;
import com.lti.core.exception.EmpException;
import com.lti.core.services.EmpService;

public class TestBeanCreation {
	private static ConfigurableApplicationContext ctx;

	public static void main(String[] args) throws EmpException {		
		ctx = new ClassPathXmlApplicationContext("Spring.xml");
		EmpService service=ctx.getBean("empService",EmpService.class);
		
		//SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			/*	List<Employee> empList=service.getAllEmps();
for(Employee emp:empList)
{
			System.out.println(emp);
}
Employee emp= service.getEmployeeDetails(100);
			System.out.println(emp);*/
//		Employee emp=new Employee();
//		emp.setUserid(2);
//		emp.setFname("nikhil");
//		emp.setMname("kumar");
//		emp.setLname("dubey");
//		emp.setPhone(13221);
//		//emp.setDob(dateFormat.parse("16/02/1998"));
//		emp.setGender("male");
//		emp.setNation("india");
//		emp.setAadhar("354354");
//		emp.setPan("354354");
		
		/*	int val=service.joinNewEmployee(emp);
			System.out.println(val);*/
			
		}
}
