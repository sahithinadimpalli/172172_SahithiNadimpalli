package com.cg.Reflection;

import java.lang.reflect.*;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class c=Class.forName("com.cg.Reflection.Test");
Test t=(Test)c.newInstance();
Method m=c.getDeclaredMethod("show");
m.setAccessible(true);
m.invoke(t);
System.out.println("The name of class is " + 
        c.getName()); 
	}
	
		
	}


