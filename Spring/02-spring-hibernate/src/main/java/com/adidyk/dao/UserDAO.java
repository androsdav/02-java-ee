package com.adidyk.dao;

import com.adidyk.models.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Class UserDAO.
 */
@Repository
@Qualifier("userDAO")
public class UserDAO implements DAO<User, String> {

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
     * @param name - user id.
     * @return - returns entity.
     */
    @Override
    public User get(String name) {
        User user = this.template.execute(new HibernateCallback<User>() {
            @Override
            public User doInHibernate(Session session) throws HibernateException {
                
                /*
                Query query = session.createQuery("SELECT u from User as u where u.name=:userName").ge;
                query.setParameter("userName", name);
                List<User> list = query.getResultList();
                User user1 = list.get(0);
                */
                return null;
            }
        });

        //User user = this.template.get(User.class, id);
        //User user = this.template.find("from User WHERE user.id = ?", id);
        return user;
    }

    /**
     * update - update entity.
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
        String string = "amanda";
        //List<User> list = (List<User>) this.template.find("SELECT FROM User AS u WHERE name = amanda);
        //https://docs.spring.io/spring/docs/current/spring-framework-reference/data-access.html#orm-hibernate
                //this.template.execute()
        //List<?> list = this.template.find("select u from User AS u WHERE u.name IN (?1)", "amanda", User.class);
        //return (List<User>) list;
        return null;
    }

}