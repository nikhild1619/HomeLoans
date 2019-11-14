package com.lti.core.daos;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;


@Repository("empDao")

@Lazy(true)//by default sigleton bean is @Lazy False i.e eager.
public class EmpDaoImpl implements EmpDao {

//	@Autowired
//	private DataSource datasource;
	
	@Autowired
	private JdbcTemplate jTemp;
	
	public EmpDaoImpl()
	{
			System.out.println("DAO CREATED");
	}
	
	@Override
	public List<Employee> getAllEmps() throws EmpException {
		List<Employee> emplist=null;
		
//		List<Map<String,Object>> mapList=jTemp.queryForList("SELECT employee_id,first_name FROM employees");
//	
//		for(Map<String,Object> mapRec:mapList) {
//			BigDecimal bdempId=(BigDecimal)mapRec.get("employee_id");
//			int empid = bdempId.intValue();
//			
////			String firstName=(String) mapRec.get("first_name");
////			
////			Employee emp=new Employee(empid,firstName);
////			emplist.add(emp);
			
		String qry="SELECT employee_id,first_name,last_name,job_id,hire_date,salary,email FROM employees";
		emplist=jTemp.query(qry, new RowMapperFactory());
		
		return emplist;
	}

	@Override
	public Employee getEmpOnId(int empId) throws EmpException {
		
		String qry="SELECT employee_id,first_name,last_name,job_id,hire_date,salary,email FROM employees WHERE employee_id=?";
		Employee emp = jTemp.queryForObject(qry, new RowMapperFactory(), empId);
		
		return emp;
	}

	@Override
	public int insertNewEmployee(Employee emp) throws EmpException {
		String qry = "INSERT into employees (employee_id,first_name,last_name,job_id,hire_date,salary,email) VALUES(?,?,?,?,?,?,?)";
		// object type array to accommodate various values or different types of data.
		Object[] params = {emp.getEmpid(),emp.getFirstname(),emp.getLastname(),emp.getJobId(),emp.getHireDate(),emp.getSalary(),emp.getEmail()};
		
		int returnVal =jTemp.update(qry,params);
		return returnVal;
	}
	

}

class RowMapperFactory implements RowMapper <Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		int empid = rs.getInt("employee_id");
		//int empid = bdempId.intValue();
		
		String empId=rs.getString("employee_id");
		String firstName=rs.getString("first_name");
		String lastname=rs.getString("last_name");
		String jobId=rs.getString("job_id");
		Date hireDate=rs.getDate("hire_date");
		Float salary=rs.getFloat("salary");
		String email=rs.getString("email");
		
		
		Employee emp=new Employee();
		emp.setEmpid(empid);
		emp.setFirstname(firstName);
		emp.setLastname(lastname);
		emp.setJobId(jobId);
		emp.setHireDate(hireDate);
		emp.setSalary(salary);
		emp.setEmail(email);
		
		return emp;
	}

	
	}

