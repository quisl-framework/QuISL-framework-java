package org.quist.units.qubits.math.algebra.swap;

import org.quist.units.qubits.math.algebra.Matrix;
import org.quist.units.qubits.math.complex.ComplexNumber;

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
