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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStore userStore = context.getBean(UserStore.class);
        userStore.save(new User("amanda", "doctor"));
        // https://dzone.com/tutorials/java/spring/spring-hibernate-integration-1.html

    }
}
