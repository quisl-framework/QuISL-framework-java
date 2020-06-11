package org.quist.qubits.operators;

import org.quist.qubits.Qubit;
import org.quist.qubits.math.ComplexNumber;

public class PauliY extends QuantumOperator {

    private final Qubit qubit;

    private ComplexNumber[][] pauliYMatrix;

    public PauliY(Qubit qubit) {

        super(qubit);

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

        this.pauliYMatrix = new ComplexNumber[][]
                      { { new ComplexNumber(0.0, 0.0), ComplexNumber.neg_i },
                        { ComplexNumber.i, new ComplexNumber(0.0, 0.0)} };

    }

    @Override
    public void apply() {

        ComplexNumber[] qubitAmplitudes = this.qubit.getAmplitudes();


        ComplexNumber[] newQubitAmplitudes = new ComplexNumber[2];


        newQubitAmplitudes[0] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.pauliYMatrix[0][0]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.pauliYMatrix[1][0])
                );

        newQubitAmplitudes[1] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.pauliYMatrix[0][1]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.pauliYMatrix[1][1])
                );

        this.qubit.setAmplitudes(newQubitAmplitudes);

    }


}
