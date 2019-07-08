package com.adidyk.dao;

import com.adidyk.models.Passport;
import com.adidyk.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.experimental.theories.internal.ParameterizedAssertionError;

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
     * checkUserUpdate -check user update.
     * @param newUser - new user.
     * @param oldUser - old user.
     * @return - returns user update.
     */
    private User checkUserUpdate(User newUser, User oldUser) {
        if (newUser.getName() != null) oldUser.setName(newUser.getName());
        if (newUser.getProfession() != null) oldUser.setProfession(newUser.getProfession());
        if (oldUser.getPassport() == null) {
            oldUser.setPassport(newUser.getPassport());
        } else if (newUser.getPassport() != null) {
            oldUser.setPassport(this.checkPassportUpdate(newUser.getPassport(), oldUser.getPassport()));
        }
        return oldUser;
    }

    /**
     * checkPassportUpdate - check passport update.
     * @param newPassport - new passport.
     * @param oldPassport - old passport.
     * @return - returns passport update.
     */
    private Passport checkPassportUpdate(Passport newPassport, Passport oldPassport) {
        if (newPassport.getSerial() != null) oldPassport.setSerial(newPassport.getSerial());
        if (newPassport.getRegion() != null) oldPassport.setRegion(newPassport.getRegion());
        if (newPassport.getCountry() != null) oldPassport.setCountry(newPassport.getCountry());
        return oldPassport;
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
     * @param newUser - user.
     */
    @Override
    public void update(User newUser) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.update(this.checkUserUpdate(newUser, session.get(User.class, newUser.getId())));
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
            User deleteUser = session.get(User.class, user.getId());
            session.remove(deleteUser);
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
            list = session.createQuery("FROM User AS u ORDER BY u.id ASC").list();
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