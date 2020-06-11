package org.quist.qubits.operators;

import org.quist.qubits.Qubit;

public abstract class QuantumOperator {

    private Qubit qubit;

    public QuantumOperator(Qubit qubit) {

        this.qubit = qubit;

    }

    public abstract String getName();

    public abstract String getInfo();

    public abstract void setup();

    public abstract void apply();

}
