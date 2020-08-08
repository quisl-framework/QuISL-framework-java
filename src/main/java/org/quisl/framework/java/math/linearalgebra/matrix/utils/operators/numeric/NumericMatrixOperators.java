package org.quisl.framework.java.math.linearalgebra.matrix.utils.operators.numeric;

import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.math.linearalgebra.matrix.utils.MatrixUtils;

public class NumericMatrixOperators extends MatrixUtils {

    public NumericMatrixOperators() {

    }


    public static boolean areTwoIntegerMatricesEqual(Integer[][] integerMatrixNum1, Integer[][] integerMatrixNum2) {

        int numRowsIntegerMatrixNum1 = getNumRows(integerMatrixNum1);
        int numColumnsIntegerMatrixNum1 = getNumColumns(integerMatrixNum1);

        int numRowsIntegerMatrixNum2 = getNumRows(integerMatrixNum2);
        int numColumnsIntegerMatrixNum2 = getNumColumns(integerMatrixNum2);


        if( ( !isValidMatrix(integerMatrixNum1) ) || ( !isValidMatrix(integerMatrixNum2) ) ) {

            return false;

        }


        if( (numRowsIntegerMatrixNum1 != numRowsIntegerMatrixNum2) ||
            (numColumnsIntegerMatrixNum1 != numColumnsIntegerMatrixNum2) ) {

            return false;

        }


        for(int currentRow = 0; currentRow < numRowsIntegerMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsIntegerMatrixNum1; currentColumn++) {

                if(!integerMatrixNum1[currentRow][currentColumn]
                   .equals(integerMatrixNum2[currentRow][currentColumn])) {

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean areTwoDoubleMatricesEqual(Double[][] doubleMatrixNum1, Double[][] doubleMatrixNum2) {

        int numRowsDoubleMatrixNum1 = getNumRows(doubleMatrixNum1);
        int numColumnsDoubleMatrixNum1 = getNumColumns(doubleMatrixNum1);

        int numRowsDoubleMatrixNum2 = getNumRows(doubleMatrixNum2);
        int numColumnsDoubleMatrixNum2 = getNumColumns(doubleMatrixNum2);


        if( ( !isValidMatrix(doubleMatrixNum1) ) || ( !isValidMatrix(doubleMatrixNum2) ) ) {

            return false;

        }


        if( (numRowsDoubleMatrixNum1 != numRowsDoubleMatrixNum2) ||
            (numColumnsDoubleMatrixNum1 != numColumnsDoubleMatrixNum2) ) {

            return false;

        }


        for(int currentRow = 0; currentRow < numRowsDoubleMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsDoubleMatrixNum1; currentColumn++) {

                if(!doubleMatrixNum1[currentRow][currentColumn]
                        .equals(doubleMatrixNum2[currentRow][currentColumn])) {

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean areTwoFloatMatricesEqual(Float[][] floatMatrixNum1, Float[][] floatMatrixNum2) {

        int numRowsFloatMatrixNum1 = getNumRows(floatMatrixNum1);
        int numColumnsFloatMatrixNum1 = getNumColumns(floatMatrixNum1);

        int numRowsFloatMatrixNum2 = getNumRows(floatMatrixNum2);
        int numColumnsFloatMatrixNum2 = getNumColumns(floatMatrixNum2);


        if( ( !isValidMatrix(floatMatrixNum1) ) || ( !isValidMatrix(floatMatrixNum2) ) ) {

            return false;

        }


        if( (numRowsFloatMatrixNum1 != numRowsFloatMatrixNum2) ||
            (numColumnsFloatMatrixNum1 != numColumnsFloatMatrixNum2) ) {

            return false;

        }


        for(int currentRow = 0; currentRow < numRowsFloatMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsFloatMatrixNum1; currentColumn++) {

                if(!floatMatrixNum1[currentRow][currentColumn]
                   .equals(floatMatrixNum2[currentRow][currentColumn])) {

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean areTwoComplexNumberMatricesEqual(ComplexNumber[][] complexNumberMatrixNum1,
                                                    ComplexNumber[][] complexNumberMatrixNum2) {

        int numRowsComplexNumberMatrixNum1 = getNumRows(complexNumberMatrixNum1);
        int numColumnsComplexNumberMatrixNum1 = getNumColumns(complexNumberMatrixNum1);

        int numRowsComplexNumberMatrixNum2 = getNumRows(complexNumberMatrixNum2);
        int numColumnsComplexNumberMatrixNum2 = getNumColumns(complexNumberMatrixNum2);


        if( ( !isValidMatrix(complexNumberMatrixNum1) ) || ( !isValidMatrix(complexNumberMatrixNum2) ) ) {

            return false;

        }


        if( (numRowsComplexNumberMatrixNum1 != numRowsComplexNumberMatrixNum2) ||
            (numColumnsComplexNumberMatrixNum1 != numColumnsComplexNumberMatrixNum2) ) {

            return false;

        }


        for(int currentRow = 0; currentRow < numRowsComplexNumberMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsComplexNumberMatrixNum1; currentColumn++) {

                if(!complexNumberMatrixNum1[currentRow][currentColumn]
                   .equals(complexNumberMatrixNum2[currentRow][currentColumn])) {

                    return false;

                }

            }

        }

        return true;

    }

    public static Integer[][] addScalarToIntegerMatrix(Integer integerScalar, Integer[][] originalMatrix) {

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

    public static Double[][] addScalarToDoubleMatrix(Double doubleScalar, Double[][] originalMatrix) {

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

    public static Float[][] addScalarToFloatMatrix(Float floatScalar, Float[][] originalMatrix) {

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

    public static ComplexNumber[][] addScalarToComplexNumberMatrix(ComplexNumber complexNumberScalar,
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

                ComplexNumber intermediaryComplexNumber = originalMatrix[currentNumRow][currentNumColumn];

                intermediaryComplexNumber.add(complexNumberScalar);

                resultMatrix[currentNumRow][currentNumColumn] = intermediaryComplexNumber;

            }

        }

        return resultMatrix;

    }

    public static Integer[][] subtractScalarToIntegerMatrix(Integer integerScalar, Integer[][] originalMatrix) {

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

    public static Double[][] subtractScalarToDoubleMatrix(Double doubleScalar, Double[][] originalMatrix) {

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

    public static Float[][] subtractScalarToFloatMatrix(Float floatScalar, Float[][] originalMatrix) {

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

    public static ComplexNumber[][] subtractScalarToComplexNumberMatrix(ComplexNumber complexNumberScalar,
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

                ComplexNumber intermediaryComplexNumber = originalMatrix[currentNumRow][currentNumColumn];

                intermediaryComplexNumber.subtract(complexNumberScalar);

                resultMatrix[currentNumRow][currentNumColumn] = intermediaryComplexNumber;

            }

        }

        return resultMatrix;

    }

    public static Integer[][] multiplyIntegerMatrixByScalar(Integer integerScalar, Integer[][] originalMatrix) {

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

    public static Double[][] multiplyDoubleMatrixByScalar(Double doubleScalar, Double[][] originalMatrix) {

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

    public static Float[][] multiplyFloatMatrixByScalar(Float floatScalar, Float[][] originalMatrix) {

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

    public static ComplexNumber[][] multiplyComplexNumberMatrixByScalar(ComplexNumber complexNumberScalar,
                                                                 ComplexNumber[][] originalMatrix) {

        if(!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        ComplexNumber[][] resultMatrix = new ComplexNumber[numRows][numColumns];

        for(int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for(int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                ComplexNumber intermediaryComplexNumber = originalMatrix[currentNumRow][currentNumColumn];

                intermediaryComplexNumber.multiply(complexNumberScalar);

                resultMatrix[currentNumRow][currentNumColumn] = intermediaryComplexNumber;

            }

        }

        return resultMatrix;

    }

    public static Integer[][] divideIntegerMatrixByScalar(Integer integerScalar, Integer[][] originalMatrix) {

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

    public static Double[][] divideDoubleMatrixByScalar(Double doubleScalar, Double[][] originalMatrix) {

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

    public static Float[][] divideFloatMatrixByScalar(Float floatScalar, Float[][] originalMatrix) {

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

    public static ComplexNumber[][] divideComplexNumberMatrixByScalar(ComplexNumber complexNumberScalar,
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

                ComplexNumber intermediaryComplexNumber = originalMatrix[currentNumRow][currentNumColumn];

                intermediaryComplexNumber.divide(complexNumberScalar);

                resultMatrix[currentNumRow][currentNumColumn] = intermediaryComplexNumber;

            }

        }

        return resultMatrix;

    }

    public static Integer[][] sumTwoIntegerMatrices(Integer[][] integerMatrixNum1, Integer[][] integerMatrixNum2) {

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

    public static Double[][] sumTwoDoubleMatrices(Double[][] doubleMatrixNum1, Double[][] doubleMatrixNum2) {

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

    public static Float[][] sumTwoFloatMatrices(Float[][] floatMatrixNum1, Float[][] floatMatrixNum2) {

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

    public static ComplexNumber[][] sumTwoComplexNumberMatrices(ComplexNumber[][] complexNumberMatrixNum1,
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

    public static Integer[][] subtractTwoIntegerMatrices(Integer[][] integerMatrixNum1, Integer[][] integerMatrixNum2) {

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

    public static Double[][] subtractTwoDoubleMatrices(Double[][] doubleMatrixNum1, Double[][] doubleMatrixNum2) {

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

    public static Float[][] subtractTwoFloatMatrices(Float[][] floatMatrixNum1, Float[][] floatMatrixNum2) {

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

    public static ComplexNumber[][] subtractTwoComplexNumberMatrices(ComplexNumber[][] complexNumberMatrixNum1,
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

    public static Integer[][] multiplyTwoIntegerMatrices(Integer[][] integerMatrixNum1, Integer[][] integerMatrixNum2) {

        if( !isValidMatrix(integerMatrixNum1) || !isValidMatrix(integerMatrixNum2) ) {

            return null;

        }


        int numRowsIntegerMatrixNum1 = getNumRows(integerMatrixNum1);
        int numColumnsIntegerMatrixNum1 = getNumColumns(integerMatrixNum1);

        int numRowsIntegerMatrixNum2 = getNumRows(integerMatrixNum2);
        int numColumnsIntegerMatrixNum2 = getNumColumns(integerMatrixNum2);


        if(numColumnsIntegerMatrixNum1 != numRowsIntegerMatrixNum2) {

            return null;

        }


        Integer[][] resultMatrix = new Integer[numRowsIntegerMatrixNum1][numColumnsIntegerMatrixNum2];

        for(int currentRowMatrixNum1 = 0;
            currentRowMatrixNum1 < numRowsIntegerMatrixNum1; currentRowMatrixNum1++) {

            for (int currentColumnMatrixNum2 = 0;
                 currentColumnMatrixNum2 < numColumnsIntegerMatrixNum2; currentColumnMatrixNum2++) {

                for (int currentColumnMatrixNum1 = 0;
                     currentColumnMatrixNum1 < numColumnsIntegerMatrixNum1; currentColumnMatrixNum1++) {

                    resultMatrix[currentRowMatrixNum1][currentColumnMatrixNum2] +=
                            ( integerMatrixNum1[currentRowMatrixNum1][currentColumnMatrixNum1] *
                              integerMatrixNum2[currentColumnMatrixNum1][currentColumnMatrixNum2] );

                }

            }

        }

        return resultMatrix;

    }

    public static Double[][] multiplyTwoDoubleMatrices(Double[][] doubleMatrixNum1, Double[][] doubleMatrixNum2) {

        if( !isValidMatrix(doubleMatrixNum1) || !isValidMatrix(doubleMatrixNum2) ) {

            return null;

        }


        int numRowsDoubleMatrixNum1 = getNumRows(doubleMatrixNum1);
        int numColumnsDoubleMatrixNum1 = getNumColumns(doubleMatrixNum1);

        int numRowsDoubleMatrixNum2 = getNumRows(doubleMatrixNum2);
        int numColumnsDoubleMatrixNum2 = getNumColumns(doubleMatrixNum2);


        if(numColumnsDoubleMatrixNum1 != numRowsDoubleMatrixNum2) {

            return null;

        }


        Double[][] resultMatrix = new Double[numRowsDoubleMatrixNum1][numColumnsDoubleMatrixNum2];

        for(int currentRowMatrixNum1 = 0;
            currentRowMatrixNum1 < numRowsDoubleMatrixNum1; currentRowMatrixNum1++) {

            for (int currentColumnMatrixNum2 = 0;
                 currentColumnMatrixNum2 < numColumnsDoubleMatrixNum2; currentColumnMatrixNum2++) {

                for (int currentColumnMatrixNum1 = 0;
                     currentColumnMatrixNum1 < numColumnsDoubleMatrixNum1; currentColumnMatrixNum1++) {

                    resultMatrix[currentRowMatrixNum1][currentColumnMatrixNum2] +=
                            ( doubleMatrixNum1[currentRowMatrixNum1][currentColumnMatrixNum1] *
                                    doubleMatrixNum2[currentColumnMatrixNum1][currentColumnMatrixNum2] );

                }

            }

        }

        return resultMatrix;

    }

    public static Float[][] multiplyTwoDoubleMatrices(Float[][] floatMatrixNum1, Float[][] floatMatrixNum2) {

        if(!isValidMatrix(floatMatrixNum1) || !isValidMatrix(floatMatrixNum2)) {

            return null;

        }


        int numRowsFloatMatrixNum1 = getNumRows(floatMatrixNum1);
        int numColumnsFloatMatrixNum1 = getNumColumns(floatMatrixNum1);

        int numRowsFloatMatrixNum2 = getNumRows(floatMatrixNum2);
        int numColumnsFloatMatrixNum2 = getNumColumns(floatMatrixNum2);


        if(numColumnsFloatMatrixNum1 != numRowsFloatMatrixNum2) {

            return null;

        }


        Float[][] resultMatrix = new Float[numRowsFloatMatrixNum1][numColumnsFloatMatrixNum2];

        for(int currentRowMatrixNum1 = 0;
            currentRowMatrixNum1 < numRowsFloatMatrixNum1; currentRowMatrixNum1++) {

            for (int currentColumnMatrixNum2 = 0;
                 currentColumnMatrixNum2 < numColumnsFloatMatrixNum2; currentColumnMatrixNum2++) {

                for (int currentColumnMatrixNum1 = 0;
                     currentColumnMatrixNum1 < numColumnsFloatMatrixNum1; currentColumnMatrixNum1++) {

                    resultMatrix[currentRowMatrixNum1][currentColumnMatrixNum2] +=
                            ( floatMatrixNum1[currentRowMatrixNum1][currentColumnMatrixNum1] *
                                    floatMatrixNum2[currentColumnMatrixNum1][currentColumnMatrixNum2] );

                }

            }

        }

        return resultMatrix;

    }

    public static ComplexNumber[][] multiplyTwoComplexNumberMatrices(ComplexNumber[][] complexNumberMatrixNum1,
                                                                     ComplexNumber[][] complexNumberMatrixNum2)
    {

        if(!isValidMatrix(complexNumberMatrixNum1) || !isValidMatrix(complexNumberMatrixNum2)) {

            return null;

        }


        int numRowsComplexNumberMatrixNum1 = getNumRows(complexNumberMatrixNum1);
        int numColumnsComplexNumberMatrixNum1 = getNumColumns(complexNumberMatrixNum1);

        int numRowsComplexNumberMatrixNum2 = getNumRows(complexNumberMatrixNum2);
        int numColumnsComplexNumberMatrixNum2 = getNumColumns(complexNumberMatrixNum2);


        if(numColumnsComplexNumberMatrixNum1 != numRowsComplexNumberMatrixNum2) {

            return null;

        }


        ComplexNumber[][] resultMatrix =
                new ComplexNumber[numRowsComplexNumberMatrixNum1][numColumnsComplexNumberMatrixNum2];

        for(int currentRow = 0; currentRow < numRowsComplexNumberMatrixNum1; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumnsComplexNumberMatrixNum2; currentColumn++) {

                resultMatrix[currentRow][currentColumn] = ComplexNumber.real_zero_img_zero;

            }

        }

        for(int currentRowMatrixNum1 = 0;
            currentRowMatrixNum1 < numRowsComplexNumberMatrixNum1; currentRowMatrixNum1++) {

            for (int currentColumnMatrixNum2 = 0;
                 currentColumnMatrixNum2 < numColumnsComplexNumberMatrixNum2; currentColumnMatrixNum2++) {

                for (int currentColumnMatrixNum1 = 0;
                     currentColumnMatrixNum1 < numColumnsComplexNumberMatrixNum1; currentColumnMatrixNum1++) {

                    ComplexNumber intermediaryComplexNumber =
                            complexNumberMatrixNum1[currentRowMatrixNum1][currentColumnMatrixNum1];

                    intermediaryComplexNumber
                            .multiply(complexNumberMatrixNum2[currentColumnMatrixNum1][currentColumnMatrixNum2]);

                    resultMatrix[currentRowMatrixNum1][currentColumnMatrixNum2].add(intermediaryComplexNumber);

                }

            }

        }

        return resultMatrix;

    }


    public static Integer computeDeterminantIntegerMatrix(Integer[][] integerMatrix) {

        if( !isValidMatrix(integerMatrix) ) {

            return 0;

        }


        int numRows = getNumRows(integerMatrix);
        int numColumns = getNumColumns(integerMatrix);


        if( (numRows == 1) && (numColumns == 1) ) {

            return integerMatrix[0][0];

        }


        if( (numRows == 2) && (numColumns == 2) ) {

            return ( ( integerMatrix[0][0] * integerMatrix[1][1] ) -
                     ( integerMatrix[0][1] * integerMatrix[1][0] ) );

        }


        if( (numRows == 3) && (numColumns == 3) ) {

            return ( ( ( integerMatrix[0][0] * integerMatrix[1][1] * integerMatrix[2][2] ) +
                       ( integerMatrix[0][1] * integerMatrix[1][2] * integerMatrix[2][0] ) +
                       ( integerMatrix[0][2] * integerMatrix[1][0] * integerMatrix[2][1] ) )
                   - ( ( integerMatrix[0][0] * integerMatrix[1][2] * integerMatrix[2][1] ) +
                       ( integerMatrix[0][1] * integerMatrix[1][0] * integerMatrix[2][2] ) +
                       ( integerMatrix[0][2] * integerMatrix[1][1] * integerMatrix[2][0] ) ) );

        }


        int determinantResult = 0;
        Integer[][] temporaryIntegerMatrix;

        for (int currentColumnNum1 = 0; currentColumnNum1 < numColumns; currentColumnNum1++) {

            temporaryIntegerMatrix = new Integer[ ( numRows - 1 ) ][ ( numColumns - 1 ) ];


            for (int currentRow = 1; currentRow < numRows; currentRow++) {

                for (int currentColumn2 = 0; currentColumn2 < numColumns; currentColumn2++) {

                    if (currentColumn2 < currentColumnNum1) {

                        temporaryIntegerMatrix[ ( currentRow - 1 ) ][currentColumn2] =
                                    integerMatrix[currentRow][currentColumn2];

                    }
                    else if (currentColumn2 > currentColumnNum1) {

                        temporaryIntegerMatrix[ ( currentRow - 1 ) ][ ( currentColumn2 - 1 ) ] =
                                    integerMatrix[currentRow][currentColumn2];

                    }
                }
            }


            determinantResult += ( temporaryIntegerMatrix[0][currentColumnNum1] *
                                   ( (int) Math.pow( -1 , currentColumnNum1 ) ) *
                                   computeDeterminantIntegerMatrix(temporaryIntegerMatrix) );

        }


        return determinantResult;

    }

    public static Double computeDeterminantDoubleMatrix(Double[][] doubleMatrix) {

        if( !isValidMatrix(doubleMatrix) ) {

            return 0.0;

        }


        int numRows = getNumRows(doubleMatrix);
        int numColumns = getNumColumns(doubleMatrix);


        if( (numRows == 1) && (numColumns == 1) ) {

            return doubleMatrix[0][0];

        }


        if( (numRows == 2) && (numColumns == 2) ) {

            return ( ( doubleMatrix[0][0] * doubleMatrix[1][1] ) -
                     ( doubleMatrix[0][1] * doubleMatrix[1][0] ) );

        }


        if( (numRows == 3) && (numColumns == 3) ) {

            return ( ( ( doubleMatrix[0][0] * doubleMatrix[1][1] * doubleMatrix[2][2] ) +
                    ( doubleMatrix[0][1] * doubleMatrix[1][2] * doubleMatrix[2][0] ) +
                    ( doubleMatrix[0][2] * doubleMatrix[1][0] * doubleMatrix[2][1] ) )
                    - ( ( doubleMatrix[0][0] * doubleMatrix[1][2] * doubleMatrix[2][1] ) +
                    ( doubleMatrix[0][1] * doubleMatrix[1][0] * doubleMatrix[2][2] ) +
                    ( doubleMatrix[0][2] * doubleMatrix[1][1] * doubleMatrix[2][0] ) ) );

        }


        double determinantResult = 0;
        Double[][] temporaryDoubleMatrix;

        for (int currentColumnNum1 = 0; currentColumnNum1 < numColumns; currentColumnNum1++) {

            temporaryDoubleMatrix = new Double[ ( numRows - 1 ) ][ ( numColumns - 1 ) ];


            for (int currentRow = 1; currentRow < numRows; currentRow++) {

                for (int currentColumn2 = 0; currentColumn2 < numColumns; currentColumn2++) {

                    if (currentColumn2 < currentColumnNum1) {

                        temporaryDoubleMatrix[ ( currentRow - 1 ) ][currentColumn2] =
                                doubleMatrix[currentRow][currentColumn2];

                    }
                    else if (currentColumn2 > currentColumnNum1) {

                        temporaryDoubleMatrix[ ( currentRow - 1 ) ][ ( currentColumn2 - 1 ) ] =
                                doubleMatrix[currentRow][currentColumn2];

                    }
                }
            }


            determinantResult += ( temporaryDoubleMatrix[0][currentColumnNum1] *
                                 Math.pow( -1 , currentColumnNum1 ) *
                                 computeDeterminantDoubleMatrix(temporaryDoubleMatrix) );

        }


        return determinantResult;

    }

    public static Float computeDeterminantFloatMatrix(Float[][] floatMatrix) {

        if( !isValidMatrix(floatMatrix) ) {

            return 0.0f;

        }


        int numRows = getNumRows(floatMatrix);
        int numColumns = getNumColumns(floatMatrix);


        if( (numRows == 1) && (numColumns == 1) ) {

            return floatMatrix[0][0];

        }


        if( (numRows == 2) && (numColumns == 2) ) {

            return ( ( floatMatrix[0][0] * floatMatrix[1][1] ) -
                     ( floatMatrix[0][1] * floatMatrix[1][0] ) );

        }


        if( (numRows == 3) && (numColumns == 3) ) {

            return ( ( ( floatMatrix[0][0] * floatMatrix[1][1] * floatMatrix[2][2] ) +
                       ( floatMatrix[0][1] * floatMatrix[1][2] * floatMatrix[2][0] ) +
                       ( floatMatrix[0][2] * floatMatrix[1][0] * floatMatrix[2][1] ) )
                   - ( ( floatMatrix[0][0] * floatMatrix[1][2] * floatMatrix[2][1] ) +
                       ( floatMatrix[0][1] * floatMatrix[1][0] * floatMatrix[2][2] ) +
                       ( floatMatrix[0][2] * floatMatrix[1][1] * floatMatrix[2][0] ) ) );

        }


        Float determinantResult = 0.0f;
        Float[][] temporaryFloatMatrix;

        for (int currentColumnNum1 = 0; currentColumnNum1 < numColumns; currentColumnNum1++) {

            temporaryFloatMatrix = new Float[ ( numRows - 1 ) ][ ( numColumns - 1 ) ];


            for (int currentRow = 1; currentRow < numRows; currentRow++) {

                for (int currentColumn2 = 0; currentColumn2 < numColumns; currentColumn2++) {

                    if (currentColumn2 < currentColumnNum1) {

                        temporaryFloatMatrix[ ( currentRow - 1 ) ][currentColumn2] =
                                floatMatrix[currentRow][currentColumn2];

                    }
                    else if (currentColumn2 > currentColumnNum1) {

                        temporaryFloatMatrix[ ( currentRow - 1 ) ][ ( currentColumn2 - 1 ) ] =
                                floatMatrix[currentRow][currentColumn2];

                    }
                }
            }


            determinantResult += ( temporaryFloatMatrix[0][currentColumnNum1] *
                                   (float) Math.pow( -1 , currentColumnNum1 ) *
                                   computeDeterminantFloatMatrix(temporaryFloatMatrix) );

        }


        return determinantResult;

    }

    public static ComplexNumber computeDeterminantComplexNumberMatrix(ComplexNumber[][] complexNumberMatrix) {

        if( !isValidMatrix(complexNumberMatrix) ) {

            return ComplexNumber.real_zero_img_zero;

        }


        int numRows = getNumRows(complexNumberMatrix);
        int numColumns = getNumColumns(complexNumberMatrix);


        if( (numRows == 1) && (numColumns == 1) ) {

            return complexNumberMatrix[0][0];

        }


        if( (numRows == 2) && (numColumns == 2) ) {

            return ComplexNumber.subtract
                    (
                        ComplexNumber.multiply( complexNumberMatrix[0][0] , complexNumberMatrix[1][1] ) ,
                        ComplexNumber.multiply( complexNumberMatrix[0][1] , complexNumberMatrix[1][0] )
                    );

        }


        if( (numRows == 3) && (numColumns == 3) ) {

            ComplexNumber auxiliaryComplexNumberNum1 = complexNumberMatrix[0][0];

            auxiliaryComplexNumberNum1.multiply(complexNumberMatrix[1][1]);
            auxiliaryComplexNumberNum1.multiply(complexNumberMatrix[2][2]);


            ComplexNumber auxiliaryComplexNumberNum2 = complexNumberMatrix[0][1];

            auxiliaryComplexNumberNum2.multiply(complexNumberMatrix[1][2]);
            auxiliaryComplexNumberNum2.multiply(complexNumberMatrix[2][0]);


            ComplexNumber auxiliaryComplexNumberNum3 = complexNumberMatrix[0][2];

            auxiliaryComplexNumberNum3.multiply(complexNumberMatrix[1][0]);
            auxiliaryComplexNumberNum3.multiply(complexNumberMatrix[2][1]);



            ComplexNumber auxiliaryComplexNumberNum4 = complexNumberMatrix[0][0];

            auxiliaryComplexNumberNum4.multiply(complexNumberMatrix[1][2]);
            auxiliaryComplexNumberNum4.multiply(complexNumberMatrix[2][1]);


            ComplexNumber auxiliaryComplexNumberNum5 = complexNumberMatrix[0][1];

            auxiliaryComplexNumberNum5.multiply(complexNumberMatrix[1][0]);
            auxiliaryComplexNumberNum5.multiply(complexNumberMatrix[2][2]);


            ComplexNumber auxiliaryComplexNumberNum6 = complexNumberMatrix[0][2];

            auxiliaryComplexNumberNum6.multiply(complexNumberMatrix[1][1]);
            auxiliaryComplexNumberNum6.multiply(complexNumberMatrix[2][0]);



            ComplexNumber auxiliaryComplexNumberSum1 = ComplexNumber.real_zero_img_zero;

            auxiliaryComplexNumberSum1.add(auxiliaryComplexNumberNum1);
            auxiliaryComplexNumberSum1.add(auxiliaryComplexNumberNum2);
            auxiliaryComplexNumberSum1.add(auxiliaryComplexNumberNum3);


            ComplexNumber auxiliaryComplexNumberSum2 = ComplexNumber.real_zero_img_zero;

            auxiliaryComplexNumberSum2.add(auxiliaryComplexNumberNum4);
            auxiliaryComplexNumberSum2.add(auxiliaryComplexNumberNum5);
            auxiliaryComplexNumberSum2.add(auxiliaryComplexNumberNum6);


            auxiliaryComplexNumberSum1.subtract(auxiliaryComplexNumberSum2);


            return auxiliaryComplexNumberSum1;

        }


        ComplexNumber determinantResult = ComplexNumber.real_zero_img_zero;
        ComplexNumber[][] temporaryComplexNumberMatrix;

        for (int currentColumnNum1 = 0; currentColumnNum1 < numColumns; currentColumnNum1++) {

            temporaryComplexNumberMatrix = new ComplexNumber[ ( numRows - 1 ) ][ ( numColumns - 1 ) ];


            for (int currentRow = 1; currentRow < numRows; currentRow++) {

                for (int currentColumn2 = 0; currentColumn2 < numColumns; currentColumn2++) {

                    if (currentColumn2 < currentColumnNum1) {

                        temporaryComplexNumberMatrix[ ( currentRow - 1 ) ][currentColumn2] =
                                complexNumberMatrix[currentRow][currentColumn2];

                    }
                    else if (currentColumn2 > currentColumnNum1) {

                        temporaryComplexNumberMatrix[ ( currentRow - 1 ) ][ ( currentColumn2 - 1 ) ] =
                                complexNumberMatrix[currentRow][currentColumn2];

                    }
                }
            }


            ComplexNumber auxiliaryComplexNumber = temporaryComplexNumberMatrix[0][currentColumnNum1];


            auxiliaryComplexNumber.multiply( new ComplexNumber( Math.pow( -1 , currentColumnNum1 ) , 0.0 ) );

            auxiliaryComplexNumber.multiply( computeDeterminantComplexNumberMatrix (temporaryComplexNumberMatrix) );

            determinantResult.add(auxiliaryComplexNumber);

        }


        return determinantResult;

    }


    // TODO - Invert Matrix


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


    public static Integer[][] computeLowerTriangularIntegerMatrix(Integer[][] integerMatrix) {

        if( !isValidMatrix(integerMatrix) ) {

            return null;

        }


        int numRows = getNumRows(integerMatrix);
        int numColumns = getNumColumns(integerMatrix);

        if(numRows != numColumns) {

            return null;

        }


        Integer[][] lowerTriangularIntegerMatrix = new Integer[numRows][numColumns];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow >= currentColumn) {

                    lowerTriangularIntegerMatrix[currentRow][currentColumn] =
                                integerMatrix[currentRow][currentColumn];

                }

            }

        }


        return lowerTriangularIntegerMatrix;

    }

    public static Double[][] computeLowerTriangularDoubleMatrix(Double[][] doubleMatrix) {

        if( !isValidMatrix(doubleMatrix) ) {

            return null;

        }


        int numRows = getNumRows(doubleMatrix);
        int numColumns = getNumColumns(doubleMatrix);

        if(numRows != numColumns) {

            return null;

        }


        Double[][] lowerTriangularDoubleMatrix = new Double[numRows][numColumns];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow >= currentColumn) {

                    lowerTriangularDoubleMatrix[currentRow][currentColumn] =
                                doubleMatrix[currentRow][currentColumn];

                }

            }

        }


        return lowerTriangularDoubleMatrix;

    }

    public static Float[][] computeLowerTriangularFloatMatrix(Float[][] floatMatrix) {

        if( !isValidMatrix(floatMatrix) ) {

            return null;

        }


        int numRows = getNumRows(floatMatrix);
        int numColumns = getNumColumns(floatMatrix);

        if(numRows != numColumns) {

            return null;

        }


        Float[][] lowerTriangularFloatMatrix = new Float[numRows][numColumns];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow >= currentColumn) {

                    lowerTriangularFloatMatrix[currentRow][currentColumn] =
                                floatMatrix[currentRow][currentColumn];

                }

            }

        }


        return lowerTriangularFloatMatrix;

    }

    public static ComplexNumber[][] computeLowerTriangularComplexNumberMatrix(ComplexNumber[][] complexNumberMatrix) {

        if( !isValidMatrix(complexNumberMatrix) ) {

            return null;

        }


        int numRows = getNumRows(complexNumberMatrix);
        int numColumns = getNumColumns(complexNumberMatrix);

        if(numRows != numColumns) {

            return null;

        }


        ComplexNumber[][] lowerTriangularComplexNumberMatrix = new ComplexNumber[numRows][numColumns];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow >= currentColumn) {

                    lowerTriangularComplexNumberMatrix[currentRow][currentColumn] =
                                complexNumberMatrix[currentRow][currentColumn];

                }
                else {

                    lowerTriangularComplexNumberMatrix[currentRow][currentColumn] =
                                ComplexNumber.real_zero_img_zero;

                }

            }

        }


        return lowerTriangularComplexNumberMatrix;

    }


    public static Integer[][] computeUpperTriangularIntegerMatrix(Integer[][] integerMatrix) {

        if( !isValidMatrix(integerMatrix) ) {

            return null;

        }


        int numRows = getNumRows(integerMatrix);
        int numColumns = getNumColumns(integerMatrix);

        if(numRows != numColumns) {

            return null;

        }


        Integer[][] upperTriangularIntegerMatrix = new Integer[numRows][numColumns];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow <= currentColumn) {

                    upperTriangularIntegerMatrix[currentRow][currentColumn] =
                            integerMatrix[currentRow][currentColumn];

                }

            }

        }


        return upperTriangularIntegerMatrix;

    }

    public static Double[][] computeUpperTriangularDoubleMatrix(Double[][] doubleMatrix) {

        if( !isValidMatrix(doubleMatrix) ) {

            return null;

        }


        int numRows = getNumRows(doubleMatrix);
        int numColumns = getNumColumns(doubleMatrix);

        if(numRows != numColumns) {

            return null;

        }


        Double[][] upperTriangularDoubleMatrix = new Double[numRows][numColumns];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow <= currentColumn) {

                    upperTriangularDoubleMatrix[currentRow][currentColumn] =
                                doubleMatrix[currentRow][currentColumn];

                }

            }

        }


        return upperTriangularDoubleMatrix;

    }

    public static Float[][] computeUpperTriangularFloatMatrix(Float[][] floatMatrix) {

        if( !isValidMatrix(floatMatrix) ) {

            return null;

        }


        int numRows = getNumRows(floatMatrix);
        int numColumns = getNumColumns(floatMatrix);

        if(numRows != numColumns) {

            return null;

        }


        Float[][] upperTriangularFloatMatrix = new Float[numRows][numColumns];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow <= currentColumn) {

                    upperTriangularFloatMatrix[currentRow][currentColumn] =
                                floatMatrix[currentRow][currentColumn];

                }

            }

        }


        return upperTriangularFloatMatrix;

    }

    public static ComplexNumber[][] computeUpperTriangularComplexNumberMatrix(ComplexNumber[][] complexNumberMatrix) {

        if( !isValidMatrix(complexNumberMatrix) ) {

            return null;

        }


        int numRows = getNumRows(complexNumberMatrix);
        int numColumns = getNumColumns(complexNumberMatrix);

        if(numRows != numColumns) {

            return null;

        }


        ComplexNumber[][] upperTriangularComplexNumberMatrix = new ComplexNumber[numRows][numColumns];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow <= currentColumn) {

                    upperTriangularComplexNumberMatrix[currentRow][currentColumn] =
                                complexNumberMatrix[currentRow][currentColumn];

                }
                else {

                    upperTriangularComplexNumberMatrix[currentRow][currentColumn] =
                                ComplexNumber.real_zero_img_zero;

                }

            }

        }


        return upperTriangularComplexNumberMatrix;

    }

}
