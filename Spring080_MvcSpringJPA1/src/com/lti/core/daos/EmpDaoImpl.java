package com.lti.core.daos;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.entities.Employee;
import com.lti.core.exception.EmpException;

@Repository("empDao")
public class EmpDaoImpl implements EmpDao {
	
@PersistenceContext  
private EntityManager manager;

	@Override
	public List<Employee> getAllEmps() throws EmpException  {
		Query qry=manager.createQuery("from Personal");
		List<Employee> empList=qry.getResultList();
		return empList;
	}

	@Override
	public int insertNewUser(Employee epm) throws EmpException {
		manager.persist(epm);
		return 1;
	}

	
	
	
		
//
//	@Override
//	public int insertNewEmployee(Employee emp) throws EmpException {
//		String qry="INSERT INTO employees (employee_Id,first_Name,last_Name,job_Id,hire_date,salary,email) VALUES(?,?,?,?,?,?,?)";
//	   Object[] params= {emp.getEmployeeId(),emp.getFirstName(),emp.getLastName(),emp.getJobId(),emp.getHireDate(),emp.getSalary(),emp.getEmail()};
//	   int returnVal =jTemp.update(qry,params);
//	   return returnVal;
//	}
}
/*class RowMapperFactory implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		int empid=rs.getInt("userid");
		String firstName=rs.getString("fname");
		String mname=rs.getString("mname");
		String lastName=rs.getString("lname");
		long phone=rs.getInt("phone");
		String dob=rs.getString("dob");
		String gender=rs.getString("gender");
		String nation =rs.getString("nation");
		String aadhar=rs.getString("aadhar");
		String pan=rs.getString("pan");
		
		Employee emp=new Employee();
		
		emp.setFirstname(firstName);
		emp.setMname(mname);
		emp.setLname(lastName);
		emp.setPhone(phone);
		emp.setDob(dob);
		emp.setGender(gender);
		emp.setNation(nation);
		emp.setAadhar(aadhar);
		emp.setPan(pan);
		
		return emp;
	}
}*/