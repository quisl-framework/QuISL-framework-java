package org.quist.units.qubits.operators.multi.swap;

import org.quist.units.qubits.Qubit;
import org.quist.units.qubits.math.algebra.swap.SWAPMatrix;
import org.quist.units.qubits.math.complex.ComplexNumber;
import org.quist.units.qubits.operators.multi.MultiQuantumOperator;

public class Swap extends MultiQuantumOperator {

    private ComplexNumber[][] swapMatrix;

    private boolean swapped;

    public Swap(Qubit[] qubits) throws Exception {

        super(2, qubits, SWAPMatrix.getSWAPMatrix());

        this.setup();

        this.swapped = false;

    }

    @Override
    public String getName() {
        return getSwapQuantumOperatorName();
    }

    public static String getSwapQuantumOperatorName() {
        return "SWAP";
    }

    @Override
    public String getInfo() {
        return "Swaps 2 (two) Qubits;";
    }

    @Override
    public void setup() throws Exception {

        if (this.getNumQubits() != this.getQubits().length) {

            if (this.getNumQubits() != 2) {

                throw new Exception();

            }

        }

        this.swapMatrix = this.getQuantumOperatorMatrix();

    }

    public static Qubit[] performSwap(Qubit qubitNo1, Qubit qubitNo2) {

        Qubit temp = qubitNo1;
        qubitNo1 = qubitNo2;
        qubitNo2 = temp;

        return new Qubit[] { qubitNo1, qubitNo2 };

    }

    public void appliedSwap() {
        this.swapped = true;
    }

    public boolean isSwapped() {
        return this.swapped;
    }

    public ComplexNumber[][] getSwapMatrix() {
        return this.swapMatrix;
    }
}
