package com.adidyk.services;

import com.adidyk.dao.DAO;
import com.adidyk.models.User;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 * Class RunUser.
 */
public class RunUser {

    /**
     * @param daoUser - daoUser.
     */
    private DAO<User, Integer> userDAO;

    /**
     * @param logger - logger (link variable to object of class Logger).
     */
    private static final Logger logger = Logger.getLogger(RunUser.class);

    /**
     * RunUser - constructor.
     */
    RunUser(DAO<User, Integer> userDAO) {
        this.userDAO = userDAO;
    }

    /**
     * addUser - adds user to table user
     * @param user - user.
     */
    void addUser(User user) {
        this.userDAO.add(user);
    }

    /**
     * updateUserById - updates user by id.
     * @param user - user id.
     */
    void updateUserById(User user) {
        try {
            this.userDAO.update(user);
        } catch (Exception ex) {
            logger.warn("user by id not found ...");
        }
    }

    /**
     * removeUserById - removes user by id.
     * @param id - user id.
     */
    public void removeUserById(Integer id) {
        try {
            this.userDAO.remove(new User(id));
        } catch (Exception ex) {
            logger.warn("user by id not found ...");
        }
    }

    /**
     * getUserById - returns user by id.
     * @param id - returns user by id.
     * @return returns user by id.
     */
    public User getUserById(Integer id) {
        User result;
        if ((result = this.userDAO.get(id)) == null) {
            logger.warn("user by id not found");
        }
        return result;
    }

    /**
     * listUser - returns list users.
     * @return - returns list users.
     */
    public ArrayList<User> listUser() {
        List<User> result;
        if ((result = this.userDAO.getList()) == null) {
            logger.warn("user by id not found");
        }
        return (ArrayList<User>) result;
    }

}