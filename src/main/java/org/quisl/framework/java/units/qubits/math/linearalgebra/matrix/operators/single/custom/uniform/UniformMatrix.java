package org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.operators.single.custom.uniform;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.math.linearalgebra.Matrix;

public class UniformMatrix extends Matrix {

    public UniformMatrix() {

    }

    public static ComplexNumber[][] getUniform1Matrix(double lambdaRadians) {

        return new ComplexNumber[][]
                       { { ComplexNumber.real_one_img_zero,
                           ComplexNumber.real_zero_img_zero },
                         { ComplexNumber.real_zero_img_zero,
                           new ComplexNumber( Math.cos(lambdaRadians), Math.sin(lambdaRadians) ) } };

    }

    public static ComplexNumber[][] getUniform2Matrix(double phiRadians, double lambdaRadians) {

        return new ComplexNumber[][]
                      { { new ComplexNumber( ( 1/Math.sqrt(2.0) ) , 0.0 ),
                          new ComplexNumber(
                                -Math.cos(lambdaRadians)/Math.sqrt(2.0) ,
                                -Math.sin(lambdaRadians)/Math.sqrt(2.0) ) },
                        { new ComplexNumber(
                                Math.cos(phiRadians)/Math.sqrt(2.0) ,
                                Math.sin(phiRadians)/Math.sqrt(2.0) ),
                          new ComplexNumber(
                                Math.cos(phiRadians + lambdaRadians)/Math.sqrt(2.0) ,
                                Math.sin(phiRadians + lambdaRadians)/Math.sqrt(2.0) ) } };

    }

    public static ComplexNumber[][] getUniform3Matrix(double thetaRadians, double phiRadians, double lambdaRadians) {

        return new ComplexNumber[][]
                      { { new ComplexNumber( Math.cos( ( thetaRadians/2.0 ) ) , 0.0 ),
                          new ComplexNumber(
                                  ( -Math.cos(lambdaRadians) * ( Math.sin( ( thetaRadians / 2.0 ) ) ) ) ,
                                  ( -Math.sin(lambdaRadians) * ( Math.sin( ( thetaRadians / 2.0 ) ) ) ) ) },
                        { new ComplexNumber(
                                  ( Math.cos(phiRadians) * ( Math.sin( ( thetaRadians / 2.0 ) ) ) ) ,
                                  ( Math.sin(phiRadians) * ( Math.sin( ( thetaRadians / 2.0 ) ) ) ) ),
                          new ComplexNumber(
                                  ( Math.cos(phiRadians + lambdaRadians) * ( Math.cos( ( thetaRadians / 2.0 ) ) ) ),
                                  ( Math.sin(phiRadians + lambdaRadians) * ( Math.cos( ( thetaRadians / 2.0 ) ) ) ) ) } };

    }

}
