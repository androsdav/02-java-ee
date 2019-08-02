package com.adidyk.dao;

import com.adidyk.models.User;

import java.util.List;

/**
 * Interface DAO.
 */
public interface IuserDAO {

    /**
     * add - add entity.
     */
    public void add(User user);

    /**
     *
     * @param key - generic key.
     * @return - returns entity.
     */
    public User get(Integer key);

    /**
     * update - update entity.
     */
    public void update(User user);

    /**
     * delete - delete entity.
     * @param entity - generic entity.
     */
    public void delete(User entity);

    /**
     * getList - returns all entity.
     * @return - returns all entity.
     */
    public List<User> getList();


}