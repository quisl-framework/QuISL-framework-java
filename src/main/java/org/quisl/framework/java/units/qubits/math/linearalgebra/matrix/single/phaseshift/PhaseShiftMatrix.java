package org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.single.phaseshift;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.math.linearalgebra.Matrix;

public class PhaseShiftMatrix extends Matrix {

    public PhaseShiftMatrix() {

    }

    public static ComplexNumber[][] getGenericPhaseShiftMatrix(double thetaRadians) {

        return new ComplexNumber[][]
                      { { ComplexNumber.real_one_img_zero,
                          ComplexNumber.real_zero_img_zero },
                        { ComplexNumber.real_zero_img_zero,
                          new ComplexNumber( Math.cos(thetaRadians), Math.sin(thetaRadians) ) } };

    }

    public static ComplexNumber[][] getPhaseShiftPiDividedBy2() {

        return new ComplexNumber[][]
                      { { ComplexNumber.real_one_img_zero, ComplexNumber.real_zero_img_zero },
                        { ComplexNumber.real_zero_img_zero, ComplexNumber.i} };

    }

    public static ComplexNumber[][] getPhaseShiftPiDividedBy4() {

        return new ComplexNumber[][]
                      { { ComplexNumber.real_one_img_zero,
                          ComplexNumber.real_zero_img_zero },
                        { ComplexNumber.real_zero_img_zero,
                          new ComplexNumber
                                  (
                                      ( 1.0 / Math.sqrt(2.0) ) ,
                                      ( 1.0 / Math.sqrt(2.0) )
                                  )
                        }
                      };

    }

    public static ComplexNumber[][] getPhaseShiftPiDividedBy8() {

        return new ComplexNumber[][]
                      { { ComplexNumber.real_one_img_zero,
                          ComplexNumber.real_zero_img_zero },
                        { ComplexNumber.real_zero_img_zero,
                          new ComplexNumber
                                  (
                                      ( ( Math.sqrt( 2.0 + Math.sqrt(2.0) ) ) / 2.0 ) ,
                                      ( ( Math.sqrt( 2.0 - Math.sqrt(2.0) ) ) / 2.0 )
                                  )
                        }
                      };

    }

}
