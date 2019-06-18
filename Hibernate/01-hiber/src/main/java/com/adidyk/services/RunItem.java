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
    private static final Logger logger = Logger.getLogger(RunUser.class);

    /**
     * RunUser - constructor.
     */
    RunItem(DAO<Item, Integer> itemDAO, RunUser runUser) {
        this.itemDAO = itemDAO;
    }

    /**
     * addUser - adds user to table user
     * @param userId - user.
     */
    void addItem(Item item, int userId) {
        final User result = this.runUser.getUserById(userId);
        if (result != null) {
            this.itemDAO.add(item);
        }
    }

}
