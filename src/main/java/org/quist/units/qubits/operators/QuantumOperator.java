package org.quist.units.qubits.operators;

import org.quist.units.qubits.Qubit;
import org.quist.units.qubits.math.complex.ComplexNumber;

public abstract class QuantumOperator {

    private Qubit qubit;

    private ComplexNumber[][] quantumOperatorMatrix;

    public QuantumOperator(Qubit qubit, ComplexNumber[][] quantumOperatorMatrix) {

        this.qubit = qubit;
        this.quantumOperatorMatrix = quantumOperatorMatrix;

    }

    public Qubit getQubit() {
        return this.qubit;
    }

    public void setQubit(Qubit qubit) {
        this.qubit = qubit;
    }

    public ComplexNumber[][] getQuantumOperatorMatrix() {
        return this.quantumOperatorMatrix;
    }

    public void setQuantumOperatorMatrix(ComplexNumber[][] quantumOperatorMatrix) {
        this.quantumOperatorMatrix = quantumOperatorMatrix;
    }

    public abstract String getName();

    public abstract String getInfo();

    public abstract void setup();

    public void apply() {

        ComplexNumber[] qubitAmplitudes = this.qubit.getAmplitudes();


        ComplexNumber[] newQubitAmplitudes = new ComplexNumber[2];


        newQubitAmplitudes[0] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.quantumOperatorMatrix[0][0]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.quantumOperatorMatrix[1][0])
                );

        newQubitAmplitudes[1] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.quantumOperatorMatrix[0][1]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.quantumOperatorMatrix[1][1])
                );

        this.qubit.setAmplitudes(newQubitAmplitudes);
    }

}
