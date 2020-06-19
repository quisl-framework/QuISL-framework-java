package org.quist.units.qubits.operators.single;

import org.quist.units.qubits.Qubit;
import org.quist.units.qubits.math.algebra.pauli.PauliMatrix;
import org.quist.units.qubits.math.complex.ComplexNumber;
import org.quist.units.qubits.operators.QuantumOperator;

public class PauliY extends QuantumOperator {

    private final Qubit qubit;

    private ComplexNumber[][] pauliYMatrix;

    public PauliY(Qubit qubit) {

        super(qubit, PauliMatrix.getPauliYMatrix());

        this.qubit = qubit;

        this.setup();

    }

    @Override
    public String getName() {
        return "PauliY";
    }

    @Override
    public String getInfo() {
        return "Rotates 90º around the Y Axis of the Bloch Sphere;";
    }

    @Override
    public void setup() {

        this.pauliYMatrix = this.getQuantumOperatorMatrix();

    }

    public ComplexNumber[][] getPauliYMatrix() {
        return this.pauliYMatrix;
    }

}
