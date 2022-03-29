package com.test.springconstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainTicket {

    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("ticket.xml");
        Ticket t1=(Ticket)context.getBean("ticket");
        t1.display();
    }
}
