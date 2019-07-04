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

            // add user
            //System.out.println("-------------------- add user --------------------");
            //runUser.addUser(new User("tom", "cut"));

            // update user
            System.out.println("-------------------- user update by id --------------------");
            User user = new User(6);
            //user.setName("bob1");
            //user.setProfession("tirane");
            Passport passport = new Passport();
            passport.setRegion("Virginia1");
            user.setPassport(passport);
            runUser.updateUserById(user);

            // add passport
            //System.out.println("-------------------- add passport to user --------------------");
            //Passport passport = new Passport("111","USA","Texas");
            //runUser.addPassport(6, passport);

            // user get by id
            //System.out.println("-------------------- get user by id --------------------");
            //System.out.println(runUser.getUserById(5));
            //System.out.println(runUser.getUserById(6));
            //System.out.println(runUser.getUserById(7));
            //System.out.println(runUser.getUserById(8));

            // get all users
            //System.out.println("-------------------- get all user --------------------");
            //for (User user : runUser.listUser()) {
//                System.out.println(user);
//            }





            //runUser.addUser(new User("tom", "char"));

            //Passport passport = new Passport("8888","Turkey", "Marmara");
            //runUser.addPassport(4, passport);


            //runUser.updateUserById(new User(4, "tomUpdate", "charUpdate"));


            /*
            for (User user : runUser.listUser()) {
                System.out.println(user);

            }
            //runUser.updateUserById(new User(1,"tomUpdate"));




            //runUser.removeUserById(2);
            //Passport passport = new Passport("123", "Ukraine", "North");
            //runUser.addPassport(1, passport);
            //runUser.updateUserById(new User(2, "adolfUpdate", "driverUpdate"));
            //System.out.println(runUser.getUserById(1));
            //System.out.println(runUser.getUserById(2));
            //System.out.println(runUser.getUserById(3));
            /*
            RunUser runUser = new RunUser(new UserDAO(factory));
            RunItem runItem = new RunItem(new ItemDAO(factory), runUser);
            System.out.println();
            /*
            for (Item item : runItem.listItem()) {
                System.out.println(item);
            }
            */
            /*
            Comment comment = new Comment(1, "inverse-false", "inverse-false");
            runItem.addComment(7, comment);
            */
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}