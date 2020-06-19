package org.quist.units.qubits.math.algebra.hadamard;

import org.quist.units.qubits.math.algebra.Matrix;
import org.quist.units.qubits.math.complex.ComplexNumber;

public class HadamardMatrix extends Matrix {

    public HadamardMatrix() {

    }

    public static ComplexNumber[][] getHadamardMatrix() {

        return new ComplexNumber[][]
                      { { new ComplexNumber(1.0/Math.sqrt(2.0), 0.0), new ComplexNumber(1.0/Math.sqrt(2.0), 0.0) },
                        { new ComplexNumber(1.0/Math.sqrt(2.0), 0.0), new ComplexNumber(-1.0/Math.sqrt(2.0), 0.0) } };

    }

}
