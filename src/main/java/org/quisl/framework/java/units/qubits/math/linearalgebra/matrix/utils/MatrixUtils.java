package org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.utils;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;

public class MatrixUtils {

    public MatrixUtils() {

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

    public static Object[][] transposeMatrix(Object[][] originalMatrix) {

        if( ( originalMatrix == null ) || ( originalMatrix.length == 0 ) || ( originalMatrix[0].length == 0 ) ) {

            return originalMatrix;

        }

        int numRows = originalMatrix.length;
        int numColumns = originalMatrix[0].length;

        Object[][] transposedMatrix = new Object[numColumns][numRows];

        for (int currentRow = 0; currentRow < numRows; currentRow++) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                transposedMatrix[currentColumn][currentRow] = originalMatrix[currentRow][currentColumn];

            }

        }

        return transposedMatrix;

    }

    public static Integer[][] transposeMatrix(Integer[][] originalMatrix) {

        if( ( originalMatrix == null ) || ( originalMatrix.length == 0 ) || ( originalMatrix[0].length == 0 ) ) {

            return originalMatrix;

        }

        int numRows = originalMatrix.length;
        int numColumns = originalMatrix[0].length;

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

        int numRows = originalMatrix.length;
        int numColumns = originalMatrix[0].length;

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

        int numRows = originalMatrix.length;
        int numColumns = originalMatrix[0].length;

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

            return originalMatrix;

        }

        int numRows = originalMatrix.length;
        int numColumns = originalMatrix[0].length;

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

            return originalMatrix;

        }

        int numRows = originalMatrix.length;
        int numColumns = originalMatrix[0].length;

        ComplexNumber[][] transposedMatrix = new ComplexNumber[numColumns][numRows];

        for (int currentRow = 0; currentRow < numRows; currentRow++) {

            for (int currentColumn = 0; currentColumn < numColumns; currentColumn++) {

                transposedMatrix[currentColumn][currentRow] = originalMatrix[currentRow][currentColumn];

            }

        }

        return transposedMatrix;

    }

}
