package com.adidyk.services;

import com.adidyk.dao.ItemDAO;
import com.adidyk.dao.UserDAO;
import com.adidyk.models.Comment;
import com.adidyk.models.Item;
import com.adidyk.models.Passport;
import com.adidyk.models.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

/**
 * Class StartUi for create jar file and start program.
 * @author Didyk Andrey (androsdav@bigmir.net).
 * @since 09.02.2019.
 * @version 1.0.
 */
public class StartUi {

    public static List<Item> list;

    /**
     * main - creates jar file and runs program.
     *
     * @param arg - is nothing.
     */
    public static void main(String[] arg) {

        try (SessionFactory factory = new Configuration().configure().buildSessionFactory()) {
            RunUser runUser = new RunUser(new UserDAO(factory));
            RunItem runItem = new RunItem(new ItemDAO(factory), runUser);


            /*
            User user = new User("andrey", "professor");
            Passport passport = new Passport("444", "Georgia", "Tbilisi");
            user.setPassport(passport);
            runUser.addUser(user);
            */

            runUser.removeUserById(1);

            // add user
            /*
            System.out.println("-------------------- add user --------------------");
            runUser.addUser(new User("bil", "cut"));
            */

            // update user
            /*
            System.out.println("-------------------- user update by id --------------------");
            User user1 = new User(1);
            user1.setName("bob-up1");
            User user2 = new User(2);
            user2.setProfession("driver-up1");
            User user3 = new User(3);
            user3.setName("amanda-up1");
            user3.setProfession("designer-up1");
            Passport passport1 = new Passport();
            passport1.setRegion("Kiev-up1");
            Passport passport2 = new Passport();
            passport2.setCountry("Germany-up1");
            Passport passport3 = new Passport();
            passport3.setRegion("Prague-up1");
            passport3.setCountry("Poland-up1");
            user1.setPassport(passport1);
            user2.setPassport(passport2);
            user3.setPassport(passport3);
            runUser.updateUserById(user1);
            runUser.updateUserById(user2);
            runUser.updateUserById(user3);
            */
            // add passport
            /*
            System.out.println("-------------------- add passport to user --------------------");
            Passport passport = new Passport("111","Ukraine","Kiev");
            Passport passport1 = new Passport("222","Germany","Berlin");
            Passport passport2 = new Passport("333","Poland","Prague");
            runUser.addPassport(1, passport);
            runUser.addPassport(2, passport1);
            runUser.addPassport(3, passport2);
            */

            // user get by id
            /*
            System.out.println("-------------------- get user by id --------------------");
            System.out.println(runUser.getUserById(1));
            System.out.println(runUser.getUserById(2));
            System.out.println(runUser.getUserById(3));
            System.out.println(runUser.getUserById(8));
            */
            // get all users
            /*
            System.out.println("-------------------- get all user --------------------");
            for (User user : runUser.listUser()) {
                System.out.println(user);
            }
            */
            //add item
            /*
            System.out.println("-------------------- add item --------------------");
            Item item1 = new Item("item1", "desc1");
            Item item2 = new Item("item2", "desc2");
            Item item3 = new Item("item3", "desc3");
            */

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}