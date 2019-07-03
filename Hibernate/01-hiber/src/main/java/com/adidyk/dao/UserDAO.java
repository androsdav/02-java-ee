package com.adidyk.dao;

import com.adidyk.models.Passport;
import com.adidyk.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
            //User oldUser = session.get(User.class, user.getId());
            //System.out.println("    new user: " + user);
            //System.out.println("    old user: " + oldUser);
            //oldUser.setName(user.getName());
            //oldUser.setProfession(user.getProfession());
            //System.out.println("    old user update: " + oldUser);
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
        User user;
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            user = session.get(User.class, id);
            session.getTransaction().commit();
        }
        return user;
    }

    /**
     * getList - returns list users from table users.
     * @return - returns list users from table users.
     */
    @Override
    public List<User> getList() {
        List<User> list;
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            list = session.createQuery("FROM User").list();
            session.getTransaction().commit();
        }
        return list;
    }

    /**
     *
     * @param passport
     */

    public void setPassport(Passport passport) {
        try(Session session = this.factory.openSession()) {
            session.beginTransaction();

            session.getTransaction().commit();

        }

    }

}