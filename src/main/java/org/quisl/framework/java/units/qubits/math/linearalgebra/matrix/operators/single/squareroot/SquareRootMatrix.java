package org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.operators.single.squareroot;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;

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
