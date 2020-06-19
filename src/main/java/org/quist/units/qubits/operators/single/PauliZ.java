package org.quist.units.qubits.operators.single;

import org.quist.units.qubits.Qubit;
import org.quist.units.qubits.math.algebra.pauli.PauliMatrix;
import org.quist.units.qubits.math.complex.ComplexNumber;
import org.quist.units.qubits.operators.QuantumOperator;

public class PauliZ extends QuantumOperator {

    private final Qubit qubit;

    private ComplexNumber[][] pauliZMatrix;

    public PauliZ(Qubit qubit) {

        super(qubit, PauliMatrix.getPauliZMatrix());

        this.qubit = qubit;

        this.setup();

    }

    @Override
    public String getName() {
        return "PauliZ";
    }

    @Override
    public String getInfo() {
        return "Rotates 90º around the Z Axis of the Bloch Sphere;";
    }

    @Override
    public void setup() {

        this.pauliZMatrix = this.getQuantumOperatorMatrix();

    }

    public ComplexNumber[][] getPauliZMatrix() {
        return this.pauliZMatrix;
    }
}
