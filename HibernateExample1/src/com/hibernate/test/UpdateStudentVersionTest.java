package com.hibernate.test;

import com.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by sushilnayak2000 on 9/17/2017.
 */
public class UpdateStudentVersionTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("student.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Student student = (Student) session.load(Student.class, new Integer(101));
        System.out.println(student.getRollno()+"\t"+student.getStudentName()+"\t"+student.getAddress());
        student.setStudentName("Akash");
        student.setAddress("Alaska");
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
