package org.quisl.framework.java.circuits.utils;

import java.util.Map;

public abstract class Moment {

    private Long numMoment;

    private String prefix;


    public Moment(Long numMoment, String prefix) {

        this.numMoment = numMoment;
        this.prefix = prefix;

    }

    public Long getNumMoment() {

        return this.numMoment;

    }

    public String getPrefix() {

        return this.prefix;

    }

}
