package com.adidyk.services;

import com.adidyk.pojo.Developer;
import com.adidyk.services.RunDeveloper;

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
        System.out.println("branch feature/add-item-comment ...");
        Developer user = new Developer(1, "andreyUpdate", "diduk", "tehnick", "1000");
        System.out.println("test hibernate" + user);
        RunDeveloper runDeveloper = new RunDeveloper();
        //runDeveloper.addDeveloper(user);
        //runDeveloper.updateDeveloper(1, "88888");
        //runDeveloper.removeDeveloper(7);
        for (Developer developer : runDeveloper.listDeveloper()) {
            System.out.println(developer);
        }
        //runDeveloper.removeDeveloper(4);
    }

}