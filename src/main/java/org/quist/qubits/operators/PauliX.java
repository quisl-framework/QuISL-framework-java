package org.quist.qubits.operators;

import org.quist.qubits.Qubit;

public class PauliX extends QuantumOperator {

    private Qubit qubit;

    private double[][] pauliXMatrix;

    public PauliX(Qubit qubit) {

        super(qubit);

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

        this.pauliXMatrix = new double[][]
                            { {0.0, 1.0},
                              {1.0, 0.0} };

    }

    @Override
    public void apply() {

        float[] qubitAmplitudes = this.qubit.getAmplitudes();


        float[] newQubitAmplitudes = new float[2];


        newQubitAmplitudes[0] =
                (float) (
                                qubitAmplitudes[0] * this.pauliXMatrix[0][0] +
                                qubitAmplitudes[1] * this.pauliXMatrix[1][0]
                        );

        newQubitAmplitudes[1] =
                (float) (
                                qubitAmplitudes[0] * this.pauliXMatrix[0][1] +
                                qubitAmplitudes[1] * this.pauliXMatrix[1][1]
                        );


        this.qubit.setAmplitudes(newQubitAmplitudes);

    }


}
