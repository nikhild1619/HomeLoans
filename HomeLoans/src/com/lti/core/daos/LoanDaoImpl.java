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
import org.springframework.stereotype.Repository;

import com.lti.core.entities.Data;

import com.lti.core.exception.EmpException;

@Repository("LoanDao")
public class LoanDaoImpl implements LoanDao {
	
@PersistenceContext  
private EntityManager manager;

	@Override
	public List<Data> getAllEmps() throws EmpException  {
		Query qry=manager.createQuery("from Personal");
		List<Data> empList=qry.getResultList();
		return empList;
	}

/*	@Override
	public Employee getEmpOnId(int empId) throws EmpException {
		String qry ="Select employee_Id,first_Name,last_Name,job_Id,hire_date,salary,email FROM employees where employee_id=?";
		Employee emp = jTemp.queryForObject(qry,new RowMapperFactory(), empId);
		
		return emp;
	}

	@Override
	public int insertNewEmployee(Employee emp) throws EmpException {
		String qry="INSERT INTO employees (employee_Id,first_Name,last_Name,job_Id,hire_date,salary,email) VALUES(?,?,?,?,?,?,?)";
	   Object[] params= {emp.getEmployeeId(),emp.getFirstName(),emp.getLastName(),emp.getJobId(),emp.getHireDate(),emp.getSalary(),emp.getEmail()};
	   int returnVal =jTemp.update(qry,params);
	   return returnVal;
	}	*/
}
class RowMapperFactory implements RowMapper<Data>{

	@Override
	public Data mapRow(ResultSet rs, int arg1) throws SQLException {
		int empid=rs.getInt("userid");
		String firstName=rs.getString("fname");
		String mname=rs.getString("mname");
		String lastName=rs.getString("lname");
		long phone=rs.getInt("phone");
		Date dob=rs.getDate("dob");
		String gender=rs.getString("gender");
		String nation =rs.getString("nation");
		String aadhar=rs.getString("aadhar");
		String pan=rs.getString("pan");
		
		Data emp=new Data();
		emp.setUserid(empid);
		emp.setFname(firstName);
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
}