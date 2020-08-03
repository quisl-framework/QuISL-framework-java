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

    public ComplexNumber[][] addScalarToComplexNumberMatrix(ComplexNumber complexNumberScalar,
                                                            ComplexNumber[][] originalMatrix)
    {

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

    public ComplexNumber[][] subtractScalarToComplexNumberMatrix(ComplexNumber complexNumberScalar,
                                                                 ComplexNumber[][] originalMatrix)
    {

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

    public Integer[][] multiplyIntegerMatrixByScalar(Integer integerScalar, Integer[][] originalMatrix) {

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

    public Double[][] multiplyDoubleMatrixByScalar(Double doubleScalar, Double[][] originalMatrix) {

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

    public Float[][] multiplyFloatMatrixByScalar(Float floatScalar, Float[][] originalMatrix) {

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

    public ComplexNumber[][] multiplyComplexNumberMatrixByScalar(ComplexNumber complexNumberScalar,
                                                                 ComplexNumber[][] originalMatrix) {

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

    public Integer[][] divideIntegerMatrixByScalar(Integer integerScalar, Integer[][] originalMatrix) {

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

    public Double[][] divideDoubleMatrixByScalar(Double doubleScalar, Double[][] originalMatrix) {

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

    public Float[][] divideFloatMatrixByScalar(Float floatScalar, Float[][] originalMatrix) {

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

    public ComplexNumber[][] divideComplexNumberMatrixByScalar(ComplexNumber complexNumberScalar,
                                                               ComplexNumber[][] originalMatrix)
    {

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

    public Integer[][] sumTwoIntegerMatrices(Integer[][] integerMatrixNum1, Integer[][] integerMatrixNum2) {

        int numRowsIntegerMatrixNum1 = getNumRows(integerMatrixNum1);
        int numColumnsIntegerMatrixNum1 = getNumColumns(integerMatrixNum1);

        int numRowsIntegerMatrixNum2 = getNumRows(integerMatrixNum2);
        int numColumnsIntegerMatrixNum2 = getNumColumns(integerMatrixNum2);

        if( ( numRowsIntegerMatrixNum1 != numRowsIntegerMatrixNum2 ) ||
            ( numColumnsIntegerMatrixNum1 != numColumnsIntegerMatrixNum2 ) ) {

            return null;

        }

        Integer[][] resultMatrix = new Integer[numRowsIntegerMatrixNum1][numColumnsIntegerMatrixNum1];

        for(int currentRow = 0; currentRow < numRowsIntegerMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsIntegerMatrixNum1; currentColumn++) {

                resultMatrix[currentRow][currentColumn] = ( integerMatrixNum1[currentRow][currentColumn] +
                                                            integerMatrixNum2[currentRow][currentColumn] );

            }

        }

        return resultMatrix;

    }

    public Double[][] sumTwoDoubleMatrices(Double[][] doubleMatrixNum1, Double[][] doubleMatrixNum2) {

        int numRowsDoubleMatrixNum1 = getNumRows(doubleMatrixNum1);
        int numColumnsDoubleMatrixNum1 = getNumColumns(doubleMatrixNum1);

        int numRowsDoubleMatrixNum2 = getNumRows(doubleMatrixNum2);
        int numColumnsDoubleMatrixNum2 = getNumColumns(doubleMatrixNum2);

        if( ( numRowsDoubleMatrixNum1 != numRowsDoubleMatrixNum2 ) ||
            ( numColumnsDoubleMatrixNum1 != numColumnsDoubleMatrixNum2 ) ) {

            return null;

        }

        Double[][] resultMatrix = new Double[numRowsDoubleMatrixNum1][numColumnsDoubleMatrixNum1];

        for(int currentRow = 0; currentRow < numRowsDoubleMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsDoubleMatrixNum1; currentColumn++) {

                resultMatrix[currentRow][currentColumn] = ( doubleMatrixNum1[currentRow][currentColumn] +
                                                            doubleMatrixNum2[currentRow][currentColumn] );

            }

        }

        return resultMatrix;

    }

    public Float[][] sumTwoFloatMatrices(Float[][] floatMatrixNum1, Float[][] floatMatrixNum2) {

        int numRowsFloatMatrixNum1 = getNumRows(floatMatrixNum1);
        int numColumnsFloatMatrixNum1 = getNumColumns(floatMatrixNum1);

        int numRowsFloatMatrixNum2 = getNumRows(floatMatrixNum2);
        int numColumnsFloatMatrixNum2 = getNumColumns(floatMatrixNum2);

        if( ( numRowsFloatMatrixNum1 != numRowsFloatMatrixNum2 ) ||
            ( numColumnsFloatMatrixNum1 != numColumnsFloatMatrixNum2 ) ) {

            return null;

        }

        Float[][] resultMatrix = new Float[numRowsFloatMatrixNum1][numColumnsFloatMatrixNum1];

        for(int currentRow = 0; currentRow < numRowsFloatMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsFloatMatrixNum1; currentColumn++) {

                resultMatrix[currentRow][currentColumn] = ( floatMatrixNum1[currentRow][currentColumn] +
                                                            floatMatrixNum2[currentRow][currentColumn] );

            }

        }

        return resultMatrix;

    }

    public ComplexNumber[][] sumTwoComplexNumberMatrices(ComplexNumber[][] complexNumberMatrixNum1,
                                                         ComplexNumber[][] complexNumberMatrixNum2) {

        int numRowsComplexNumberMatrixNum1 = getNumRows(complexNumberMatrixNum1);
        int numColumnsComplexNumberMatrixNum1 = getNumColumns(complexNumberMatrixNum1);

        int numRowsComplexNumberMatrixNum2 = getNumRows(complexNumberMatrixNum2);
        int numColumnsComplexNumberMatrixNum2 = getNumColumns(complexNumberMatrixNum2);

        if( ( numRowsComplexNumberMatrixNum1 != numRowsComplexNumberMatrixNum2 ) ||
            ( numColumnsComplexNumberMatrixNum1 != numColumnsComplexNumberMatrixNum2 ) ) {

            return null;

        }

        ComplexNumber[][] resultMatrix = new ComplexNumber[numRowsComplexNumberMatrixNum1][numColumnsComplexNumberMatrixNum1];

        for(int currentRow = 0; currentRow < numRowsComplexNumberMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsComplexNumberMatrixNum1; currentColumn++) {

                resultMatrix[currentRow][currentColumn] = complexNumberMatrixNum1[currentRow][currentColumn];

                resultMatrix[currentRow][currentColumn].add( complexNumberMatrixNum2[currentRow][currentColumn] );

            }

        }

        return resultMatrix;

    }

    public Integer[][] subtractTwoIntegerMatrices(Integer[][] integerMatrixNum1, Integer[][] integerMatrixNum2) {

        int numRowsIntegerMatrixNum1 = getNumRows(integerMatrixNum1);
        int numColumnsIntegerMatrixNum1 = getNumColumns(integerMatrixNum1);

        int numRowsIntegerMatrixNum2 = getNumRows(integerMatrixNum2);
        int numColumnsIntegerMatrixNum2 = getNumColumns(integerMatrixNum2);

        if( ( numRowsIntegerMatrixNum1 != numRowsIntegerMatrixNum2 ) ||
                ( numColumnsIntegerMatrixNum1 != numColumnsIntegerMatrixNum2 ) ) {

            return null;

        }

        Integer[][] resultMatrix = new Integer[numRowsIntegerMatrixNum1][numColumnsIntegerMatrixNum1];

        for(int currentRow = 0; currentRow < numRowsIntegerMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsIntegerMatrixNum1; currentColumn++) {

                resultMatrix[currentRow][currentColumn] = ( integerMatrixNum1[currentRow][currentColumn] -
                                                            integerMatrixNum2[currentRow][currentColumn] );

            }

        }

        return resultMatrix;

    }

    public Double[][] subtractTwoDoubleMatrices(Double[][] doubleMatrixNum1, Double[][] doubleMatrixNum2) {

        int numRowsDoubleMatrixNum1 = getNumRows(doubleMatrixNum1);
        int numColumnsDoubleMatrixNum1 = getNumColumns(doubleMatrixNum1);

        int numRowsDoubleMatrixNum2 = getNumRows(doubleMatrixNum2);
        int numColumnsDoubleMatrixNum2 = getNumColumns(doubleMatrixNum2);

        if( ( numRowsDoubleMatrixNum1 != numRowsDoubleMatrixNum2 ) ||
                ( numColumnsDoubleMatrixNum1 != numColumnsDoubleMatrixNum2 ) ) {

            return null;

        }

        Double[][] resultMatrix = new Double[numRowsDoubleMatrixNum1][numColumnsDoubleMatrixNum1];

        for(int currentRow = 0; currentRow < numRowsDoubleMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsDoubleMatrixNum1; currentColumn++) {

                resultMatrix[currentRow][currentColumn] = ( doubleMatrixNum1[currentRow][currentColumn] -
                                                            doubleMatrixNum2[currentRow][currentColumn] );

            }

        }

        return resultMatrix;

    }

    public Float[][] subtractTwoFloatMatrices(Float[][] floatMatrixNum1, Float[][] floatMatrixNum2) {

        int numRowsFloatMatrixNum1 = getNumRows(floatMatrixNum1);
        int numColumnsFloatMatrixNum1 = getNumColumns(floatMatrixNum1);

        int numRowsFloatMatrixNum2 = getNumRows(floatMatrixNum2);
        int numColumnsFloatMatrixNum2 = getNumColumns(floatMatrixNum2);

        if( ( numRowsFloatMatrixNum1 != numRowsFloatMatrixNum2 ) ||
                ( numColumnsFloatMatrixNum1 != numColumnsFloatMatrixNum2 ) ) {

            return null;

        }

        Float[][] resultMatrix = new Float[numRowsFloatMatrixNum1][numColumnsFloatMatrixNum1];

        for(int currentRow = 0; currentRow < numRowsFloatMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsFloatMatrixNum1; currentColumn++) {

                resultMatrix[currentRow][currentColumn] = ( floatMatrixNum1[currentRow][currentColumn] -
                                                            floatMatrixNum2[currentRow][currentColumn] );

            }

        }

        return resultMatrix;

    }

    public ComplexNumber[][] subtractTwoComplexNumberMatrices(ComplexNumber[][] complexNumberMatrixNum1,
                                                              ComplexNumber[][] complexNumberMatrixNum2) {

        int numRowsComplexNumberMatrixNum1 = getNumRows(complexNumberMatrixNum1);
        int numColumnsComplexNumberMatrixNum1 = getNumColumns(complexNumberMatrixNum1);

        int numRowsComplexNumberMatrixNum2 = getNumRows(complexNumberMatrixNum2);
        int numColumnsComplexNumberMatrixNum2 = getNumColumns(complexNumberMatrixNum2);

        if( ( numRowsComplexNumberMatrixNum1 != numRowsComplexNumberMatrixNum2 ) ||
                ( numColumnsComplexNumberMatrixNum1 != numColumnsComplexNumberMatrixNum2 ) ) {

            return null;

        }

        ComplexNumber[][] resultMatrix = new ComplexNumber[numRowsComplexNumberMatrixNum1][numColumnsComplexNumberMatrixNum1];

        for(int currentRow = 0; currentRow < numRowsComplexNumberMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsComplexNumberMatrixNum1; currentColumn++) {

                resultMatrix[currentRow][currentColumn] = complexNumberMatrixNum1[currentRow][currentColumn];

                resultMatrix[currentRow][currentColumn].subtract( complexNumberMatrixNum2[currentRow][currentColumn] );

            }

        }

        return resultMatrix;

    }

    public static ComplexNumber[][] computeConjugateMatrix(ComplexNumber[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        if(!isComplexNumberMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        ComplexNumber[][] conjugateMatrix = new ComplexNumber[numRows][numColumns];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                conjugateMatrix[currentRow][currentColumn] = originalMatrix[currentRow][currentColumn].conjugate();

            }

        }

        return conjugateMatrix;

    }

    public static ComplexNumber[][] computeHermitianMatrix(ComplexNumber[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        if(!isComplexNumberMatrix(originalMatrix)) {

            return null;

        }


        ComplexNumber[][] transposedMatrix = transposeMatrix(originalMatrix);

        return computeConjugateMatrix(transposedMatrix);

    }

}
