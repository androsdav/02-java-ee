package com.adidyk.ws;

import javax.xml.ws.Endpoint;

/**
 * Class WebServicePublisher.
 */
public class WebServicePublisher {

    /**
     * main - just main.
     * @param arg - arg.
     */
    public static void main(String[]arg) {
        Endpoint.publish("http://localhost:1987/ws/user", new UserServiceImpl());
    }

}