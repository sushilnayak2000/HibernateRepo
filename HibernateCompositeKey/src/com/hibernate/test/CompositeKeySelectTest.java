package com.hibernate.test;

import com.hibernate.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by BADAL on 9/17/2017.
 */
public class CompositeKeySelectTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("product.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Product p1 = new Product();
        p1.setProductId(10001);
        p1.setProductName("TV");
        Product product = (Product) session.load(Product.class, p1);
        System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getPrice());
        session.close();
        sessionFactory.close();
    }
}
