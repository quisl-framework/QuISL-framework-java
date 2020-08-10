package org.quisl.framework.java.common;

public enum ComputingPrefixes {

    CLASSICAL_PREFIX("Classical"),
    QUANTUM_PREFIX("Quantum");

    private final String computingPrefix;


    ComputingPrefixes(String computingPrefix) {

        this.computingPrefix = computingPrefix;

    }

    public String getComputingPrefix() {

        return this.computingPrefix;

    }

}
