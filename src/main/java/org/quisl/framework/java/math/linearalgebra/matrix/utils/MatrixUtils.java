package org.quisl.framework.java.math.linearalgebra.matrix.utils;

import org.quisl.framework.java.math.complex.ComplexNumber;

public class MatrixUtils {

    public MatrixUtils() {

    }

    public static int getNumRows(Object[][] matrix) {

        return matrix.length;

    }

    public static int getNumColumns(Object[][] matrix) {

        return matrix[0].length;

    }


    public static Integer[][] createIntegerIdentityMatrix(int dimensionOrder) {

        Integer[][] integerIdentityMatrix = new Integer[dimensionOrder][dimensionOrder];

        for(int currentDiagonalElement = 0; currentDiagonalElement < dimensionOrder; currentDiagonalElement++) {

            integerIdentityMatrix[currentDiagonalElement][currentDiagonalElement] = 1;

        }


        return integerIdentityMatrix;

    }

    public static Double[][] createDoubleIdentityMatrix(int dimensionOrder) {

        Double[][] doubleIdentityMatrix = new Double[dimensionOrder][dimensionOrder];

        for(int currentDiagonalElement = 0; currentDiagonalElement < dimensionOrder; currentDiagonalElement++) {

            doubleIdentityMatrix[currentDiagonalElement][currentDiagonalElement] = 1.0;

        }


        return doubleIdentityMatrix;

    }

    public static Float[][] createFloatIdentityMatrix(int dimensionOrder) {

        Float[][] floatIdentityMatrix = new Float[dimensionOrder][dimensionOrder];

        for(int currentDiagonalElement = 0; currentDiagonalElement < dimensionOrder; currentDiagonalElement++) {

            floatIdentityMatrix[currentDiagonalElement][currentDiagonalElement] = 1.0f;

        }


        return floatIdentityMatrix;

    }

    public static Boolean[][] createBooleanIdentityMatrix(int dimensionOrder) {

        Boolean[][] booleanIdentityMatrix = new Boolean[dimensionOrder][dimensionOrder];

        for(int currentDiagonalElement = 0; currentDiagonalElement < dimensionOrder; currentDiagonalElement++) {

            booleanIdentityMatrix[currentDiagonalElement][currentDiagonalElement] = true;

        }


        return booleanIdentityMatrix;

    }

    public static ComplexNumber[][] createComplexNumberIdentityMatrix(int dimensionOrder) {

        ComplexNumber[][] complexNumberIdentityMatrix = new ComplexNumber[dimensionOrder][dimensionOrder];

        for(int currentRow = 0; currentRow < dimensionOrder; currentRow++) {

            for(int currentColumn = 0; currentColumn < dimensionOrder; currentColumn++) {

                if(currentRow == currentColumn) {

                    complexNumberIdentityMatrix[currentRow][currentColumn] = ComplexNumber.real_one_img_zero;

                }
                else {

                    complexNumberIdentityMatrix[currentRow][currentColumn] = ComplexNumber.real_zero_img_zero;

                }

            }

        }


        return complexNumberIdentityMatrix;

    }


    public static Integer[][] createIntegerDiagonalMatrix(int dimensionOrder,
                                                          Integer integerElementDiagonal) {

        Integer[][] integerIdentityMatrix = new Integer[dimensionOrder][dimensionOrder];

        for(int currentDiagonalElement = 0; currentDiagonalElement < dimensionOrder; currentDiagonalElement++) {

            integerIdentityMatrix[currentDiagonalElement][currentDiagonalElement] = integerElementDiagonal;

        }


        return integerIdentityMatrix;

    }

    public static Double[][] createDoubleDiagonalMatrix(int dimensionOrder,
                                                        Double doubleElementDiagonal) {

        Double[][] doubleDiagonalMatrix = new Double[dimensionOrder][dimensionOrder];

        for(int currentDiagonalElement = 0; currentDiagonalElement < dimensionOrder; currentDiagonalElement++) {

            doubleDiagonalMatrix[currentDiagonalElement][currentDiagonalElement] = doubleElementDiagonal;

        }


        return doubleDiagonalMatrix;

    }

    public static Float[][] createFloatDiagonalMatrix(int dimensionOrder,
                                                      Float floatElementDiagonal) {

        Float[][] floatDiagonalMatrix = new Float[dimensionOrder][dimensionOrder];

        for(int currentDiagonalElement = 0; currentDiagonalElement < dimensionOrder; currentDiagonalElement++) {

            floatDiagonalMatrix[currentDiagonalElement][currentDiagonalElement] = floatElementDiagonal;

        }


        return floatDiagonalMatrix;

    }

    public static Boolean[][] createBooleanDiagonalMatrix(int dimensionOrder,
                                                          Boolean booleanElementDiagonal) {

        Boolean[][] booleanDiagonalMatrix = new Boolean[dimensionOrder][dimensionOrder];

        for(int currentDiagonalElement = 0; currentDiagonalElement < dimensionOrder; currentDiagonalElement++) {

            booleanDiagonalMatrix[currentDiagonalElement][currentDiagonalElement] = booleanElementDiagonal;

        }


        return booleanDiagonalMatrix;

    }

    public static ComplexNumber[][] createComplexNumberDiagonalMatrix(int dimensionOrder,
                                                                      ComplexNumber complexNumberElementDiagonal) {

        ComplexNumber[][] complexNumberDiagonalMatrix = new ComplexNumber[dimensionOrder][dimensionOrder];

        for(int currentRow = 0; currentRow < dimensionOrder; currentRow++) {

            for(int currentColumn = 0; currentColumn < dimensionOrder; currentColumn++) {

                if(currentRow == currentColumn) {

                    complexNumberDiagonalMatrix[currentRow][currentColumn] = complexNumberElementDiagonal;

                }
                else {

                    complexNumberDiagonalMatrix[currentRow][currentColumn] = ComplexNumber.real_zero_img_zero;

                }

            }

        }


        return complexNumberDiagonalMatrix;

    }


    public static boolean isScalar(Object[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isScalar(Integer[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isScalar(Double[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isScalar(Float[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isScalar(Boolean[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isScalar(ComplexNumber[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isRowVector(Object[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length > 1 ) );

    }

    public static boolean isRowVector(Integer[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length > 1 ) );

    }

    public static boolean isRowVector(Double[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length > 1 ) );

    }

    public static boolean isRowVector(Float[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length > 1 ) );

    }

    public static boolean isRowVector(Boolean[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length > 1 ) );

    }

    public static boolean isRowVector(ComplexNumber[][] matrix) {

        return ( ( matrix.length == 1 ) && ( matrix[0].length > 1 ) );

    }

    public static boolean isColumnVector(Object[][] matrix) {

        return ( ( matrix.length > 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isColumnVector(Integer[][] matrix) {

        return ( ( matrix.length > 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isColumnVector(Double[][] matrix) {

        return ( ( matrix.length > 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isColumnVector(Float[][] matrix) {

        return ( ( matrix.length > 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isColumnVector(Boolean[][] matrix) {

        return ( ( matrix.length > 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isColumnVector(ComplexNumber[][] matrix) {

        return ( ( matrix.length > 1 ) && ( matrix[0].length == 1 ) );

    }

    public static boolean isMatrixSquared(Object[][] matrix) {

        return matrix.length == matrix[0].length;

    }

    public static boolean isMatrixSquared(Integer[][] matrix) {

        return matrix.length == matrix[0].length;

    }

    public static boolean isMatrixSquared(Double[][] matrix) {

        return matrix.length == matrix[0].length;

    }

    public static boolean isMatrixSquared(Float[][] matrix) {

        return matrix.length == matrix[0].length;

    }

    public static boolean isMatrixSquared(Boolean[][] matrix) {

        return matrix.length == matrix[0].length;

    }

    public static boolean isMatrixSquared(ComplexNumber[][] matrix) {

        return matrix.length == matrix[0].length;

    }

    public static boolean isValidMatrix(Object[][] matrix) {

        return ( (matrix != null) && (matrix.length != 0) && (matrix[0].length != 0) );

    }

    public static boolean isObjectMatrix(Object[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }


        int numColumns = getNumColumns(matrix);

        for (Object[] objects : matrix) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if (objects[currentColumn] == null) {

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean isIntegerMatrix(Integer[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }


        int numColumns = getNumColumns(matrix);

        for (Integer[] integers : matrix) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if (integers[currentColumn] == null) {

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean isDoubleMatrix(Double[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }


        int numColumns = getNumColumns(matrix);

        for (Double[] doubles : matrix) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if (doubles[currentColumn] == null) {

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean isFloatMatrix(Float[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }


        int numColumns = getNumColumns(matrix);

        for (Float[] floats : matrix) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if (floats[currentColumn] == null) {

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean isBooleanMatrix(Boolean[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }


        int numColumns = getNumColumns(matrix);

        for (Boolean[] booleans : matrix) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if (booleans[currentColumn] == null) {

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean isComplexNumberMatrix(ComplexNumber[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }


        int numColumns = getNumColumns(matrix);

        for (ComplexNumber[] complexNumbers : matrix) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if (complexNumbers[currentColumn] == null) {

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean isIdentityMatrix(Object[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return true;

        }

        if(matrix[0][0] == null) {

            return false;

        }

        Object elementDiagonal = matrix[0][0];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if(matrix[currentRow][currentColumn] != elementDiagonal) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn] != null) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isIdentityMatrix(Integer[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return matrix[0][0] == 1;

        }

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if(matrix[currentRow][currentColumn] != 1) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn] != 0) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isIdentityMatrix(Double[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return matrix[0][0] == 1.0;

        }

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if(matrix[currentRow][currentColumn] != 1.0) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn] != 0.0) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isIdentityMatrix(Float[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return matrix[0][0] == 1.0f;

        }

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if(matrix[currentRow][currentColumn] != 1.0f) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn] != 0.0f) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isIdentityMatrix(Boolean[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return matrix[0][0];

        }

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if( !(matrix[currentRow][currentColumn]) ) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn]) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isIdentityMatrix(ComplexNumber[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return true;

        }

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if(matrix[currentRow][currentColumn] == ComplexNumber.real_one_img_zero) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn] == ComplexNumber.real_zero_img_zero) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isDiagonalMatrix(Object[][] matrix) {

        return isIdentityMatrix(matrix);

    }

    public static boolean isDiagonalMatrix(Integer[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return true;

        }

        int elementDiagonal = matrix[0][0];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if(matrix[currentRow][currentColumn] != elementDiagonal) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn] != 0) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isDiagonalMatrix(Double[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return true;

        }

        double elementDiagonal = matrix[0][0];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if(matrix[currentRow][currentColumn] != elementDiagonal) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn] != 0.0) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isDiagonalMatrix(Float[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return true;

        }

        float elementDiagonal = matrix[0][0];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if(matrix[currentRow][currentColumn] != elementDiagonal) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn] != 0.0f) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isDiagonalMatrix(Boolean[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return true;

        }

        boolean elementDiagonal = matrix[0][0];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if(matrix[currentRow][currentColumn] != elementDiagonal) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn]) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static boolean isDiagonalMatrix(ComplexNumber[][] matrix) {

        if(!isValidMatrix(matrix)) {

            return false;

        }

        if(!isMatrixSquared(matrix)) {

            return false;

        }

        int numRows = getNumRows(matrix);
        int numColumns = getNumColumns(matrix);

        if( (numRows == 1) && (numColumns == 1) ) {

            return true;

        }

        ComplexNumber elementDiagonal = matrix[0][0];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                if(currentRow == currentColumn) {

                    if( !(matrix[currentRow][currentColumn].equals(elementDiagonal) ) ) {

                        return false;

                    }

                }
                else {

                    if(matrix[currentRow][currentColumn] == ComplexNumber.real_zero_img_zero) {

                        return false;

                    }

                }

            }

        }

        return true;

    }

    public static Object[][] transposeMatrix(Object[][] originalMatrix) {

        if( ( originalMatrix == null ) || ( originalMatrix.length == 0 ) || ( originalMatrix[0].length == 0 ) ) {

            return originalMatrix;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Object[][] transposedMatrix = new Object[numColumns][numRows];

        for(int currentRow = 0; currentRow < numRows; currentRow++) {

            for(int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                transposedMatrix[currentColumn][currentRow] = originalMatrix[currentRow][currentColumn];

            }

        }

        return transposedMatrix;

    }

    public static Integer[][] transposeMatrix(Integer[][] originalMatrix) {

        if( ( originalMatrix == null ) || ( originalMatrix.length == 0 ) || ( originalMatrix[0].length == 0 ) ) {

            return originalMatrix;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Integer[][] transposedMatrix = new Integer[numColumns][numRows];

        for (int currentRow = 0; currentRow < numRows; currentRow++) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                transposedMatrix[currentColumn][currentRow] = originalMatrix[currentRow][currentColumn];

            }

        }

        return transposedMatrix;

    }

    public static Double[][] transposeMatrix(Double[][] originalMatrix) {

        if( ( originalMatrix == null ) || ( originalMatrix.length == 0 ) || ( originalMatrix[0].length == 0 ) ) {

            return originalMatrix;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Double[][] transposedMatrix = new Double[numColumns][numRows];

        for (int currentRow = 0; currentRow < numRows; currentRow++) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                transposedMatrix[currentColumn][currentRow] = originalMatrix[currentRow][currentColumn];

            }

        }

        return transposedMatrix;

    }

    public static Float[][] transposeMatrix(Float[][] originalMatrix) {

        if( ( originalMatrix == null ) || ( originalMatrix.length == 0 ) || ( originalMatrix[0].length == 0 ) ) {

            return originalMatrix;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Float[][] transposedMatrix = new Float[numColumns][numRows];

        for (int currentRow = 0; currentRow < numRows; currentRow++) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                transposedMatrix[currentColumn][currentRow] = originalMatrix[currentRow][currentColumn];

            }

        }

        return transposedMatrix;

    }

    public static Boolean[][] transposeMatrix(Boolean[][] originalMatrix) {

        if( ( originalMatrix == null ) || ( originalMatrix.length == 0 ) || ( originalMatrix[0].length == 0 ) ) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Boolean[][] transposedMatrix = new Boolean[numColumns][numRows];

        for (int currentRow = 0; currentRow < numRows; currentRow++) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                transposedMatrix[currentColumn][currentRow] = originalMatrix[currentRow][currentColumn];

            }

        }

        return transposedMatrix;

    }

    public static ComplexNumber[][] transposeMatrix(ComplexNumber[][] originalMatrix) {

        if( ( originalMatrix == null ) || ( originalMatrix.length == 0 ) || ( originalMatrix[0].length == 0 ) ) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        ComplexNumber[][] transposedMatrix = new ComplexNumber[numColumns][numRows];

        for (int currentRow = 0; currentRow < numRows; currentRow++) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                transposedMatrix[currentColumn][currentRow] = originalMatrix[currentRow][currentColumn];

            }

        }

        return transposedMatrix;

    }

}
