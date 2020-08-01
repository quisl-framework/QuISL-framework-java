package org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.operators.single.hermitian;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.math.linearalgebra.Matrix;

public class HermitianMatrix extends Matrix {

    public HermitianMatrix() {

    }

    public static ComplexNumber[][] getGenericPhaseShiftHermitianMatrix(double thetaRadians) {

        return new ComplexNumber[][]
                    { { ComplexNumber.real_one_img_zero,
                        ComplexNumber.real_zero_img_zero },
                      { ComplexNumber.real_zero_img_zero,
                    new ComplexNumber( Math.cos(thetaRadians), -Math.sin(thetaRadians) ) } };

    }

    public static ComplexNumber[][] getPhaseShiftPiDividedBy2HermitianMatrix() {

        return new ComplexNumber[][]
                    { { ComplexNumber.real_one_img_zero, ComplexNumber.real_zero_img_zero },
                      { ComplexNumber.real_zero_img_zero, ComplexNumber.neg_i} };

    }

    public static ComplexNumber[][] getPhaseShiftPiDividedBy4SimpleHermitianMatrix() {

        return new ComplexNumber[][]
                    { { ComplexNumber.real_one_img_zero,
                        ComplexNumber.real_zero_img_zero },
                      { ComplexNumber.real_zero_img_zero,
                        ComplexNumber.real_one_img_neg_one }
                    };

    }

    public static ComplexNumber[][] getPhaseShiftPiDividedBy4EulerHermitianMatrix() {

        return new ComplexNumber[][]
                    { { ComplexNumber.real_one_img_zero,
                        ComplexNumber.real_zero_img_zero },
                      { ComplexNumber.real_zero_img_zero,
                            new ComplexNumber
                                    (
                                            ( 1.0 / Math.sqrt(2.0) ) ,
                                           -( 1.0 / Math.sqrt(2.0) )
                                    )
                            }
                    };

    }

    public static ComplexNumber[][] getPhaseShiftPiDividedBy8HermitianMatrix() {

        return new ComplexNumber[][]
                    { { ComplexNumber.real_one_img_zero,
                        ComplexNumber.real_zero_img_zero },
                      { ComplexNumber.real_zero_img_zero,
                            new ComplexNumber
                                    (
                                            ( ( Math.sqrt( 2.0 + Math.sqrt(2.0) ) ) / 2.0 ) ,
                                           -( ( Math.sqrt( 2.0 - Math.sqrt(2.0) ) ) / 2.0 )
                                    )
                        }
                    };

    }

}
