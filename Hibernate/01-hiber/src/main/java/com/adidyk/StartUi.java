package com.adidyk;

import com.adidyk.models.Developer;

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
        Developer user = new Developer(1, "alex", "svistun", "tehnick", "1000");
        System.out.println("test hibernate" + user);

    }

}