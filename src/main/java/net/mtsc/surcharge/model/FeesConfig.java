package net.mtsc.surcharge.model;

import java.util.List;

/**
 * @author Fortunatus Ekenachi
 * @date 2020-04-07
 */

public class FeesConfig {

    private List<Fee> fees;

    public List<Fee> getFees() {
        return fees;
    }


    @Override
    public String toString() {
        return "FeesConfig{" +
                "fees=" + fees +
                '}';
    }
}
