package com.adidyk.services;

import com.adidyk.dao.ItemDAO;
import com.adidyk.dao.UserDAO;
import com.adidyk.models.Comment;
import com.adidyk.models.Item;
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
            System.out.println();
            /*
            for (Item item : runItem.listItem()) {
                System.out.println(item);
            }
            */
            Comment comment = new Comment(1, "inverse-false", "inverse-false");
            runItem.addComment(7, comment);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}