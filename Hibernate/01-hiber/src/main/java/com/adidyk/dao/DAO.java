package com.adidyk.dao;

import com.adidyk.models.User;

import java.util.List;

/**
 * Interface DAO.
 * @param <Entity> - generic entity.
 * @param <Key> - generic key.
 */
public interface DAO<Entity, Key> {

    /**
     * add - adds entity to database.
     * @param entity - generic entity.
     */
    void add(Entity entity);

    /**
     * update - updates entity in database.
     * @param entity - generic entity.
     */
    void update(Entity entity);

    /**
     * remove - removes entity from database.
     * @param entity - generic entity.
     */
    void remove(Entity entity);

    /**
     * get - gets entity from database by key.
     * @param key - generic key.
     * @return - returns entity from database by key.
     */
    Entity get(Key key);

    /**
     * getList - gets all entity from database.
     * @return - returns list entity from database
     */
    List<Entity> getList();

}