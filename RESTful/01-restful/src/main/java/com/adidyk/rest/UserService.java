package com.adidyk.rest;

import com.adidyk.models.User;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Class UserService.
 */
@Path("/user")
public class UserService {

    /**
     * getUser - returns user.
     * @return - returns user.
     */
    @Path("/user")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public User getUser() {
        User user = new User(1, "bob", "white", 35);
        return user;
    }

}