package com.lti.core.services;

import java.util.List;

import com.lti.core.entities.Data;

import com.lti.core.exception.EmpException;

public interface DataService {
	public List<Data> getAllEmps() throws EmpException;
/*	public Employee getEmployeeDetails(int empId) throws EmpException;
	public int joinNewEmployee(Employee emp) throws EmpException;*/
	}
