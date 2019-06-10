package com.adidyk.services;

import com.adidyk.dao.DAO;
import com.adidyk.dao.UserDAO;
import com.adidyk.models.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Class StartUi for create jar file and start program.
 * @author Didyk Andrey (androsdav@bigmir.net).
 * @since 09.02.2019.
 * @version 1.0.
 */
public class StartUi {

    /**
     * main - creates jar file and runs program.
     * @param arg - is nothing.
     */
    public static void main(String[] arg) {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory()) {
            DAO<User, String> userDAO = new UserDAO(factory);
            userDAO.add(new User(1, "andros", "barbos"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}