package org.quist.qubits.operators;

import org.junit.jupiter.api.Test;
import org.quist.qubits.Qubit;

import static org.junit.runner.JUnitCore.runClasses;

class PauliXTest {

    public static void main(String[] args) {

        runClasses(PauliXTest.class);

    }

    @Test
    void testOnePauliX() {

        Qubit qubit = new Qubit(1L);

        float[] qubitAmplitudes;

        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0] == 1.0);
        assert (qubitAmplitudes[1] == 0.0);


        qubit.applyPauliX();

        qubit.measure();


        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0] == 0.0);
        assert (qubitAmplitudes[1] == 1.0);

        assert (qubit.getFinalOutcomeAfterMeasurement() == 1);

    }

    @Test
    void testTwoPauliX() {

        Qubit qubit = new Qubit(2L);

        float[] qubitAmplitudes;

        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0] == 1.0);
        assert (qubitAmplitudes[1] == 0.0);


        qubit.applyPauliX();

        qubit.applyPauliX();

        qubit.measure();


        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0] == 1.0);
        assert (qubitAmplitudes[1] == 0.0);

        assert (qubit.getFinalOutcomeAfterMeasurement() == 0);

    }

}