package com.cg.Assign89;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Square implements InitializingBean,DisposableBean {
	private Points pointA;
	private Points pointB;
	private Points pointC;
		/* private ApplicationContext context = null; */

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
	public void afterPropertiesSet() throws Exception {
		System.out.println("intializing beans   init method called  ");
		
	}

	
	@PostConstruct
	public void myInit()
	{
		System.out.println("my init metod called for Square ");
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method is called  ");
		
	}
	public void cleanup()
	{
		System.out.println("cleanup metod called for Square ");
	}

}
