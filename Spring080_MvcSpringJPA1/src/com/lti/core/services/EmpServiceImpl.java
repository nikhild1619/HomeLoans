package com.lti.core.services;

import com.lti.core.entities.Employee;
import com.lti.core.exception.EmpException;
import java.util.*;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.daos.EmpDao;


@Transactional
@Service("empService")
public class EmpServiceImpl  implements EmpService {
	
	@Resource(name="empDao")
	private EmpDao empDao;

	@Override
	@Transactional(propagation=Propagation.NEVER)
	public List<Employee> getAllEmps() throws EmpException {
	return empDao.getAllEmps();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean adduser(Employee epm) throws EmpException {
		// TODO Auto-generated method stub
		int result = empDao.insertNewUser(epm);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
		}
	}}
	

	/*@Override
	public Employee getEmployeeDetails(int empId) throws EmpException {
		
		return empDao.getEmpOnId(empId);
	}

	@Override
	public int joinNewEmployee(Employee emp) throws EmpException {
		
		return empDao.insertNewEmployee(emp);
	}*/

	

	
	
	







