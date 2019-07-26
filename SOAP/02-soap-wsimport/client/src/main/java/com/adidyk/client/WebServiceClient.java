package com.adidyk.client;

import com.adidyk.models.User;
import com.adidyk.ws.UserService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

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
        System.out.println(userService.test());
        // web service - add user
        User barbara = new User("barbara", "yellow", 31);
        userService.add(barbara);
        User amanda = new User("amanda", "grey", 32);
        userService.add(amanda);
        // web service - get user by id
        System.out.println(userService.findById("1"));
        // web service - get all user
        System.out.println("start findAll");
        ArrayList<User> list = userService.findAll();
        System.out.println("finish findAll");
        for (User user : list) {
            System.out.println("user :" + user);
        }
    }

}