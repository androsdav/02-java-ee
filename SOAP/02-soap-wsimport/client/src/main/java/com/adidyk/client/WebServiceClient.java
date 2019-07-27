package com.adidyk.client;

import com.adidyk.models.User;
import com.adidyk.ws.UserService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class WebServiceClient.
 */
public class WebServiceClient {

    /**
     * main - just main.
     * @param arg - arg.
     */
    public static void main(String[] arg) throws MalformedURLException {
        URL url = new URL("http://localhost:1987/ws/user?wsdl");
        QName qName = new QName("http://ws.adidyk.com/", "UserServiceImplService");
        Service service = Service.create(url, qName);
        UserService userService = service.getPort(UserService.class);
        // web service - test
        System.out.println("----------- WS test: ");
        System.out.println(userService.test());
        // web service - add user
        /*
        User barbara = new User("barbara", "yellow", 31);
        userService.add(barbara);
        User amanda = new User("amanda", "grey", 32);
        userService.add(amanda);
        User sandra = new User("sandra", "black", 21);
        userService.add(sandra);
        User santana = new User("santana", "cool", 35);
        userService.add(santana);
        */
        // web service - get user by id
        System.out.println("----------- WS getById: ");
        System.out.println(userService.findById("1"));
        System.out.println(userService.findById("2"));
        System.out.println(userService.findById("3"));
        System.out.println(userService.findById("4"));
        // web service - get all user
        System.out.println("----------- WS findAll");
        User[] array = userService.findAll();
        for (int index = 0; index < array.length; index++) {
            System.out.println("array[" + index + "]: " + array[index]);
        }
        System.out.println("----------- WS update");
        User user = new User("8", "UPDATE", "UPDATE", 32);
        userService.update(user);
        System.out.println("----------- WS delete");
        userService.delete("11");
        System.out.println("----------- WS findAll");
        User[] array1 = userService.findAll();
        for (int index = 0; index < array1.length; index++) {
            System.out.println("array[" + index + "]: " + array1[index]);
        }
    }

}