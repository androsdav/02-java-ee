package com.adidyk.engine;

import org.springframework.stereotype.Component;

/**
 * Class Boxer defines next method: showEngine.
 * @author Didyk Andrey (androsdav@bigmir.net).
 * @since 09.02.2019.
 * @version 1.0.
 */
@Component("boxer")
public class Boxer implements  Engine {

    /**
     * showEngine - show engine.
     */
    @Override
    public void showEngine() {
        System.out.println("engine-boxer");
    }

}