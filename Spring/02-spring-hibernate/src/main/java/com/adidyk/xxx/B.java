package com.adidyk.xxx;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;

public class B {

    @Autowired
    public B() {
        System.out.println("create bean B: " + this);
    }
}
