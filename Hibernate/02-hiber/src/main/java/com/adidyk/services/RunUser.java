package com.adidyk.services;

import com.adidyk.dao.DAO;
import com.adidyk.dao.ProjectDAO;
import com.adidyk.dao.UserDAO;
import com.adidyk.models.Passport;
import com.adidyk.models.Project;
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
    private UserDAO userDAO;

    private ProjectDAO projectDAO;

    /**
     * @param logger - logger (link variable to object of class Logger).
     */
    private static final Logger logger = Logger.getLogger(RunUser.class);

    /**
     * RunUser - constructor.
     */
    RunUser(UserDAO userDAO, ProjectDAO projectDAO) {
        this.userDAO = userDAO;
        this.projectDAO = projectDAO;
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
            ex.printStackTrace();
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
        User user;
        if ((user = this.userDAO.get(id)) == null) {
            logger.warn("user by id not found");
        }
        return user;
    }

    /**
     * listUser - returns list users.
     * @return - returns list users.
     */
    public ArrayList<User> listUser() {
        List<User> list;
        if ((list = this.userDAO.getList()) == null) {
            logger.warn("user by id not found");
        }
        return (ArrayList<User>) list;
    }

    /**
     * addPassport - adds passport to user.
     */
    public void addPassport(Integer userId, Passport passport) {
        User user = this.getUserById(userId);
        System.out.println("    get.user.id:  " + user);
        if (user != null) {
            if (user.getPassport() == null) {
                System.out.println("    get.passport:  " + user.getPassport());
                user.setPassport(passport);
                System.out.println("    set.passport:  " + user);
                this.updateUserById(user);
            } else {
                logger.warn("user already has passport");
            }
        } else {
            logger.warn("passport not added to user because user by id not found");
        }
    }

    /**
     * addProject - adds project to user (project is created and is data base).
     */
    public void addProject(Integer userId, Integer projectId) {
        User user = this.getUserById(userId);
        if (user != null) {
            Project project = this.projectDAO.get(projectId);
            if (project != null) {
                this.userDAO.addProjectToUser(user, project);
            } else {
                logger.warn("project by id not found");
            }
        } else {
            logger.warn("user by id not found");
        }
    }

    /**
     * listProject - list project for user.
     * @param userId - user id.
     * @return - returns list project for user.
     */
    public List<Project> listProject(Integer userId) {
        List<Project> list = this.userDAO.getProject(userId);
        return list;
    }

}