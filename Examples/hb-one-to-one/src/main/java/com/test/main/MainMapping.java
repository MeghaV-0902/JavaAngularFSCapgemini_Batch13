package com.test.main;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import com.test.model.Stock;
import com.test.model.StockDetail;

public class MainMapping {
    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration
                .buildSessionFactory(builder.build());
        return sessionFactory;
    }
    public static void main(String[] args) {
        System.out.println("Hibernate one to one (Annotation)");
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
String name;
name.
        Stock stock = new Stock();

        stock.setStockCode("10001");
        stock.setStockName("Agent");

        StockDetail stockDetail = new StockDetail();
        stockDetail.setCompName("Reynold");
        stockDetail.setCompDesc("Iso");
        stockDetail.setRemark("Good");
        stockDetail.setListedDate(new Date());

        stock.setStockDetail(stockDetail);
        stockDetail.setStock(stock);

        session.save(stock);
        session.getTransaction().commit();
        System.out.println("Inserting values into tables stock,stock details....");

        System.out.println("Done");
    }
}

