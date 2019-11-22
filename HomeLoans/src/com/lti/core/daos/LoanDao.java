package com.lti.core.daos;

import java.util.*;

import com.lti.core.entities.Data;

import com.lti.core.exception.EmpException;

public interface LoanDao {
	public List<Data> getAllEmps() throws EmpException;
	//public Employee getEmpOnId(int empId) throws EmpException;
	//public int insertNewEmployee(Employee emp) throws EmpException;
}