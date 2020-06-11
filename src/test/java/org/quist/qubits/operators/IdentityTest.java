package org.quist.qubits.operators;

import org.junit.jupiter.api.Test;
import org.quist.qubits.Qubit;
import org.quist.qubits.math.ComplexNumber;

import static org.junit.runner.JUnitCore.runClasses;

class IdentityTest {

    public static void main(String[] args) {

        runClasses(IdentityTest.class);

    }

    @Test
    void testOneIdentity() {

        Qubit qubit = new Qubit(1L);

        ComplexNumber[] qubitAmplitudes;

        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);


        qubit.applyIdentity();

        qubit.measure();


        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);

        assert (qubit.getFinalOutcomeAfterMeasurement() == 0);

    }

}