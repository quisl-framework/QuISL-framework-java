package org.quist.units.qubits.operators.multi.swap;

import org.junit.jupiter.api.Test;
import org.quisl.framework.java.units.qubits.Qubit;
import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;

import static org.junit.runner.JUnitCore.runClasses;

class SwapTest {

    public static void main(String[] args) {

        System.out.println("TESTS FOR THE SWAP QUANTUM OPERATOR:\n\n\n");

        runClasses(SwapTest.class);

    }

    @Test
    void testOneSwap() throws Exception {

        System.out.println("1 (One) Swap Quantum Operator:\n");

        Qubit qubitNo1 = new Qubit(1L);
        Qubit qubitNo2 = new Qubit(2L);

        ComplexNumber[] qubitNo1Amplitudes;
        ComplexNumber[] qubitNo2Amplitudes;

        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

        qubitNo1.applySwap(qubitNo2);

        qubitNo1.measure();
        qubitNo2.measure();


        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

    }

    @Test
    void testTwoSwaps() throws Exception {

        System.out.println("2 (Two) Swap Quantum Operator:\n");

        Qubit qubitNo1 = new Qubit(1L);
        Qubit qubitNo2 = new Qubit(2L);

        ComplexNumber[] qubitNo1Amplitudes;
        ComplexNumber[] qubitNo2Amplitudes;

        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

        qubitNo1.applySwap(qubitNo2);
        qubitNo1.applySwap(qubitNo2);

        qubitNo1.measure();
        qubitNo2.measure();


        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

    }

    @Test
    void testOnePauliXOnFirstQubitAndOneSwap() throws Exception {

        System.out.println("1 (One) PauliX Quantum Operator applied to the 1st Qubit, " +
                           "followed by 1 (One) Swap Quantum Operator:\n");

        Qubit qubitNo1 = new Qubit(1L);
        Qubit qubitNo2 = new Qubit(2L);

        ComplexNumber[] qubitNo1Amplitudes;
        ComplexNumber[] qubitNo2Amplitudes;

        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

        qubitNo1.applyPauliX();

        Qubit[] qubitsSwapped = qubitNo1.applySwap(qubitNo2);

        qubitNo1 = qubitsSwapped[0];
        qubitNo2 = qubitsSwapped[1];

        qubitNo1.measure();
        qubitNo2.measure();


        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 0.0);
        assert (qubitNo2Amplitudes[1].modulus() == 1.0);

    }

    @Test
    void testOnePauliXOnSecondQubitAndOneSwap() throws Exception {

        System.out.println("1 (One) PauliX Quantum Operator applied to the 2nd Qubit, " +
                           "followed by 1 (One) Swap Quantum Operator:\n");

        Qubit qubitNo1 = new Qubit(1L);
        Qubit qubitNo2 = new Qubit(2L);

        ComplexNumber[] qubitNo1Amplitudes;
        ComplexNumber[] qubitNo2Amplitudes;

        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

        qubitNo2.applyPauliX();

        Qubit[] qubitsSwapped = qubitNo1.applySwap(qubitNo2);

        qubitNo1 = qubitsSwapped[0];
        qubitNo2 = qubitsSwapped[1];

        qubitNo1.measure();
        qubitNo2.measure();


        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 0.0);
        assert (qubitNo1Amplitudes[1].modulus() == 1.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

    }

    @Test
    void testOnePauliXOnFirstQubitAndTwoSwaps() throws Exception {

        System.out.println("1 (One) PauliX Quantum Operator applied to the 1st Qubit, " +
                           "followed by 2 (Two) Swap Quantum Operators:\n");

        Qubit qubitNo1 = new Qubit(1L);
        Qubit qubitNo2 = new Qubit(2L);

        ComplexNumber[] qubitNo1Amplitudes;
        ComplexNumber[] qubitNo2Amplitudes;

        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

        qubitNo1.applyPauliX();


        Qubit[] qubitsSwapped;


        qubitsSwapped = qubitNo1.applySwap(qubitNo2);

        qubitNo1 = qubitsSwapped[0];
        qubitNo2 = qubitsSwapped[1];


        qubitsSwapped = qubitNo1.applySwap(qubitNo2);

        qubitNo1 = qubitsSwapped[0];
        qubitNo2 = qubitsSwapped[1];


        qubitNo1.measure();
        qubitNo2.measure();


        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 0.0);
        assert (qubitNo1Amplitudes[1].modulus() == 1.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

    }

    @Test
    void testOnePauliXOnSecondQubitAndTwoSwaps() throws Exception {

        System.out.println("1 (One) PauliX Quantum Operator applied to the 2nd Qubit, " +
                           "followed by 2 (Two) Swap Quantum Operators:\n");

        Qubit qubitNo1 = new Qubit(1L);
        Qubit qubitNo2 = new Qubit(2L);

        ComplexNumber[] qubitNo1Amplitudes;
        ComplexNumber[] qubitNo2Amplitudes;

        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

        qubitNo2.applyPauliX();


        Qubit[] qubitsSwapped;


        qubitsSwapped = qubitNo1.applySwap(qubitNo2);

        qubitNo1 = qubitsSwapped[0];
        qubitNo2 = qubitsSwapped[1];


        qubitsSwapped = qubitNo1.applySwap(qubitNo2);

        qubitNo1 = qubitsSwapped[0];
        qubitNo2 = qubitsSwapped[1];


        qubitNo1.measure();
        qubitNo2.measure();


        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 0.0);
        assert (qubitNo2Amplitudes[1].modulus() == 1.0);

    }

    @Test
    void testTwoPauliXsAndOneSwap() throws Exception {

        System.out.println("2 (Two) PauliX Quantum Operators applied to the 1st and 2nd Qubits, " +
                "followed by 1 (One) Swap Quantum Operators:\n");

        Qubit qubitNo1 = new Qubit(1L);
        Qubit qubitNo2 = new Qubit(2L);

        ComplexNumber[] qubitNo1Amplitudes;
        ComplexNumber[] qubitNo2Amplitudes;

        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

        qubitNo1.applyPauliX();
        qubitNo2.applyPauliX();


        Qubit[] qubitsSwapped;


        qubitsSwapped = qubitNo1.applySwap(qubitNo2);

        qubitNo1 = qubitsSwapped[0];
        qubitNo2 = qubitsSwapped[1];


        qubitNo1.measure();
        qubitNo2.measure();


        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 0.0);
        assert (qubitNo1Amplitudes[1].modulus() == 1.0);

        assert (qubitNo2Amplitudes[0].modulus() == 0.0);
        assert (qubitNo2Amplitudes[1].modulus() == 1.0);

    }

    @Test
    void testTwoPauliXsAndTwoSwaps() throws Exception {

        System.out.println("2 (Two) PauliX Quantum Operators applied to the 1st and 2nd Qubits, " +
                           "followed by 2 (Two) Swap Quantum Operators:\n");

        Qubit qubitNo1 = new Qubit(1L);
        Qubit qubitNo2 = new Qubit(2L);

        ComplexNumber[] qubitNo1Amplitudes;
        ComplexNumber[] qubitNo2Amplitudes;

        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 1.0);
        assert (qubitNo1Amplitudes[1].modulus() == 0.0);

        assert (qubitNo2Amplitudes[0].modulus() == 1.0);
        assert (qubitNo2Amplitudes[1].modulus() == 0.0);

        qubitNo1.applyPauliX();
        qubitNo2.applyPauliX();


        Qubit[] qubitsSwapped;


        qubitsSwapped = qubitNo1.applySwap(qubitNo2);

        qubitNo1 = qubitsSwapped[0];
        qubitNo2 = qubitsSwapped[1];


        qubitsSwapped = qubitNo1.applySwap(qubitNo2);

        qubitNo1 = qubitsSwapped[0];
        qubitNo2 = qubitsSwapped[1];


        qubitNo1.measure();
        qubitNo2.measure();


        qubitNo1Amplitudes = qubitNo1.getAmplitudes();
        qubitNo2Amplitudes = qubitNo2.getAmplitudes();

        assert (qubitNo1Amplitudes[0].modulus() == 0.0);
        assert (qubitNo1Amplitudes[1].modulus() == 1.0);

        assert (qubitNo2Amplitudes[0].modulus() == 0.0);
        assert (qubitNo2Amplitudes[1].modulus() == 1.0);

    }

}