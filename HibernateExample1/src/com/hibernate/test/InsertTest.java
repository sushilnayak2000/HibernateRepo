package com.hibernate.test;

import com.hibernate.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by sushilnayak2000 on 9/17/2017.
 */
public class InsertTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("product.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Product product1 = new Product();
        product1.setProductId(10001);
        product1.setProductName("TV");
        product1.setPrice(25000.75);
        Product product2 = new Product();
        product2.setProductId(10002);
        product2.setProductName("MOBILE");
        product2.setPrice(15000.95);
        Transaction transaction = session.beginTransaction();
        session.save(product1);
        session.save(product2);
        transaction.commit();
        System.out.println("Objects saved successfully!!!");
        session.close();
        sessionFactory.close();
    }
}
