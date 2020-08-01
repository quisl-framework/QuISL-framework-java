package org.quisl.framework.java.instructions.operators.quantum.multi;

import org.quisl.framework.java.units.qubits.Qubit;
import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.instructions.operators.quantum.QuantumOperator;

public abstract class MultiQuantumOperator extends QuantumOperator {

    private ComplexNumber[] qubitProductAmplitudes;

    public MultiQuantumOperator(Integer numQubits, Qubit[] qubits, ComplexNumber[][] quantumOperatorMatrix) {

        super(numQubits, qubits, quantumOperatorMatrix);

    }

    public abstract void setup() throws Exception;

    public void doProductCross() {

        if(this.getNumQubits() == 2) {

            ComplexNumber[] qubitNo1Amplitudes = this.getQubits()[0].getAmplitudes();
            ComplexNumber[] qubitNo2Amplitudes = this.getQubits()[1].getAmplitudes();

            this.qubitProductAmplitudes = new ComplexNumber[4];

            this.qubitProductAmplitudes[0] =
                    ComplexNumber.multiply(qubitNo1Amplitudes[0], qubitNo2Amplitudes[0]);

            this.qubitProductAmplitudes[1] =
                    ComplexNumber.multiply(qubitNo1Amplitudes[0], qubitNo2Amplitudes[1]);

            this.qubitProductAmplitudes[2] =
                    ComplexNumber.multiply(qubitNo1Amplitudes[1], qubitNo2Amplitudes[0]);

            this.qubitProductAmplitudes[3] =
                    ComplexNumber.multiply(qubitNo1Amplitudes[1], qubitNo2Amplitudes[1]);
        }

    }

    public void apply() {

        if(this.getNumQubits() == 2) {

            ComplexNumber[] newQubitProductAmplitudes = new ComplexNumber[4];

            for(int column = 0; column < this.getQuantumOperatorMatrix()[0].length; column++) {

                newQubitProductAmplitudes[column] =
                        ComplexNumber.add(
                                ComplexNumber.multiply(this.qubitProductAmplitudes[0], this.getQuantumOperatorMatrix()[0][column]),
                                ComplexNumber.multiply(this.qubitProductAmplitudes[1], this.getQuantumOperatorMatrix()[1][column]),
                                ComplexNumber.multiply(this.qubitProductAmplitudes[2], this.getQuantumOperatorMatrix()[2][column]),
                                ComplexNumber.multiply(this.qubitProductAmplitudes[3], this.getQuantumOperatorMatrix()[3][column])
                        );

            }

            this.qubitProductAmplitudes = newQubitProductAmplitudes;

            this.setQuantumOperatorApplied(true);

        }

    }

    public ComplexNumber[] getQubitProductAmplitudes() {
        return this.qubitProductAmplitudes;
    }
}
