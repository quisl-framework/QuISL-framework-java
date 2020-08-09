package org.quisl.framework.java.circuits.utils.common;

public enum MomentPrefixes {

    CLASSICAL_MOMENT("Classical"),
    QUANTUM_MOMENT("Quantum");

    private final String momentPrefix;


    MomentPrefixes(String momentPrefix) {

        this.momentPrefix = momentPrefix;

    }

    public String getMomentPrefix() {

        return this.momentPrefix;

    }

}
