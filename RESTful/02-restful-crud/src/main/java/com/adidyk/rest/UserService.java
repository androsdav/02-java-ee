package com.adidyk.rest;

import com.adidyk.logic.Validate;
import com.adidyk.logic.ValidateService;
import com.adidyk.models.User;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Class UserService.
 */
@Path("/user")
public class UserService {

    /**
     * @param logic - link variable to object of class ValidateService (singleton).
     */
    private final Validate logic = ValidateService.getInstance();

    /**
     * addUser(create) - adds user to memory store.
     */
    @POST
    @Path("/add")
    @Produces({MediaType.APPLICATION_XML})
    @Consumes(MediaType.APPLICATION_XML)
    public void addUser(User user) {
        this.logic.add(user);
    }

    /**
     * getUser(read) - returns user by id.
     * @param id - user id.
     * @return - returns user by id.
     */
    @GET
    @Path("/get/{id}")
    @Produces({MediaType.APPLICATION_XML})
    public User getUser(@PathParam("id")String id) {
        return this.logic.findById(id);
    }

    /**
     * updateUser (update) - update uer.
     * @param user - user.
     */
    @PUT
    @Path("/update")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void updateUser(User user) {
        this.logic.update(user);
    }

    /**
     * deleteUser - delete user.
     * @param user - user.
     */
    @DELETE
    @Path("/delete")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void deleteUser(User user) {
        this.logic.delete(user.getId());
    }

    /**
     * getAllUser - returns all user.
     * @return - returns all user.
     */
    @GET
    @Path("/get_all")
    @Produces({MediaType.APPLICATION_XML})
    public List<User> getAllUser() {
        return this.logic.findAll();
    }

}

//https://memorynotfound.com/jax-ws-soap-web-service-example/
//http://java-online.ru/web-service-soap-client.xhtml