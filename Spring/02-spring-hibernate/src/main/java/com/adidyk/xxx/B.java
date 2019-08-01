package com.adidyk.xxx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class B {

    //@Autowired
    public B() {
        System.out.println("create bean B: " + this);
    }
}
