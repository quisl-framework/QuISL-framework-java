package org.quisl.framework.java.units.qubits.operators.single.pauli;

import org.quisl.framework.java.units.qubits.Qubit;
import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.single.pauli.PauliMatrix;
import org.quisl.framework.java.units.qubits.operators.single.SingleQuantumOperator;

public class PauliZ extends SingleQuantumOperator {

    private ComplexNumber[][] pauliZMatrix;

    public PauliZ(Qubit qubit) throws Exception {

        super(qubit, PauliMatrix.getPauliZMatrix());

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
    public void setup() throws Exception {

        if (this.getNumQubits() != this.getQubits().length) {

            if (this.getNumQubits() != 1) {

                throw new Exception();

            }

        }

        this.pauliZMatrix = this.getQuantumOperatorMatrix();

    }

    public ComplexNumber[][] getPauliZMatrix() {
        return this.pauliZMatrix;
    }

}
