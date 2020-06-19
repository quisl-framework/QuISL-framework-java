package org.quist.units.qubits.operators.single;

import org.quist.units.qubits.Qubit;
import org.quist.units.qubits.math.algebra.pauli.PauliMatrix;
import org.quist.units.qubits.math.complex.ComplexNumber;
import org.quist.units.qubits.operators.QuantumOperator;

public class PauliX extends QuantumOperator {

    private final Qubit qubit;

    private ComplexNumber[][] pauliXMatrix;

    public PauliX(Qubit qubit) {

        super(qubit, PauliMatrix.getPauliXMatrix());

        this.qubit = qubit;

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
    public void setup() {

        this.pauliXMatrix = this.getQuantumOperatorMatrix();

    }

    public ComplexNumber[][] getPauliXMatrix() {
        return this.pauliXMatrix;
    }


}
