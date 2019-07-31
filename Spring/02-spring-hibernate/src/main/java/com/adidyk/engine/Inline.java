package com.adidyk.engine;

import org.springframework.stereotype.Component;

/**
 * Class Inline defines next method: showEngine.
 * @author Didyk Andrey (androsdav@bigmir.net).
 * @since 09.02.2019.
 * @version 1.0.
 */
@Component("inline")
public class Inline implements Engine {

    /**
     * showEngine - show engine.
     */
    @Override
    public void showEngine() {
        System.out.println("engine-inline");
    }

}