package org.quist.units.qubits.operators.single.pauli;

import org.junit.jupiter.api.Test;
import org.quisl.framework.java.units.computing.quantum.binary.qubits.Qubit;
import org.quisl.framework.java.math.complex.ComplexNumber;

import static org.junit.runner.JUnitCore.runClasses;

class IdentityTest {

    public static void main(String[] args) {

        runClasses(IdentityTest.class);

    }

    @Test
    void testOneIdentity() throws Exception {

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