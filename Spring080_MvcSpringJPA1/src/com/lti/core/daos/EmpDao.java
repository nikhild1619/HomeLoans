package com.lti.core.daos;

import java.util.*;

import com.lti.core.entities.Employee;
import com.lti.core.exception.EmpException;

public interface EmpDao {
	public List<Employee> getAllEmps() throws EmpException;
	//public Employee getEmpOnId(int empId) throws EmpException;
	//public int insertNewEmployee(Employee emp) throws EmpException;
	public int insertNewUser(Employee epm) throws EmpException;
}