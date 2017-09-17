package com.hibernate.test;

import com.hibernate.model.Cheque;
import com.hibernate.model.CreditCard;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by BADAL on 9/17/2017.
 */
public class TablePerConcreteClassTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("paymentTablePerConcreteClass.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        CreditCard creditCard = new CreditCard();
        creditCard.setPaymentId(1005);
        creditCard.setAmount(24000.55);
        creditCard.setCreditCardType("AMEX");
        Cheque cheque = new Cheque();
        cheque.setPaymentId(1015);
        cheque.setAmount(23000.75);
        cheque.setChequeType("HDFC");
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
