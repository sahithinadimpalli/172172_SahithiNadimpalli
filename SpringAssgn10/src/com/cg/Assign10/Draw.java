package com.cg.Assign10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Assign10.xml");
		Square s=(Square) context.getBean("square");
		s.draw();
	}

}
