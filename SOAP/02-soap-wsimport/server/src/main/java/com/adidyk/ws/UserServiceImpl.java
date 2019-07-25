package com.adidyk.ws;

import com.adidyk.logic.Validate;
import com.adidyk.logic.ValidateService;
import com.adidyk.models.User;

import javax.jws.WebService;

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
     * findById - finds user by id in container.
     * @param id - user id.
     * @return - returns user id.
     */
    @Override
    public User findById(String id) {
        return this.logic.findById(id);
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
