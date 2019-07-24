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
        Endpoint.publish("http://localhost:1986/ws/service", new ServiceImpl());
    }
    //https://memorynotfound.com/jax-ws-soap-web-service-example
    //https://javarush.ru/groups/posts/1168-veb-servisih-shag-1-chto-takoe-veb-servis-i-kak-s-nim-rabotatjh

}