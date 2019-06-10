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
        } catch (Exception ex) {
            ex.printStackTrace();
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
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public User get(String id) {
        User result = null;
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            result = session.get(User.class, id);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public List<User> getList() {
        List result = null;
        try (Session session = this.factory.openSession()) {
            result = session.createNamedQuery("FROM User").list();
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
