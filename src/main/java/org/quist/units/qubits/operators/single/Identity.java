package org.quist.units.qubits.operators.single;

import org.quist.units.qubits.Qubit;
import org.quist.units.qubits.math.algebra.pauli.PauliMatrix;
import org.quist.units.qubits.math.complex.ComplexNumber;
import org.quist.units.qubits.operators.QuantumOperator;

public class Identity extends QuantumOperator {

    private final Qubit qubit;

    private ComplexNumber[][] identityMatrix;

    public Identity(Qubit qubit) {

        super(qubit, PauliMatrix.getPauliIMatrix());

        this.qubit = qubit;

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
    public void setup() {
        this.identityMatrix = new ComplexNumber[][]
                { { new ComplexNumber(1.0, 0.0), new ComplexNumber(0.0, 0.0) },
                  { new ComplexNumber(0.0, 0.0), new ComplexNumber(1.0, 0.0) } };
    }

    @Override
    public void apply() {

        ComplexNumber[] qubitAmplitudes = this.qubit.getAmplitudes();


        ComplexNumber[] newQubitAmplitudes = new ComplexNumber[2];


        newQubitAmplitudes[0] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.identityMatrix[0][0]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.identityMatrix[1][0])
                );

        newQubitAmplitudes[1] =
                ComplexNumber.add(
                        ComplexNumber.multiply(qubitAmplitudes[0], this.identityMatrix[0][1]),
                        ComplexNumber.multiply(qubitAmplitudes[1], this.identityMatrix[1][1])
                );

        this.qubit.setAmplitudes(newQubitAmplitudes);
    }
}
