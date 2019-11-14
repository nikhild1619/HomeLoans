package com.lti.core.services;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lti.core.daos.EmpDao;
import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;

@Service("empService")
@Scope("singleton")
@Lazy(true)
public class EmpServiceImpl implements EmpService {

	/*The initialization iimposes implementation of afterPropertiesSet()
	 * Spring container calls  this method after injections.
	 * purpose of the method
	 *   to ensure spring side initialization
	 *   to validate spring configuration*/
	public EmpServiceImpl()
	{
		System.out.println("Dao");
	}
	
	//field Injection
	//@Autowired // searches by bean  of type EmpDao.
	//@Disposible foe des
	@Resource (name="empDao")//it is doing by type injection
	private EmpDao empDao;
	
	
	
	@Override
		public List<Employee> getAllEmps() throws EmpException {
			return empDao.getAllEmps();
		}

	


	@Override
	public Employee getEmployeeDetails(int empid) throws EmpException {
		 
		return empDao.getEmpOnId(empid);
	}




	@Override
	public int joinNewEmployee(Employee emp) throws EmpException {
		// TODO Auto-generated method stub
		return empDao.insertNewEmployee(emp);
	}
	
}
