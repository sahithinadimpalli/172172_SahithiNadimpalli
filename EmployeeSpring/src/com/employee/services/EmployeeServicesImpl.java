package com.employee.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.dao.EmployeeMapper;
import com.employee.pojo.Employee;

public class EmployeeServicesImpl implements EmployeeServices {
	ApplicationContext c = new ClassPathXmlApplicationContext("employee.xml");
	EmployeeDaoImpl ed = (EmployeeDaoImpl) c.getBean("edao");

	@Override
	public boolean addEmp(Employee e) {

		ed.insert(e);
		return true;
	}

	public boolean removeEmp(Employee e) {

		ed.delete(e);
		return true;
	}

	public String getMaxSal() {
		List<Employee> l=ed.getAll();
		Integer maxSal=l.stream().map(e->e.getSal()).max((x,y)->x.compareTo(y)).get();
		System.out.println(maxSal);
		return null;
	}

	public String getMinSal() {
		List<Employee> l=ed.getAll();
		Integer minSal=l.stream().map(e->e.getSal()).min((x,y)->x.compareTo(y)).get();
		System.out.println(minSal);
		return null;
	}

}
