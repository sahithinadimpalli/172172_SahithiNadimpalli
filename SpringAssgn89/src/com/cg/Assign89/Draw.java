package com.cg.Assign89;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {

	public static void main(String[] args) 
	 {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Assign89.xml");
		context.registerShutdownHook();
		Square s=(Square) context.getBean("square");
		s.draw();
	}

}
