package com.hibernate.test;

import com.hibernate.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by sushilnayak2000 on 9/17/2017.
 */
public class SelectTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("product.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Product product = (Product)session.load(Product.class, new Integer(10001));
        System.out.println(product.getProductId()+"\t"+product.getProductName()+"\t"+product.getPrice());
        session.close();
        sessionFactory.close();
    }
}
