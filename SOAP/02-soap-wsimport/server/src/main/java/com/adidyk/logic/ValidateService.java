package com.adidyk.logic;

import com.adidyk.models.User;
import com.adidyk.persistent.MemoryStore;
import com.adidyk.persistent.Store;
import java.util.ArrayList;

/**
 * Class ValidateService consists next method for container of users: add, update, delete, findById, findAll.
 * @author Didyk Andrey (androsdav@bigmir.net).
 * @since 27.01.2019.
 * @version 1.0.
 */
public class ValidateService implements Validate {

    /**
     * @param instance - link variable to object of class ValidateService (singleton).
     */
    private static final Validate instance = new ValidateService();

    /**
     * @param logic - link variable to object of class MemoryStore (singleton).
     */
    private final Store store = MemoryStore.getInstance();

    /**
     * ValidateService - private constructor.
     */
    private ValidateService() {

    }

    /**
     * getInstance - returns link variable to object of class MemoryStore (singleton).
     * @return - returns link variable to object of class MemoryStore (singleton).
     */
    public static Validate getInstance() {
        return instance;
    }

    /**
     * add - adds user to container.
     * @param user - user (link variable to object of class User).
     */
    @Override
    public User add(User user) {
        this.store.add(user);
        return user;
    }

    /**
     * update - updates user by id in container.
     * @param user - user (link variable to object of class User).
     */
    @Override
    public void update(User user) {
        this.store.update(user);
    }

    /**
     * delete - deletes user by id from container.
     * @param id - user id.
     * @return - returns id.
     */
    @Override
    public String delete(String id) {
        this.store.delete(id);
        return id;
    }

    /**
     * findById - finds user by id in container.
     * @param id - user id.
     * @return - returns user id.
     */
    @Override
    public User findById(String id) {
        User user = null;
        try {
            user = this.store.findById(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return user;
    }

    /**
     * findAll - returns all user from container.
     * @return - returns all user.
     */
    @Override
    public ArrayList<User> findAll() {
        return this.store.findAll();
    }

}