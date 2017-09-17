package com.hibernate.test;

import com.hibernate.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by sushilnayak2000 on 9/17/2017.
 */
public class UpdateTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("product.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Product product = (Product)session.load(Product.class, new Integer(10003));
        System.out.println(product.getProductId()+"\t"+product.getProductName()+"\t"+product.getPrice());
        product.setProductName("Washing Machine");
        product.setPrice(12500.35);
        Transaction transaction = session.beginTransaction();
        session.update(product);
        transaction.commit();
        Product product1 = (Product)session.load(Product.class, new Integer(10003));
        System.out.println(product1.getProductId()+"\t"+product1.getProductName()+"\t"+product1.getPrice());
        session.close();
        sessionFactory.close();
    }
}
