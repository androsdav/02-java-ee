package com.adidyk.services;

import com.adidyk.dao.DAO;
import com.adidyk.models.Item;
import com.adidyk.models.User;
import org.apache.log4j.Logger;

/**
 * Class Item.
 */
public class RunItem {

    /**
     * @param daoUser - daoUser.
     */
    private DAO<Item, Integer> itemDAO;

    /**
     * @param runUser - runUser.
     */
    private RunUser runUser;

    /**
     * @param logger - logger (link variable to object of class Logger).
     */
    private static final Logger logger = Logger.getLogger(RunItem.class);

    /**
     * RunUser - constructor.
     */
    RunItem(DAO<Item, Integer> itemDAO, RunUser runUser) {
        this.itemDAO = itemDAO;
        this.runUser = runUser;
    }

    /**
     * addUser - adds user to table user
     * @param userId - user.
     */
    void addItem(Item item, int userId) {
        final User result = this.runUser.getUserById(userId);
        if (result != null) {
            item.setUser(result);
            this.itemDAO.add(item);
        } else {
            logger.warn("item not added because user by id not found");

        }
    }

    /**
     * updateItemById - updates user by id.
     * @param item - user id.
     */
    void updateItemById(Item item) {
        try {
            this.itemDAO.update(item);
        } catch (Exception ex) {
            logger.warn("item not updated because item by id not found");
        }
    }

    /**
     * removeUserById - removes item by id.
     * @param id - item id.
     */
    void removeItemById(int id) {
        try {
            this.itemDAO.remove(new Item(id));
        } catch (Exception ex) {
            logger.warn("item not deleted because item by id not found");
        }

    }

}