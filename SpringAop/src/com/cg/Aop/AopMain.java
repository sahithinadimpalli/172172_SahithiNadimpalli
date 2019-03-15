package com.cg.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.Aop.service.ShapeService;

public class AopMain {
public static void main(String[] args)
{
	 ApplicationContext ctx= new ClassPathXmlApplicationContext("aop.xml");
	 ShapeService shapeservice=ctx.getBean("ShapeService",ShapeService.class);
	 System.out.println(shapeservice.getCircle().getName());
}
}
