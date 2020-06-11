package org.quist.qubits.operators;

import org.quist.qubits.Qubit;
import org.quist.qubits.math.ComplexNumber;

public class PauliZ extends QuantumOperator {

    private final Qubit qubit;

    private ComplexNumber[][] pauliZMatrix;

    public PauliZ(Qubit qubit) {

        super(qubit);

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

        this.pauliZMatrix = new ComplexNumber[][]
                      { { new ComplexNumber(1.0, 0.0), new ComplexNumber(0.0, 0.0) },
                        { new ComplexNumber(0.0, 0.0), new ComplexNumber(-1.0, 0.0) } };

    }

    @Override
    public void apply() {

        ComplexNumber[] qubitAmplitudes = this.qubit.getAmplitudes();


        ComplexNumber[] newQubitAmplitudes = new ComplexNumber[2];


        newQubitAmplitudes[0] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.pauliZMatrix[0][0]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.pauliZMatrix[1][0])
                );

        newQubitAmplitudes[1] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.pauliZMatrix[0][1]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.pauliZMatrix[1][1])
                );

        this.qubit.setAmplitudes(newQubitAmplitudes);

    }


}
