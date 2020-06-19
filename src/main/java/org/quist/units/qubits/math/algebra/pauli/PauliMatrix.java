package org.quist.units.qubits.math.algebra.pauli;

import org.quist.units.qubits.math.algebra.Matrix;
import org.quist.units.qubits.math.complex.ComplexNumber;

public class PauliMatrix extends Matrix {

    public PauliMatrix() {

    }

    public static ComplexNumber[][] getPauliIMatrix() {

        return new ComplexNumber[][]
                      { { ComplexNumber.real_one_img_zero, ComplexNumber.real_zero_img_zero },
                        { ComplexNumber.real_zero_img_zero, ComplexNumber.real_one_img_zero } };

    }

    public static ComplexNumber[][] getPauliXMatrix() {

        return new ComplexNumber[][]
                      { { ComplexNumber.real_zero_img_zero, ComplexNumber.real_one_img_zero },
                        { ComplexNumber.real_one_img_zero, ComplexNumber.real_zero_img_zero } };

    }

    public static ComplexNumber[][] getPauliYMatrix() {

        return new ComplexNumber[][]
                      { { ComplexNumber.real_zero_img_zero, ComplexNumber.neg_i },
                        { ComplexNumber.i, ComplexNumber.real_zero_img_zero } };

    }

    public static ComplexNumber[][] getPauliZMatrix() {

        return new ComplexNumber[][]
                      { { ComplexNumber.real_one_img_zero, ComplexNumber.real_zero_img_zero },
                        { ComplexNumber.real_zero_img_zero, ComplexNumber.real_neg_one_img_zero } };

    }

}
