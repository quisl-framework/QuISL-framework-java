package org.quist.units.qubits.operators.single;

import org.quist.units.qubits.Qubit;
import org.quist.units.qubits.math.complex.ComplexNumber;
import org.quist.units.qubits.operators.QuantumOperator;

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
