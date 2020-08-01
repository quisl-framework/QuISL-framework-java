package org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.single.cartesianrotation;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.math.linearalgebra.Matrix;

public class CartesianRotationMatrix extends Matrix {

    public CartesianRotationMatrix() {

    }

    public static ComplexNumber[][] getRotationXMatrix(double thetaRadians) {

        return new ComplexNumber[][]
                        { { new ComplexNumber( Math.cos(thetaRadians / 2.0) , 0.0 ),
                            new ComplexNumber( 0.0 , -Math.sin(thetaRadians / 2.0) ) },
                          { new ComplexNumber( 0.0 , -Math.sin(thetaRadians / 2.0) ),
                            new ComplexNumber( Math.cos(thetaRadians / 2.0) , 0.0 ) },
                        };

    }

    public static ComplexNumber[][] getRotationYMatrix(double thetaRadians) {

        return new ComplexNumber[][]
                        { { new ComplexNumber( Math.cos(thetaRadians / 2.0) , 0.0 ),
                            new ComplexNumber( -Math.sin(thetaRadians / 2.0) , 0.0 ) },
                          { new ComplexNumber( Math.sin(thetaRadians / 2.0) , 0.0 ),
                            new ComplexNumber( Math.cos(thetaRadians / 2.0) , 0.0 ) },
                        };

    }

    public static ComplexNumber[][] getRotationZMatrix(double phiRadians) {

        return new ComplexNumber[][]
                        { { new ComplexNumber( Math.cos(phiRadians / 2.0) , -Math.sin(phiRadians / 2.0) ),
                            ComplexNumber.real_zero_img_zero },
                          { ComplexNumber.real_zero_img_zero,
                            new ComplexNumber( Math.cos(phiRadians / 2.0) , Math.sin(phiRadians / 2.0) ) },
                };

    }

}
