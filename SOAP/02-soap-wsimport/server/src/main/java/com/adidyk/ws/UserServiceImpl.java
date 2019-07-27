package com.adidyk.ws;

import com.adidyk.logic.Validate;
import com.adidyk.logic.ValidateService;
import com.adidyk.models.User;
import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Class UserService.
 */
@WebService(endpointInterface = "com.adidyk.ws.UserService")
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
     * update - updates user by id in container.
     * @param user - user (link variable to object of class User).
     */
    @Override
    public void update(User user) {
        this.logic.update(user);
    }

    /**
     * delete - deletes user by id from container.
     * @param id - user id.
     * @return - returns id.
     */
    @Override
    public String delete(String id) {
        return this.logic.delete(id);
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
    @Override
    public User[] findAll() {
        ArrayList<User> list = this.logic.findAll();
        User[] item = list.toArray(new User[list.size()]);
        System.out.println(list);
        return item;
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
