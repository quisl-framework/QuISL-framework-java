package org.quisl.framework.java.math.linearalgebra.matrix.quantumoperators.single.squareroot;

import org.quisl.framework.java.math.complex.ComplexNumber;

public class SquareRootMatrix {

    public SquareRootMatrix() {

    }

    public static ComplexNumber[][] getSquareRootPauliX() {

        return new ComplexNumber[][]
                      { { new ComplexNumber( ( 1.0/2.0 ) , ( 1.0/2.0 ) ),
                          new ComplexNumber( ( 1.0/2.0 ) , -( 1.0/2.0 ) ) },
                        { new ComplexNumber( ( 1.0/2.0 ) , -( 1.0/2.0 ) ),
                          new ComplexNumber( ( 1.0/2.0 ) , ( 1.0/2.0 ) ) } };

    }

}
