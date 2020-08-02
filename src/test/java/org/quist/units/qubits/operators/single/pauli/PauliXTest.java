package org.quist.units.qubits.operators.single.pauli;

import org.junit.jupiter.api.Test;
import org.quisl.framework.java.units.computing.quantum.binary.qubits.Qubit;
import org.quisl.framework.java.math.complex.ComplexNumber;

import static org.junit.runner.JUnitCore.runClasses;

class PauliXTest {

    public static void main(String[] args) {

        runClasses(PauliXTest.class);

    }

    @Test
    void testOnePauliX() throws Exception {

        Qubit qubit = new Qubit(1L);

        ComplexNumber[] qubitAmplitudes;

        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);


        qubit.applyPauliX();

        qubit.measure();


        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 0.0);
        assert (qubitAmplitudes[1].modulus() == 1.0);

        assert (qubit.getFinalOutcomeAfterMeasurement() == 1);

    }

    @Test
    void testTwoPauliX() throws Exception {

        Qubit qubit = new Qubit(2L);

        ComplexNumber[] qubitAmplitudes;

        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);


        qubit.applyPauliX();

        qubit.applyPauliX();

        qubit.measure();


        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);

        assert (qubit.getFinalOutcomeAfterMeasurement() == 0);

    }

}