package com.adidyk.xxx;

import org.springframework.beans.factory.annotation.Autowired;

public class C {

    @Autowired
    public C() {
        System.out.println("create bean C: " + this);
    }
}