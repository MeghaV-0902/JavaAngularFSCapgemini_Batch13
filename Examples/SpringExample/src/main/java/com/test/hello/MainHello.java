package com.test.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHello
{
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("message.xml");
        hello h1 = (hello) ctx.getBean("abc");
        System.out.println(h1.getMessage());
    }
}
