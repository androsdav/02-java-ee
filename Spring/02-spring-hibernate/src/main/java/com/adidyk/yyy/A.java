package com.adidyk.yyy;

import com.adidyk.xxx.B;
import com.adidyk.xxx.C;
import org.springframework.beans.factory.annotation.Autowired;

public class A {

    private B b;

    private C c;

    @Autowired
    public A() {
        System.out.println("create bean A: " + this);
    }

    @Autowired(required = false)
    public void setB(B b) {
        this.b = b;
        System.out.println("setting A.b: " + this.b);
    }

    @Autowired(required = false)
    public void setC(C c) {
        this.c = c;
        System.out.println("setting A.c: " + this.c);
    }

}