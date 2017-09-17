package com.hibernate.test;

import com.hibernate.model.Cheque;
import com.hibernate.model.CreditCard;
import com.hibernate.model.Payment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by BADAL on 9/17/2017.
 */
public class TablePerClassTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("payment.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        CreditCard creditCard = new CreditCard();
        creditCard.setPaymentId(1001);
        creditCard.setAmount(25000.55);
        creditCard.setCreditCardType("VISA");
        Cheque cheque = new Cheque();
        cheque.setPaymentId(1002);
        cheque.setAmount(20000.75);
        cheque.setChequeType("ICICI");
        Transaction transaction = session.beginTransaction();
        session.save(creditCard);
        session.save(cheque);
        transaction.commit();
        session.flush();
        System.out.println("Objects saved successfully!!!");
        session.close();
        sessionFactory.close();
    }
}
