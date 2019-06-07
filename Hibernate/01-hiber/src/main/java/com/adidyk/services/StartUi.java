package com.adidyk.services;

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
        //System.out.println("branch feature/add-item-comment ...");
        //Developer develop = new Developer(1, "andreyUpdate", "diduk", "tehnick", "1000");
        //System.out.println("test hibernate" + develop);
        //RunDeveloper runDeveloper = new RunDeveloper();
        //runDeveloper.addDeveloper(develop);
        //runDeveloper.updateDeveloper(1, "88888");
        //runDeveloper.removeDeveloper(7);
        //for (Developer developer : runDeveloper.listDeveloper()) {
        //    System.out.println(developer);
        //}
        //runDeveloper.removeDeveloper(4);  dsdadasd
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory()) {
            RunUser runUser = new RunUser(factory);
            runUser.addUser(new User(1, "gena", "gena"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
        /*
        //runUser.updateUserById(new User(1, "Bob", "doca"));
        //runUser.removeUserById(new User(10));
        /*
        System.out.println(runUser.getUserById(3));
        for (User user : runUser.listUser()) {
            System.out.println(user);
        }
        // Feeling Happy Summer - The Best Of Vocal Deep House Music Chill Out #97 - Mix By Regard may favorite song now !!!
        // May task on today.
        //Summer Mix 2019 - Best Of Deep House Sessions Music Chill Out Mix By DJ SteFan same  music, not bad..... maeby

    }*/

}