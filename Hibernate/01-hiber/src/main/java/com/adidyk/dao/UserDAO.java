package com.adidyk.dao;

import com.adidyk.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Class UserDAO.
 */
public class UserDAO implements DAO<User, String> {

    /**
     * @param factory - session factory.
     */
    private final SessionFactory factory;

    /**
     * UserDAO - constructor.
     * @param factory - session factory.
     */
    UserDAO(SessionFactory factory) {
        this.factory = factory;
    }

    /**
     * add - adds user to table users to data base.
     * @param user - user.
     */
    @Override
    public void add(User user) {
        final Session session = this.factory.openSession();
        final Transaction transaction = session.beginTransaction();
        try {
            session.save(user);
        } catch (final Exception ex) {
            session.getTransaction().rollback();
        }



    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(User user) {

    }

    @Override
    public User get(String s) {
        return null;
    }

    @Override
    public List getList() {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
