package org.quisl.framework.java.instructions.operators.quantum;

import org.quisl.framework.java.instructions.operators.Operator;
import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.units.computing.quantum.binary.qubits.Qubit;

public abstract class QuantumOperator extends Operator {

    private Integer numQubits;

    private Qubit[] qubits;

    private ComplexNumber[][] quantumOperatorMatrix;

    private boolean quantumOperatorApplied;

    public QuantumOperator(Long quantumOperatorId, Integer numQubits, Qubit[] qubits,
                           ComplexNumber[][] quantumOperatorMatrix) {

        super(quantumOperatorId);

        this.numQubits = numQubits;
        this.qubits = qubits;
        this.quantumOperatorMatrix = quantumOperatorMatrix;
        this.quantumOperatorApplied = false;

    }

    public Integer getNumQubits() {
        return this.numQubits;
    }

    public Qubit[] getQubits() {
        return this.qubits;
    }

    public void setQubits(Qubit[] qubits) {
        this.qubits = qubits;
    }

    public ComplexNumber[][] getQuantumOperatorMatrix() {
        return this.quantumOperatorMatrix;
    }

    public void setQuantumOperatorMatrix(ComplexNumber[][] quantumOperatorMatrix) {
        this.quantumOperatorMatrix = quantumOperatorMatrix;
    }

    public abstract String getName();

    public abstract String getInfo();

    public boolean isQuantumOperatorApplied() {
        return this.quantumOperatorApplied;
    }

    public void setQuantumOperatorApplied(boolean quantumOperatorApplied) {
        this.quantumOperatorApplied = quantumOperatorApplied;
    }

}
