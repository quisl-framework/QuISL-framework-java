package org.quisl.framework.java.math.linearalgebra.matrix.utils.operators.numeric;

import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.math.linearalgebra.matrix.utils.MatrixUtils;

public class NumericMatrixOperators extends MatrixUtils {

    public NumericMatrixOperators() {

    }

    public Integer[][] addScalarToIntegerMatrix(Integer integerScalar, Integer[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Integer[][] resultMatrix = new Integer[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] + integerScalar );

            }

        }

        return resultMatrix;

    }

    public Double[][] addScalarToDoubleMatrix(Double doubleScalar, Double[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Double[][] resultMatrix = new Double[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] + doubleScalar );

            }

        }

        return resultMatrix;

    }

    public Float[][] addScalarToFloatMatrix(Float floatScalar, Float[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Float[][] resultMatrix = new Float[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] + floatScalar );

            }

        }

        return resultMatrix;

    }

    public ComplexNumber[][] addScalarToComplexNumberMatrix(ComplexNumber complexNumberScalar, ComplexNumber[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        ComplexNumber[][] resultMatrix = new ComplexNumber[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                originalMatrix[currentNumRow][currentNumColumn].add(complexNumberScalar);

                resultMatrix[currentNumRow][currentNumColumn] = originalMatrix[currentNumRow][currentNumColumn];

            }

        }

        return resultMatrix;

    }



    public Integer[][] subtractScalarToIntegerMatrix(Integer integerScalar, Integer[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Integer[][] resultMatrix = new Integer[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] - integerScalar );

            }

        }

        return resultMatrix;

    }

    public Double[][] subtractScalarToDoubleMatrix(Double doubleScalar, Double[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Double[][] resultMatrix = new Double[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] - doubleScalar );

            }

        }

        return resultMatrix;

    }

    public Float[][] subtractScalarToFloatMatrix(Float floatScalar, Float[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Float[][] resultMatrix = new Float[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] - floatScalar );

            }

        }

        return resultMatrix;

    }

    public ComplexNumber[][] subtractScalarToComplexNumberMatrix(ComplexNumber complexNumberScalar, ComplexNumber[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        ComplexNumber[][] resultMatrix = new ComplexNumber[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                originalMatrix[currentNumRow][currentNumColumn].subtract(complexNumberScalar);

                resultMatrix[currentNumRow][currentNumColumn] = originalMatrix[currentNumRow][currentNumColumn];

            }

        }

        return resultMatrix;

    }



    public Integer[][] multiplyScalarToIntegerMatrix(Integer integerScalar, Integer[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Integer[][] resultMatrix = new Integer[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] * integerScalar );

            }

        }

        return resultMatrix;

    }

    public Double[][] multiplyScalarToDoubleMatrix(Double doubleScalar, Double[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Double[][] resultMatrix = new Double[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] * doubleScalar );

            }

        }

        return resultMatrix;

    }

    public Float[][] multiplyScalarToFloatMatrix(Float floatScalar, Float[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Float[][] resultMatrix = new Float[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] * floatScalar );

            }

        }

        return resultMatrix;

    }

    public ComplexNumber[][] multiplyScalarToComplexNumberMatrix(ComplexNumber complexNumberScalar, ComplexNumber[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        ComplexNumber[][] resultMatrix = new ComplexNumber[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                originalMatrix[currentNumRow][currentNumColumn].multiply(complexNumberScalar);

                resultMatrix[currentNumRow][currentNumColumn] = originalMatrix[currentNumRow][currentNumColumn];

            }

        }

        return resultMatrix;

    }



    public Integer[][] divideScalarToIntegerMatrix(Integer integerScalar, Integer[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        if(integerScalar == 0) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Integer[][] resultMatrix = new Integer[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] / integerScalar );

            }

        }

        return resultMatrix;

    }

    public Double[][] divideScalarToDoubleMatrix(Double doubleScalar, Double[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        if(doubleScalar == 0.0) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Double[][] resultMatrix = new Double[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] / doubleScalar );

            }

        }

        return resultMatrix;

    }

    public Float[][] divideScalarToFloatMatrix(Float floatScalar, Float[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        if(floatScalar == 0.0f) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Float[][] resultMatrix = new Float[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( originalMatrix[currentNumRow][currentNumColumn] / floatScalar );

            }

        }

        return resultMatrix;

    }

    public ComplexNumber[][] divideScalarToComplexNumberMatrix(ComplexNumber complexNumberScalar, ComplexNumber[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        if( ( complexNumberScalar.getRe() == 0.0 ) || ( complexNumberScalar.getIm() == 0.0 ) ) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        ComplexNumber[][] resultMatrix = new ComplexNumber[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                originalMatrix[currentNumRow][currentNumColumn].divide(complexNumberScalar);

                resultMatrix[currentNumRow][currentNumColumn] = originalMatrix[currentNumRow][currentNumColumn];

            }

        }

        return resultMatrix;

    }



}
