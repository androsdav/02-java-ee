package com.adidyk.services;

import com.adidyk.pojo.Developer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class RunDeveloper {

    private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void addDeveloper(Developer developer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(developer);
        transaction.commit();
        session.close();
    }

    public void updateDeveloper(int id, String salary) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Developer developer = session.get(Developer.class, id);
        developer.setSalary(salary);
        session.update(developer);
        session.beginTransaction().commit();
        session.close();
    }

    public void removeDeveloper(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //Developer developer = session.get(Developer.class, id);
        //session.delete(developer);
        Developer developer = new Developer();
        developer.setId(id);
        session.delete(developer);
        transaction.commit();
        session.close();
    }

    public List<Developer> listDeveloper() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Developer> developers = session.createQuery("FROM Developer ORDER BY id").list();
        transaction.commit();
        session.close();
        return developers;
    }

}
