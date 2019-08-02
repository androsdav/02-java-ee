package com.adidyk;

import com.adidyk.dao.DAO;
import com.adidyk.dao.UserDAO;
import com.adidyk.models.User;
import com.adidyk.models.UserStore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class StartUi.
 */
public class StartUi {

    /**
     * main - just main.
     * @param arg - arg.
     */
    public static void main(String[] arg) {
       System.out.println("test test");
        ApplicationContext context = new ClassPathXmlApplicationContext("hibernate-context.xml");
        DAO userDAO = context.getBean("userDAO", DAO.class);
        User user = new User("amanda", "doctor");
        userDAO.add(user);
        System.out.println(user);
    }
}
