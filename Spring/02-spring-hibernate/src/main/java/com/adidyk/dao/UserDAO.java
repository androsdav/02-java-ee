package com.adidyk.dao;

import com.adidyk.models.User;
import com.sun.istack.Nullable;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Class UserDAO.
 */
@Repository
@Qualifier("userDAO")
public class UserDAO implements DAO<User, Integer> {

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
     * add - add user.
     * @param user - user.
     */
    @Override
    @Transactional
    public void add(User user) {
        this.template.save(user);
    }

    /**
     * @param id - user id.
     * @return - returns entity.
     */
    @Override
    public User get(Integer id) {
        User user = this.template.get(User.class, id);
        return user;
    }

    /**
     * update - update entity.
     *
     * @param user - generic entity.
     */
    @Override
    @Transactional
    public void update(User user) {
        this.template.update(user);
    }

    /**
     * delete - delete entity.
     * @param user - generic entity.
     */
    @Override
    @Transactional
    public void delete(User user) {
        this.template.delete(user);
    }

    /**
     * getList - returns all user.
     * @return - returns all user.
     */
    @Override
    @Transactional
    public List<User> getList() {
        List<User> list = (List<User>) this.template.findByNamedParam("FROM User");
        return list;
    }

}