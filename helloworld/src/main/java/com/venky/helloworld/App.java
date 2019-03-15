package com.venky.helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pojo.Employee;
import com.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory factory =new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Student s=factory.getBean(Student.class);
        Employee e= factory.getBean(Employee.class);
        
        System.out.println(e.getEmpName());
      System.out.println(s.getId());
    }
}
