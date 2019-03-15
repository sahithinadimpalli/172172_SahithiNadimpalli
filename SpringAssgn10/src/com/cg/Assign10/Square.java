package com.cg.Assign10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Square implements ApplicationContextAware,BeanNameAware {
	private Points pointA;
	private Points pointB;
	private Points pointC;

	private ApplicationContext context = null; 
		

	public Points getPointA() {
		return pointA;
	}

	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}

	public Points getPointB() {
		return pointB;
	}

	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}

	public Points getPointC() {
		return pointC;
	}

	public void setPointC(Points pointC) {
		this.pointC = pointC;
	}
	public void draw()
	{
	System.out.println("Point A=("+ getPointA().getX()+", "+getPointA().getY()+")");
	System.out.println("Point B=("+ getPointB().getX()+", "+getPointB().getY()+")");
	System.out.println("Point C=("+ getPointC().getX()+", "+getPointC().getY()+")");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is :"+beanName);
	}
}
