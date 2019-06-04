package com.adidyk.services;

import com.adidyk.pojo.Developer;
import com.adidyk.pojo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class RunUser {

    private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction;
        transaction = session.beginTransaction();
        session.save(user);
        user.setProfession("update persistent object");
        transaction.commit();
        session.close();
    }

    public void updateUserById(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User userOld = session.get(User.class, user.getId());
        userOld.setName(user.getName());
        userOld.setProfession(user.getProfession());
        //session.update(userOld);
        transaction.commit();
        session.close();
    }

    public void removeUserById(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    public User getUserById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        return session.get(User.class, id);
    }

    public List<User> listUser() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<User> users = session.createQuery("FROM User").list();
        transaction.commit();
        session.close();
        return users;
    }

}