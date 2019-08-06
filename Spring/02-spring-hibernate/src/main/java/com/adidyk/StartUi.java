package com.adidyk;

import com.adidyk.dao.DAO;
import com.adidyk.models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

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
        //User user1 = new User("bob", "model");
        //userDAO.add(user1);
        //userDAO.delete(new User(2));


        //System.out.println(userDAO.get("amanda"));

        System.out.println("-----------------------");
        ArrayList<User> list = (ArrayList<User>) userDAO.getList();
        for(User user : list) {
            System.out.println(user);
        }

        // https://www.javarticles.com/2015/04/spring-hibernatetempate-example.html
        // https://www.javaguides.net/2018/11/hibernate-query-language-insert-update.html
    }
}
