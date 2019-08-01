package com.adidyk;

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
        UserStore userStore = context.getBean("userStore", UserStore.class);
        //User user = context.getBean("user", User.class);
        //user.setName("amanda");
        //user.setProfession("sadasd");
        User user = new User("amanda", "doctor");
        userStore.save(user);
        System.out.println(user);
    }
}
