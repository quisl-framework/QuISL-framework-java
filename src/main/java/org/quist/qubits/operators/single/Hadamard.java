package org.quist.qubits.operators.single;

import org.quist.qubits.Qubit;
import org.quist.qubits.math.ComplexNumber;
import org.quist.qubits.operators.QuantumOperator;

public class Hadamard extends QuantumOperator {

    private final Qubit qubit;

    private ComplexNumber[][] pauliXMatrix;

    public Hadamard(Qubit qubit) {

        super(qubit);

        this.qubit = qubit;

        this.setup();

    }

    @Override
    public String getName() {
        return "Hadamard";
    }

    @Override
    public String getInfo() {
        return "Rotates 90º around the X Axis of the Bloch Sphere;\n" +
               "Acts like a Classical Bit Flip (NOT) ( e.g.: |0⟩ -> |1⟩ or |1⟩ -> |0⟩ );";
    }

    @Override
    public void setup() {

        this.pauliXMatrix = new ComplexNumber[][]
                            { { new ComplexNumber(1.0/Math.sqrt(2.0), 0.0), new ComplexNumber(1.0/Math.sqrt(2.0), 0.0) },
                              { new ComplexNumber(1.0/Math.sqrt(2.0), 0.0), new ComplexNumber(-1.0/Math.sqrt(2.0), 0.0) } };

    }

    @Override
    public void apply() {

        ComplexNumber[] qubitAmplitudes = this.qubit.getAmplitudes();


        ComplexNumber[] newQubitAmplitudes = new ComplexNumber[2];


        newQubitAmplitudes[0] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.pauliXMatrix[0][0]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.pauliXMatrix[1][0])
                );

        newQubitAmplitudes[1] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.pauliXMatrix[0][1]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.pauliXMatrix[1][1])
                );

        this.qubit.setAmplitudes(newQubitAmplitudes);

    }


}
