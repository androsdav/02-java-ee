package com.adidyk.dao;

import com.adidyk.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Class UserDAO.
 */
public class UserDAO implements DAO<User, Integer> {

    /**
     * @param factory - session factory.
     */
    private final SessionFactory factory;

    /**
     * UserDAO - constructor.
     * @param factory - session factory.
     */
    public UserDAO(SessionFactory factory) {
        this.factory = factory;
    }

    /**
     * add - adds user to table users to data base.
     * @param user - user.
     */
    @Override
    public void add(User user) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }
    }

    /**
     * update - updates user in table users in database by id.
     * @param user - user.
     */
    @Override
    public void update(User user) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        }
    }

    /**
     * remove - removes user in table users in data base by id.
     * @param user - user.
     */
    @Override
    public void remove(User user) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.remove(user);
            session.getTransaction().commit();
        }
    }

    /**
     * get - returns user from table users by id.
     * @param id - user id.
     * @return - returns user id.
     */
    @Override
    public User get(Integer id) {
        User result;
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            result = session.get(User.class, id);
            session.getTransaction().commit();
        }
        return result;
    }

    /**
     * getList - returns list users from table users.
     * @return - returns list users from table users.
     */
    @Override
    public List<User> getList() {
        List<User> result;
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            result = session.createQuery("FROM User").list();
            session.getTransaction().commit();
        }
        return result;
    }

}