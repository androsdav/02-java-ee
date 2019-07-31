package com.adidyk.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class UerStore.
 */
//@org.springframework.stereotype.Repository
public class UserStore {

    /**
     * @param template -template.
     */
    private HibernateTemplate template;

    /**
     * UserStore - constructor.
     * @param template - template.
     */
    public UserStore(final HibernateTemplate template) {
        this.template = template;
    }

    //@Transactional
    public User save(User user) {
        this.template.save(user);
        return user;
    }


}
