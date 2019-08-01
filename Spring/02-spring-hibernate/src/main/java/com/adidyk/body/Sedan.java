package com.adidyk.body;

import org.springframework.stereotype.Component;

/**
 * Class Sedan defines next method: showBody.
 * @author Didyk Andrey (androsdav@bigmir.net).
 * @since 09.02.2019.
 * @version 1.0.
 */
@Component//("sedan")
public class Sedan implements Body {

    /**
     * showBody - show body.
     */
    @Override
    public void showBody() {
        System.out.println("body-sedan");
    }

}