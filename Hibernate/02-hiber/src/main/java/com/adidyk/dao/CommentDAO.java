package com.adidyk.dao;

import com.adidyk.models.Comment;

import java.util.List;

/**
 * CommentDAO - class.
 */
public class CommentDAO implements DAO<Comment, Integer> {

    /**
     * add - adds entity to database.
     * @param comment - generic entity.
     */
    @Override
    public void add(Comment comment) {

    }

    /**
     * update - updates entity in database.
     * @param comment - generic entity.
     */
    @Override
    public void update(Comment comment) {

    }

    /**
     * remove - removes entity from database.
     * @param comment - generic entity.
     */
    @Override
    public void remove(Comment comment) {

    }

    /**
     * get - gets entity from database by key.
     * @param integer - generic key.
     * @return - returns entity from database by key.
     */
    @Override
    public Comment get(Integer integer) {
        return null;
    }

    /**
     * getList - gets all entity from database.
     * @return - returns list entity from database
     */
    @Override
    public List<Comment> getList() {
        return null;
    }

}