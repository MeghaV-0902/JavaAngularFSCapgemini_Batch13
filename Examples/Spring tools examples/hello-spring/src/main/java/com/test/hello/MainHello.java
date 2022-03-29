package com.test.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHello 
{
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = (Hello)con.getBean("u");
		hello.display();
	
	}

}
