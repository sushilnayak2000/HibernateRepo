package com.hibernate.test;

import com.hibernate.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by sushilnayak2000 on 9/17/2017.
 */
public class DeleteTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("product.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Product product = (Product)session.load(Product.class, new Integer(10001));
        Transaction transaction = session.beginTransaction();
        session.delete(product);
        transaction.commit();
        System.out.println("Objects deleted successfully!!!");
        session.close();
        sessionFactory.close();
    }
}
