package com.adidyk.rest;

import com.adidyk.logic.Validate;
import com.adidyk.logic.ValidateService;
import com.adidyk.models.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
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
     * addUser - adds user to memory store.
     * @param firstName - user first name.
     * @param lastName - user last name.
     * @param age - user age.
     */
    @GET
    @Path("/add/{firstName}/{lastName}/{age}")
    public String addUser(@PathParam("firstName")String firstName,
                          @PathParam("lastName")String lastName,
                          @PathParam("age")int age) {
        User user = new User(firstName, lastName, age);
        this.logic.add(user);
        return "add is good";
    }

    /**
     * addUser - adds user to memory store.
     */
    @POST
    @Path("/adds")
    @Produces({MediaType.APPLICATION_XML})
    public String addUser(User user) {
        System.out.println("        -----------------TEST: " + user);
        this.logic.add(user);
        return "post";
    }


    /**
     * getUser - returns user by id.
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
     * getAllUser - returns all user.
     * @return - returns all user.
     */
    @GET
    @Path("/get_all")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<User> getAllUser() {
        return this.logic.findAll();
    }

    /*
    /**
     * getHello - get hello.
     * @param msg - message.
     * @return - returns response.
     */
    /*
    @Path("/get_hello/{param}")
    @GET
    public Response getHello(@PathParam("param")String msg) {
        return Response.status(200).entity("Welcome to RESTful Jersey example - " + msg).build();
    }

    /**
     * getText - returns text.
     * @return - returns text.
     */
    /*
    @Path("/get_text")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        return "test get text";
    }

    /**
     * getUser - returns user.
     * @return - returns user.
     */
    /*
    @Path("/get_user_json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser() {
        return new User("1", "bob", "white", 35);
    }

    /**
     * getUserParam - gets user inputted params.
     * @param id - user id.
     * @param firstName - user first name.
     * @param lastName - user last name.
     * @param age - user age.
     * @return - returns user inputted params.
     */
    /*
    @Path("/get_user_xml/{id}/{firstName}/{lastName}/{age}")
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public User getUserParam(@PathParam("id")int id,
                             @PathParam("firstName")String firstName,
                             @PathParam("lastName")String lastName,
                             @PathParam("age")int age) {
        return new User(id, firstName, lastName, age);
    }

    /**
     * getUserParam - gets user inputted params.
     * @param id - user id.
     * @param firstName - user first name.
     * @param lastName - user last name.
     * @param age - user age.
     * @return - returns user inputted params.
     */
    /*
    @Path("/get_user_xml/{id}/{firstName}/{lastName}/{age}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public User getUserQueryParam(@PathParam("id")int id,
                             @PathParam("firstName")String firstName,
                             @PathParam("lastName")String lastName,
                             @PathParam("age")int age) {
        return new User(id, firstName, lastName, age);
    }
    */

}