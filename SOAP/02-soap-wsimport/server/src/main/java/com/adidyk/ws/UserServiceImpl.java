package com.adidyk.ws;

import com.adidyk.logic.Validate;
import com.adidyk.logic.ValidateService;
import com.adidyk.models.User;
import com.adidyk.persistent.MemoryStore;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Class UserService.
 */
@WebService(endpointInterface = "com.adidyk.ws.UserService")
@XmlSeeAlso(MemoryStore.class)
public class UserServiceImpl implements UserService {

    /**
     * @param logic - logic.
     */
    private Validate logic = ValidateService.getInstance();

    /**
     * add - adds user to container.
     * @param user - user (link variable to object of class User).
     */
    @Override
    public User add(User user) {
        this.logic.add(user);
        return user;
    }

    /**
     * findById - finds user by id in container.
     * @param id - user id.
     * @return - returns user id.
     */
    @Override
    public User findById(String id) {
        return this.logic.findById(id);
    }

    /**
     * findAll - returns all user from container.
     * @return - returns all user.
     */
    public ArrayList<User> findAll() {
        ArrayList<User> list = this.logic.findAll();
        System.out.println(list);
        return list;
    }

    /**
     * test - test method.
     * @return - return string.
     */
    @Override
    public String test() {
        return "TEST TEST TEST";
    }
}
