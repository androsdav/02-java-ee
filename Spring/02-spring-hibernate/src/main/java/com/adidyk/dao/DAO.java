package com.adidyk.dao;

import java.util.List;

/**
 * Interface DAO.
 * @param <Entity> - generic.
 * @param <Key> - generic.
 */

public interface DAO<Entity, Key> {

    /**
     * add - add entity.
     * @param entity - generic entity.
     */
    public void add(Entity entity);

    /**
     *
     * @param key - generic key.
     * @return - returns entity.
     */
    public Entity get(Key key);

    /**
     * update - update entity.
     * @param entity - generic entity.
     */
    public void update(Entity entity);

    /**
     * delete - delete entity.
     * @param entity - generic entity.
     */
    public void delete(Entity entity);

    /**
     * getList - returns all entity.
     * @return - returns all entity.
     */
    public List<Entity> getList();

}