package com.adidyk.services;

import com.adidyk.dao.ItemDAO;
import com.adidyk.dao.UserDAO;
import com.adidyk.models.Item;
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
            RunUser runUser = new RunUser(new UserDAO(factory));
            System.out.println();
            for (User user : runUser.listUser() ) {
                System.out.println(user);
            }


            /*
            RunItem runItem = new RunItem(new ItemDAO(factory), runUser);
            runItem.addItem(new Item(1, "warik", "warik"), 100);
            runItem.updateItemById(new Item(100,"peace","peace"));
            runItem.removeItemById(200);
            runUser.removeUserById(100);
            System.out.println("TEST GET ITEM BY ID");
            Item item = runItem.getItemById(4);
            System.out.println("\nRESULT -> GET BY ID: " + item);
            for (Item itemList : runItem.listItem()) {
                System.out.println(itemList);
            }
            */



            //System.out.println(item.getUser());
            //ItemDAO itemDAO = new ItemDAO(factory);
            //Item item = new Item(1,"1", "1", new User(200,"androstest","androstest"));
            //itemDAO.add(item);
            /*
            DAO<User, Integer> userDAO = new UserDAO(factory);
            List<User> users = userDAO.getList();
            for (User user : users) {
                System.out.println(user);
            }
            //userDAO.add(new User(1, "Gena", "derector"));
            RunUser runUser = new RunUser(new UserDAO(factory));
            // add user
            //runUser.addUser(new User(1,"galanenko", "proffesor2"));
            // update user by id
            //runUser.updateUserById(new User(100, "TM","wifi Genu"));
            // remove user by id
            runUser.removeUserById(200);
            System.out.println(runUser.getUserById(200));
            for (User item : runUser.listUser()) {
                System.out.println(item);
            }

            /*
            runUser.removeUserById(2);
            runUser.getUserById(2);
            */
            /*

            for (User item : runUser.listUser()) {
                System.out.println(item);
            }

            */
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}