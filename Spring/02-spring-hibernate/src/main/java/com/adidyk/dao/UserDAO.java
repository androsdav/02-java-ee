package com.adidyk.dao;

import com.adidyk.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Class UserDAO.
 */
@Repository
@Qualifier("userDAO")
public class UserDAO implements DAO<User, Integer>{

    /**
     * @param template - hibernate template.
     */
    private HibernateTemplate template;

    /**
     * UserDAO - constructor.
     */
    UserDAO() {
    }


    /**
     * UserDAO - constructor.
     * @param template - hibernate template.
     */
    @Autowired
    UserDAO(HibernateTemplate template) {
        this.template = template;
    }

    /**
     * add - add entity.
     * @param user - generic entity.
     */
    //@Override
    @Transactional
    public void add(User user) {
        this.template.save(user);

    }

    /**
     * @param integer - generic key.
     * @return - returns entity.
     */
    //@Override
    public User get(Integer integer) {
        return null;
    }

    /**
     * update - update entity.
     *
     * @param user - generic entity.
     */
    //@Override
    public void update(User user) {

    }

    /**
     * delete - delete entity.
     *
     * @param user - generic entity.
     */
    //@Override
    public void delete(User user) {

    }

    /**
     * getList - returns all entity.
     *
     * @return - returns all entity.
     */
    //@Override
    public List<User> getList() {
        return null;
    }

}