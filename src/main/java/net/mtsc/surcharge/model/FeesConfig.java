package net.mtsc.surcharge.model;

import java.util.List;



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
