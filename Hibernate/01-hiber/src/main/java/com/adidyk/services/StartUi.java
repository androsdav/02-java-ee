package com.adidyk.services;

import com.adidyk.dao.ItemDAO;
import com.adidyk.dao.UserDAO;
import com.adidyk.models.Comment;
import com.adidyk.models.Item;
import com.adidyk.models.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
        /*
        User testUser = new User(1, "name user", "profession user");
        Item testItem = new Item (1, "name item", "desc item", testUser);
        System.out.println(testItem);
        System.out.println(testItem.hashCode());
        Comment comment1 = new Comment(1, "comment1", "desc1");
        Comment comment2 = new Comment(2, "comment2", "desc2");
        ArrayList<Comment> list = new ArrayList<>();
        list.add(comment1);
        list.add(comment2);
        testItem.setComments(list);
        System.out.println(testItem);
        System.out.println(testItem.hashCode());
        */

        //Item item = null;
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory()) {
            RunUser runUser = new RunUser(new UserDAO(factory));
            RunItem runItem = new RunItem(new ItemDAO(factory), runUser);
            System.out.println();
            for (Item item : runItem.listItem()) {
                System.out.println(item);
            }
            //runItem.addComment(4,new Comment(1, "about sex", "sex is good"));
            ArrayList<Comment> list = new ArrayList<>();
            Comment comment1 = new Comment(1, "1", "1");
            Comment comment2 = new Comment(1, "2", "2");
            list.add(comment1);
            list.add(comment2);
            Item item = new Item(1,"test", "test");
            item.setComments(list);
            runItem.addItem(item, 1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
        /*
            ItemDAO itemDAO = new ItemDAO(factory);
            item = itemDAO.get(1);
            System.out.println("factory : " + item);

            /*
            list = itemDAO.getList();
            for (Item item : list) {
                System.out.println(item);
            }
            factory.close();
            */
            /*
            System.out.println();
            System.out.println(itemDAO.get(1));
            */

            /*
            System.out.println();
            for (Item item : itemDAO.getList()) {
                System.out.println(item);
            }
            */


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
            /*
            factory.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("main : " + item);
        */
