package com.adidyk.services;

import com.adidyk.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Closeable;
import java.util.List;


public class RunUser implements AutoCloseable {

    private SessionFactory factory;

    RunUser() {

    }

    RunUser(SessionFactory factory) {
        this.factory = factory;
    }

    public void addUser(User user) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(user);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            throw ex;
        } finally {
            session.close();
        }

        //session.close();
        //factory.close();

        /*
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(user);
            session.beginTransaction().commit();
  //          session.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        */
    }

    @Override
    public void close() throws Exception {
        factory.close();
        System.out.println(" [info]  method close ......");

    }

    public void updateUserById(User user) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        User userOld = session.get(User.class, user.getId());
        userOld.setName(user.getName());
        userOld.setProfession(user.getProfession());
        //session.update(userOld);
        transaction.commit();
        session.close();
    }

    public void removeUserById(User user) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    public User getUserById(int id) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        return session.get(User.class, id);
    }

    public List<User> listUser() {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        List<User> users = session.createQuery("FROM User").list();
        transaction.commit();
        session.close();
        return users;
    }


}