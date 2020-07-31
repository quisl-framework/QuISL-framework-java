package org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.multi.two.swap;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.math.linearalgebra.Matrix;

public class SWAPMatrix extends Matrix {

    public SWAPMatrix() {

    }

    public static ComplexNumber[][] getSWAPMatrix() {

        return new ComplexNumber[][]
                    { { ComplexNumber.real_one_img_zero, ComplexNumber.real_zero_img_zero,
                          ComplexNumber.real_zero_img_zero, ComplexNumber.real_zero_img_zero },
                      { ComplexNumber.real_zero_img_zero, ComplexNumber.real_zero_img_zero,
                          ComplexNumber.real_one_img_zero, ComplexNumber.real_zero_img_zero },
                      { ComplexNumber.real_zero_img_zero, ComplexNumber.real_one_img_zero,
                          ComplexNumber.real_zero_img_zero, ComplexNumber.real_zero_img_zero },
                      { ComplexNumber.real_zero_img_zero, ComplexNumber.real_zero_img_zero,
                          ComplexNumber.real_zero_img_zero, ComplexNumber.real_one_img_zero } };

    }

}
