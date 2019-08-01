package com.adidyk.models;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * Class UerStore.
 */
//@org.springframework.stereotype.Repository
@Repository
public class UserStore {

    /**
     * @param template -template.
     */
    private HibernateTemplate template;

    /**
     * UserStore - constructor.
     */
    public UserStore() {
    }

    /**
     * UserStore - constructor.
     * @param template - template.
     */
    public UserStore(final HibernateTemplate template) {
        this.template = template;
    }

    @Transactional
    public User save(User user) {
        this.template.save(user);
        return user;
    }

}