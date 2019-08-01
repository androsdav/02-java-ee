package com.adidyk;

import com.adidyk.models.User;
import com.adidyk.models.UserStore;
import com.adidyk.xxx.B;
import com.adidyk.xxx.C;
import com.adidyk.yyy.A;
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
        //ApplicationContext context = new ClassPathXmlApplicationContext("hibernate-context.xml");
        //UserStore userStore = context.getBean(UserStore.class);
        //userStore.save(new User("amanda", "doctor"));
        // https://dzone.com/tutorials/java/spring/spring-hibernate-integration-1.html
        System.out.println("test test");
        ApplicationContext context = new ClassPathXmlApplicationContext("test-context.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        //B b = context.getBeutan(B.class);
        //C c = context.getBean(C.class);
        //A a = context.getBean(A.class);

    }
}
 