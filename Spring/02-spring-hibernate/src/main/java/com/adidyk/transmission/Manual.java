package com.adidyk.transmission;

import org.springframework.stereotype.Component;

/**
 * Class Manual defines next method for container of users: showTransmission.
 * @author Didyk Andrey (androsdav@bigmir.net).
 * @since 09.02.2019.
 * @version 1.0.
 */
@Component("manual")
public class Manual implements Transmission {

    /**
     * showTransmission - show transmission.
     */
    @Override
    public void showTransmission() {
        System.out.println("transmission-manual");
    }

}