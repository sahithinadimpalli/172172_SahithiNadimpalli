package com.employee.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;
import com.employee.services.EmployeeServicesImpl;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=new Employee();
       // e.setEmpid(17217);
        //e.setEname("sahithi");
        //e.setJob("analyst");
        //e.setMgr(7427);
        //e.setSal(7000);
        //e.setComm(400);
       //e.setDeptno(10);
        
        EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
       //d.insert(e);
         // d.delete(e);
         // d.update(e);
        //  d.orderBy(e);
        //d.getMaxSal();  
      EmployeeServicesImpl ser=new EmployeeServicesImpl();
      //ser.addEmp(e);
      ser.getMaxSal();
    ser.getMinSal();
           /* List<Employee> list= d.orderBy();
         for(Employee e1:list)
       {      	 System.out.println(e1);       }
	}*/

}
}
