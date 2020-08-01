package org.quisl.framework.java.math.linearalgebra.matrix.vectors.columns;

import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.math.linearalgebra.matrix.utils.MatrixUtils;
import org.quisl.framework.java.math.linearalgebra.matrix.vectors.Vector;

public class ColumnVector extends Vector {

    private final Object[][] elements;

    public ColumnVector(Object ... elements) {

        Object[][] lineVectorElements = new Object[1][elements.length];

        lineVectorElements[0] = elements;

        this.elements = MatrixUtils.transposeMatrix(lineVectorElements);

    }

    public ColumnVector(Integer ... elements) {

        Integer[][] lineVectorElements = new Integer[1][elements.length];

        lineVectorElements[0] = elements;

        this.elements = MatrixUtils.transposeMatrix(lineVectorElements);

    }

    public ColumnVector(Double ... elements) {

        Double[][] lineVectorElements = new Double[1][elements.length];

        lineVectorElements[0] = elements;

        this.elements = MatrixUtils.transposeMatrix(lineVectorElements);

    }

    public ColumnVector(Float ... elements) {

        Float[][] lineVectorElements = new Float[1][elements.length];

        lineVectorElements[0] = elements;

        this.elements = MatrixUtils.transposeMatrix(lineVectorElements);

    }

    public ColumnVector(Boolean ... elements) {

        Boolean[][] lineVectorElements = new Boolean[1][elements.length];

        lineVectorElements[0] = elements;

        this.elements = MatrixUtils.transposeMatrix(lineVectorElements);

    }

    public ColumnVector(ComplexNumber ... elements) {

        ComplexNumber[][] lineVectorElements = new ComplexNumber[1][elements.length];

        lineVectorElements[0] = elements;

        this.elements = MatrixUtils.transposeMatrix(lineVectorElements);

    }

    public boolean isObjectColumnVector() {

        for(Object element : MatrixUtils.transposeMatrix(this.elements)[0]) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isIntegerColumnVector() {

        for(Integer element : ( (Integer[]) MatrixUtils.transposeMatrix(this.elements)[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isDoubleColumnVector() {

        for(Double element : ( (Double[]) MatrixUtils.transposeMatrix(this.elements)[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isFloatColumnVector() {

        for(Float element : ( (Float[]) MatrixUtils.transposeMatrix(this.elements)[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isBooleanColumnVector() {

        for(Boolean element : ( (Boolean[]) MatrixUtils.transposeMatrix(this.elements)[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isComplexNumberColumnVector() {

        for(ComplexNumber element : ( (ComplexNumber[]) MatrixUtils.transposeMatrix(this.elements)[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

}
