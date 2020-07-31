package org.quisl.framework.java.units.qubits.math.linearalgebra.controlled;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.math.linearalgebra.Matrix;

public class ControlledMatrix extends Matrix {

    public ControlledMatrix() {

    }

    public static ComplexNumber[][] getControlledXMatrix() {

        return new ComplexNumber[][]
                      { { ComplexNumber.real_one_img_zero, ComplexNumber.real_zero_img_zero,
                              ComplexNumber.real_zero_img_zero, ComplexNumber.real_zero_img_zero },
                        { ComplexNumber.real_zero_img_zero, ComplexNumber.real_one_img_zero,
                              ComplexNumber.real_zero_img_zero, ComplexNumber.real_zero_img_zero },
                        { ComplexNumber.real_zero_img_zero, ComplexNumber.real_zero_img_zero,
                              ComplexNumber.real_zero_img_zero, ComplexNumber.real_one_img_zero },
                        { ComplexNumber.real_zero_img_zero, ComplexNumber.real_zero_img_zero,
                              ComplexNumber.real_one_img_zero, ComplexNumber.real_zero_img_zero } };

    }

    public static ComplexNumber[][] getControlledYMatrix() {

        return new ComplexNumber[][]
                      { { new ComplexNumber(1.0, 0.0), new ComplexNumber(0.0, 0.0),
                              new ComplexNumber(0.0, 0.0), new ComplexNumber(0.0, 0.0) },
                        { new ComplexNumber(0.0, 0.0), new ComplexNumber(1.0, 0.0),
                              new ComplexNumber(0.0, 0.0), new ComplexNumber(0.0, 0.0) },
                        { new ComplexNumber(0.0, 0.0), new ComplexNumber(0.0, 0.0),
                              new ComplexNumber(0.0, 0.0), ComplexNumber.neg_i },
                        { new ComplexNumber(0.0, 0.0), new ComplexNumber(0.0, 0.0),
                              ComplexNumber.i, new ComplexNumber(0.0, 0.0) } };

    }

    public static ComplexNumber[][] getControlledZMatrix() {

        return new ComplexNumber[][]
                      { { new ComplexNumber(1.0, 0.0), new ComplexNumber(0.0, 0.0),
                              new ComplexNumber(0.0, 0.0), new ComplexNumber(0.0, 0.0) },
                        { new ComplexNumber(0.0, 0.0), new ComplexNumber(1.0, 0.0),
                              new ComplexNumber(0.0, 0.0), new ComplexNumber(0.0, 0.0) },
                        { new ComplexNumber(0.0, 0.0), new ComplexNumber(0.0, 0.0),
                              new ComplexNumber(1.0, 0.0), new ComplexNumber(0.0, 0.0) },
                        { new ComplexNumber(0.0, 0.0), new ComplexNumber(0.0, 0.0),
                              new ComplexNumber(0.0, 0.0), new ComplexNumber(-1.0, 0.0) } };

    }

}
