package org.quisl.framework.java.math.linearalgebra.matrix.utils.operators.logic;

import org.quisl.framework.java.math.linearalgebra.matrix.utils.operators.MatrixOperators;

public class LogicMatrixOperators extends MatrixOperators {

    public LogicMatrixOperators() {

    }

    public Boolean[][] notScalarToIntegerMatrix(Boolean[][] originalMatrix) {

        if (!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Boolean[][] resultMatrix = new Boolean[numRows][numColumns];

        for (int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for (int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        ( !originalMatrix[currentNumRow][currentNumColumn] );

            }

        }

        return resultMatrix;

    }

    public Boolean[][] andScalarToIntegerMatrix(Boolean booleanScalar, Boolean[][] originalMatrix) {

        if (!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Boolean[][] resultMatrix = new Boolean[numRows][numColumns];

        for (int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for (int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        (originalMatrix[currentNumRow][currentNumColumn] && booleanScalar);

            }

        }

        return resultMatrix;

    }

    public Boolean[][] orScalarToIntegerMatrix(Boolean booleanScalar, Boolean[][] originalMatrix) {

        if (!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Boolean[][] resultMatrix = new Boolean[numRows][numColumns];

        for (int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for (int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        (originalMatrix[currentNumRow][currentNumColumn] || booleanScalar);

            }

        }

        return resultMatrix;

    }

    public Boolean[][] xorScalarToIntegerMatrix(Boolean booleanScalar, Boolean[][] originalMatrix) {

        if (!isValidMatrix(originalMatrix)) {

            return null;

        }

        int numRows = getNumRows(originalMatrix);
        int numColumns = getNumColumns(originalMatrix);

        Boolean[][] resultMatrix = new Boolean[numRows][numColumns];

        for (int currentNumRow = 0; currentNumRow < numRows; currentNumRow++) {

            for (int currentNumColumn = 0; currentNumColumn < numColumns; currentNumColumn++) {

                resultMatrix[currentNumRow][currentNumColumn] =
                        (originalMatrix[currentNumRow][currentNumColumn] ^ booleanScalar);

            }

        }

        return resultMatrix;

    }

}
