package org.quisl.framework.java.units.qubits.operators.single.pauli;

import org.quisl.framework.java.units.qubits.Qubit;
import org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.single.pauli.PauliMatrix;
import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.operators.single.SingleQuantumOperator;

public class PauliX extends SingleQuantumOperator {

    private ComplexNumber[][] pauliXMatrix;

    public PauliX(Qubit qubit) throws Exception {

        super(qubit, PauliMatrix.getPauliXMatrix());

        this.setup();

    }

    @Override
    public String getName() {
        return "PauliX";
    }

    @Override
    public String getInfo() {
        return "Rotates 90º around the X Axis of the Bloch Sphere;\n" +
               "Acts like a Classical Bit Flip (NOT) ( e.g.: |0⟩ -> |1⟩ or |1⟩ -> |0⟩ );";
    }

    @Override
    public void setup() throws Exception {

        if (this.getNumQubits() != this.getQubits().length) {

            if (this.getNumQubits() != 1) {

                throw new Exception();

            }

        }

        this.pauliXMatrix = this.getQuantumOperatorMatrix();

    }

    public ComplexNumber[][] getPauliXMatrix() {
        return this.pauliXMatrix;
    }

}