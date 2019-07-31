package com.adidyk.transmission;

import org.springframework.stereotype.Component;

/**
 * Class Automatic defines next method: showTransmission.
 * @author Didyk Andrey (androsdav@bigmir.net).
 * @since 09.02.2019.
 * @version 1.0.
 */
@Component("automatic")
public class Automatic implements Transmission {

    /**
     * showTransmission - show transmission.
     */
    @Override
    public void showTransmission() {
        System.out.println("transmission-automatic");
    }

}