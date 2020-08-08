package org.quisl.framework.java.circuits.common;

public enum CircuitPrefixes {

    CLASSICAL_CIRCUIT("Classical"),
    QUANTUM_CIRCUIT("Quantum");

    private final String circuitPrefix;


    CircuitPrefixes(String circuitPrefix) {

        this.circuitPrefix = circuitPrefix;

    }

    public String getCircuitPrefix() {

        return this.circuitPrefix;

    }

}
