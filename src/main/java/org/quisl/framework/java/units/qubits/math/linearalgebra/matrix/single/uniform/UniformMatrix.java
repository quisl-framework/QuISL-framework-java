package org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.single.uniform;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.math.linearalgebra.Matrix;

public class UniformMatrix extends Matrix {

    public UniformMatrix() {

    }

    public static ComplexNumber[][] getUniform1Matrix(double phiRadians) {

        return new ComplexNumber[][]
                       { { ComplexNumber.real_one_img_zero,
                           ComplexNumber.real_zero_img_zero },
                         { ComplexNumber.real_zero_img_zero,
                           new ComplexNumber( Math.cos(phiRadians), Math.sin(phiRadians) ) } };

    }

    public static ComplexNumber[][] getUniform2Matrix(double thetaRadians, double phiRadians) {

        return new ComplexNumber[][]
                      { { new ComplexNumber( ( 1/Math.sqrt(2.0) ) , 0.0 ),
                          new ComplexNumber(
                                  -Math.cos(phiRadians)/Math.sqrt(2.0) ,
                                  -Math.sin(phiRadians)/Math.sqrt(2.0) ) },
                        { new ComplexNumber(
                                Math.cos(thetaRadians)/Math.sqrt(2.0) ,
                                Math.sin(thetaRadians)/Math.sqrt(2.0) ),
                          new ComplexNumber(
                                Math.cos(thetaRadians + phiRadians)/Math.sqrt(2.0) ,
                                Math.sin(thetaRadians + phiRadians)/Math.sqrt(2.0) ) } };

    }

}
