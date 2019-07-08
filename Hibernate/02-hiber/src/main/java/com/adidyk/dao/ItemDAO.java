package com.adidyk.dao;

import com.adidyk.models.Comment;
import com.adidyk.models.Item;
import com.adidyk.models.User;
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
     * checkUserUpdate -check user update.
     * @param newItem - new user.
     * @param oldItem - old user.
     * @return - returns user update.
     */
    private Item checkItemUpdate(Item newItem, Item oldItem) {
        if (newItem.getName() != null) oldItem.setName(newItem.getName());
        if (newItem.getDescription() != null) oldItem.setDescription(newItem.getDescription());
        return oldItem;
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
     * update - updates user in table users in database by id. update without comments.
     * @param newItem - user.
     */
    @Override
    public void update(Item newItem) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.update(this.checkItemUpdate(newItem, session.get(Item.class, newItem.getId())));
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
            Item deleteItem = session.get(Item.class, item.getId());
            session.remove(deleteItem);
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
            session.getTransaction().commit();
        }
        return result;
    }

    /**
     * addComment - adds comment to item.
     * @param comment - comment.
     */
    public void addComment(Comment comment) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.save(comment);
            session.getTransaction().commit();
        }
    }

}