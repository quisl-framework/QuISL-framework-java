package org.quisl.framework.java.units.qubits.operators.single.pauli;

import org.quisl.framework.java.units.qubits.Qubit;
import org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.single.pauli.PauliMatrix;
import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.operators.single.SingleQuantumOperator;

public class Identity extends SingleQuantumOperator {

    private ComplexNumber[][] identityMatrix;

    public Identity(Qubit qubit) throws Exception {

        super(qubit, PauliMatrix.getPauliIMatrix());

        this.setup();

    }

    @Override
    public String getName() {
        return "Identity";
    }

    @Override
    public String getInfo() {
        return "Don't performs any change on the Bloch Sphere;";
    }

    @Override
    public void setup() throws Exception {

        if (this.getNumQubits() != this.getQubits().length) {

            if (this.getNumQubits() != 1) {

                throw new Exception();

            }

        }

        this.identityMatrix = this.getQuantumOperatorMatrix();
    }

    public ComplexNumber[][] getIdentityMatrix() {
        return this.identityMatrix;
    }

}
