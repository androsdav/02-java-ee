package com.adidyk.dao;

import com.adidyk.models.Comment;
import com.adidyk.models.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

/**
 * Class ItemDAO.
 */
public class ItemDAO implements DAO<Item, Integer> {

    /**
     * @param factory - session factory.
     */
    private final SessionFactory factory;

    /**
     * UserDAO - constructor.
     * @param factory - session factory.
     */
    public ItemDAO(SessionFactory factory) {
        this.factory = factory;
    }

    /**
     * add - adds user to table users to data base.
     * @param item - user.
     */
    @Override
    public void add(Item item) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.save(item);
            session.getTransaction().commit();
        }
    }

    /**
     * update - updates user in table users in database by id.
     * @param item - user.
     */
    @Override
    public void update(Item item) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.update(item);
            session.getTransaction().commit();
        }
    }

    /**
     * remove - removes user in table users in data base by id.
     * @param item - user.
     */
    @Override
    public void remove(Item item) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.remove(item);
            session.getTransaction().commit();
         }
    }

    /**
     * get - returns user from table users by id.
     * @param id - user id.
     * @return - returns user id.
     */
    @Override
    public Item get(Integer id) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            Item result = session.get(Item.class, id);
            session.getTransaction().commit();
            return result;
        }
    }

    /**
     * getList - returns list users from table users.
     * @return - returns list users from table users.
     */
    @Override
    public List<Item> getList() {
        List<Item> result;
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            result = session.createQuery("FROM Item").list();
            /*
            System.out.println();
            for (Item item : result) {
                System.out.println(item);
            }
            System.out.println();
            */
            session.getTransaction().commit();
        }
        return result;
    }

}