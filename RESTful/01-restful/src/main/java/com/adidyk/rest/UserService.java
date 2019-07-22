package com.adidyk.rest;

import com.adidyk.models.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Class UserService.
 */
@Path("/user_service")
public class UserService {

    /**
     * getHello - get hello.
     * @param msg - message.
     * @return - returns response.
     */
    @Path("/get_hello/{param}")
    @GET
    public Response getHello(@PathParam("param")String msg) {
        return Response.status(200).entity("Welcome to RESTful Jersey example - " + msg).build();
    }

    /**
     * getText - returns text.
     * @return - returns text.
     */
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
    @Path("/get_user_xml")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public User getUser() {
        return new User(1, "bob", "white", 35);
    }

    /**
     * getUserParam - gets user inputted params.
     * @param id - user id.
     * @param firstName - user first name.
     * @param lastName - user last name.
     * @param age - user age.
     * @return - returns user inputted params.
     */
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
     *
     */
    @Path("/query")
    @GET
    public Response getQueryParameters(@QueryParam("parameter1")String parameter1,
                                       @QueryParam("parameter2")String parameter2) {
        String output = "Parameter1 :" + parameter1 + " Parameter2 : " + parameter2;
        return Response.status(200).entity(output).build();
    }

}