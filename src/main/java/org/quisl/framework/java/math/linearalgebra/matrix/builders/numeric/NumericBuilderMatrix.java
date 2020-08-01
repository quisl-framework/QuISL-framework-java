package org.quisl.framework.java.math.linearalgebra.matrix.builders.numeric;

import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.math.linearalgebra.matrix.builders.BuilderMatrix;

public class NumericBuilderMatrix extends BuilderMatrix {

    public NumericBuilderMatrix() {

    }

    public static Integer[][] buildIntegerIdentityMatrix(int sizeOfDiagonal) {

        Integer[][] integerIdentityMatrix = new Integer[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentElementOfDiagonal = 0; currentElementOfDiagonal < sizeOfDiagonal; currentElementOfDiagonal++) {

            integerIdentityMatrix[currentElementOfDiagonal][currentElementOfDiagonal] = 1;

        }

        return integerIdentityMatrix;

    }

    public static Double[][] buildDoubleIdentityMatrix(int sizeOfDiagonal) {

        Double[][] doubleIdentityMatrix = new Double[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentElementOfDiagonal = 0; currentElementOfDiagonal < sizeOfDiagonal; currentElementOfDiagonal++) {

            doubleIdentityMatrix[currentElementOfDiagonal][currentElementOfDiagonal] = 1.0;

        }

        return doubleIdentityMatrix;

    }

    public static Float[][] buildFloatIdentityMatrix(int sizeOfDiagonal) {

        Float[][] doubleIdentityMatrix = new Float[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentElementOfDiagonal = 0; currentElementOfDiagonal < sizeOfDiagonal; currentElementOfDiagonal++) {

            doubleIdentityMatrix[currentElementOfDiagonal][currentElementOfDiagonal] = 1.0f;

        }

        return doubleIdentityMatrix;

    }

    public static ComplexNumber[][] buildComplexNumberIdentityMatrix(int sizeOfDiagonal) {

        ComplexNumber[][] complexNumberIdentityMatrix = new ComplexNumber[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentRow = 0; currentRow < sizeOfDiagonal; currentRow++) {

            for(int currentColumn = 0; currentRow < sizeOfDiagonal; currentRow++) {

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

    public static Integer[][] buildIntegerDiagonalMatrix(int elementOfDiagonal, int sizeOfDiagonal) {

        Integer[][] integerIdentityMatrix = new Integer[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentElementOfDiagonal = 0; currentElementOfDiagonal < sizeOfDiagonal; currentElementOfDiagonal++) {

            integerIdentityMatrix[currentElementOfDiagonal][currentElementOfDiagonal] = elementOfDiagonal;

        }

        return integerIdentityMatrix;

    }

    public static Double[][] buildDoubleDiagonalMatrix(double elementOfDiagonal, int sizeOfDiagonal) {

        Double[][] doubleIdentityMatrix = new Double[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentElementOfDiagonal = 0; currentElementOfDiagonal < sizeOfDiagonal; currentElementOfDiagonal++) {

            doubleIdentityMatrix[currentElementOfDiagonal][currentElementOfDiagonal] = elementOfDiagonal;

        }

        return doubleIdentityMatrix;

    }

    public static Float[][] buildFloatDiagonalMatrix(float elementOfDiagonal, int sizeOfDiagonal) {

        Float[][] doubleIdentityMatrix = new Float[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentElementOfDiagonal = 0; currentElementOfDiagonal < sizeOfDiagonal; currentElementOfDiagonal++) {

            doubleIdentityMatrix[currentElementOfDiagonal][currentElementOfDiagonal] = elementOfDiagonal;

        }

        return doubleIdentityMatrix;

    }

    public static ComplexNumber[][] buildComplexNumberDiagonalMatrix(ComplexNumber elementOfDiagonal,
                                                                     int sizeOfDiagonal)
    {

        ComplexNumber[][] complexNumberDiagonalMatrix = new ComplexNumber[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentRow = 0; currentRow < sizeOfDiagonal; currentRow++) {

            for(int currentColumn = 0; currentRow < sizeOfDiagonal; currentRow++) {

                if(currentRow == currentColumn) {

                    complexNumberDiagonalMatrix[currentRow][currentColumn] = elementOfDiagonal;

                }
                else {

                    complexNumberDiagonalMatrix[currentRow][currentColumn] = ComplexNumber.real_zero_img_zero;

                }

            }

        }

        return complexNumberDiagonalMatrix;

    }

}
