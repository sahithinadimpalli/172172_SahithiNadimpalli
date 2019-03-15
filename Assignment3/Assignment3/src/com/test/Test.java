package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.BankAccountController;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		BankAccountController controller=(BankAccountController)context.getBean("BankAccountBean");
		System.out.println(controller.getBalance(100));
		System.out.println(controller.getBalance(101));
		System.out.println("after----------------------------------------");
		System.out.println(controller.fundTransfer(100,101,1000));
		System.out.println(controller.getBalance(100));
		System.out.println(controller.getBalance(101));
		
		System.out.println(controller.deposit(100,100000));
		
		

	}

}
