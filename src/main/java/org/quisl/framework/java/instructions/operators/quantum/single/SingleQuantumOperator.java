package org.quisl.framework.java.instructions.operators.quantum.single;

import org.quisl.framework.java.instructions.operators.quantum.QuantumOperator;
import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.units.computing.quantum.binary.qubits.Qubit;

public abstract class SingleQuantumOperator extends QuantumOperator {

    public SingleQuantumOperator(Qubit qubit, ComplexNumber[][] quantumOperatorMatrix) {

        super(1, new Qubit[]{ qubit }, quantumOperatorMatrix);

    }

    public abstract void setup() throws Exception;

    public void apply() {

        ComplexNumber[] qubitAmplitudes = this.getQubits()[0].getAmplitudes();


        ComplexNumber[] newQubitAmplitudes = new ComplexNumber[2];


        newQubitAmplitudes[0] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.getQuantumOperatorMatrix()[0][0]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.getQuantumOperatorMatrix()[1][0])
                );

        newQubitAmplitudes[1] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.getQuantumOperatorMatrix()[0][1]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.getQuantumOperatorMatrix()[1][1])
                );

        this.getQubits()[0].setAmplitudes(newQubitAmplitudes);

        this.setQuantumOperatorApplied(true);

    }

}
