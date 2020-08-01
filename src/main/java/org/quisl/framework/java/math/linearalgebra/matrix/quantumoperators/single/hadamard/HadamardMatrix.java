package org.quisl.framework.java.math.linearalgebra.matrix.quantumoperators.single.hadamard;

import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.math.linearalgebra.Matrix;

public class HadamardMatrix extends Matrix {

    public HadamardMatrix() {

    }

    public static ComplexNumber[][] getHadamardMatrix() {

        return new ComplexNumber[][]
                      { { new ComplexNumber(1.0/Math.sqrt(2.0), 0.0), new ComplexNumber(1.0/Math.sqrt(2.0), 0.0) },
                        { new ComplexNumber(1.0/Math.sqrt(2.0), 0.0), new ComplexNumber(-1.0/Math.sqrt(2.0), 0.0) } };

    }

}
