package org.quist.qubits.operators.single;

import org.junit.jupiter.api.Test;
import org.quist.qubits.Qubit;
import org.quist.qubits.math.ComplexNumber;

import static org.junit.runner.JUnitCore.runClasses;

class HadamardTest {

    public static void main(String[] args) {

        runClasses(HadamardTest.class);

    }

    @Test
    void testOneHadamard() {

        Qubit qubit = new Qubit(1L);

        ComplexNumber[] qubitAmplitudes;

        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);


        qubit.applyHadamard();

        qubit.measure();


        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0/Math.sqrt(2.0));
        assert (qubitAmplitudes[1].modulus() == 1.0/Math.sqrt(2.0));

    }

    @Test
    void testTwoHadamard() {

        Qubit qubit = new Qubit(2L);

        ComplexNumber[] qubitAmplitudes;

        qubitAmplitudes = qubit.getAmplitudes();

        assert (qubitAmplitudes[0].modulus() == 1.0);
        assert (qubitAmplitudes[1].modulus() == 0.0);


        qubit.applyHadamard();

        qubit.applyHadamard();

        qubit.measure();


        qubitAmplitudes = qubit.getAmplitudes();

        assert (Math.round(qubitAmplitudes[0].modulus()) == 1.0);
        assert (Math.round(qubitAmplitudes[1].modulus()) == 0.0);

        assert (qubit.getFinalOutcomeAfterMeasurement() == 0);

    }

}