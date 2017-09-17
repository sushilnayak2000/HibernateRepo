package com.hibernate.test;

import com.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by sushilnayak2000 on 9/17/2017.
 */
public class InsertStudentTest {
    public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.configure("student.cfg.xml");
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    Session session = sessionFactory.openSession();
    Student student1 = new Student();
    student1.setRollno(101);
    student1.setStudentName("Akshay");
    student1.setAddress("Park Street");
    Student student2 = new Student();
    student2.setRollno(102);
    student2.setStudentName("Vimal");
    student2.setAddress("Park Wayz");
    Transaction transaction = session.beginTransaction();
    session.save(student1);
    session.save(student2);
    transaction.commit();
    session.flush();
    System.out.println("Objects saved successfully!!!");
    session.close();
    sessionFactory.close();
}

}
