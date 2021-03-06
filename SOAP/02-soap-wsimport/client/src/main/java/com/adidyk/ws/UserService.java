package com.adidyk.ws;

import com.adidyk.models.User;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * UserService - interface.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserService {

    /**
     * add - adds user to container.
     * @param user - user (link variable to object of class User).
     */
    @WebMethod
    User add(User user);

    /**
     * update - updates user by id in container.
     * @param user - user (link variable to object of class User).
     */
    @WebMethod
    void update(User user);

    /**
     * delete - deletes user by id from container.
     * @param id - user id.
     * @return - returns id.
     */
    @WebMethod
    String delete(String id);

    /**
     * findById - finds user by id in container.
     * @param id - user id.
     * @return - returns user id.
     */
    @WebMethod
    User findById(String id);

    /**
     * findAll - returns all user from container.
     * @return - returns all user.
     */
    @WebMethod
    User[] findAll();

    /**
     * test - test method.
     * @return - return string.
     */
    @WebMethod
    public String test();

}