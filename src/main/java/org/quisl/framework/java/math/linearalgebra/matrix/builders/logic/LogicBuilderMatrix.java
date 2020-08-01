package org.quisl.framework.java.math.linearalgebra.matrix.builders.logic;

import org.quisl.framework.java.math.linearalgebra.matrix.builders.BuilderMatrix;

public class LogicBuilderMatrix extends BuilderMatrix {

    public LogicBuilderMatrix() {

    }

    public static Boolean[][] buildBooleanIdentityMatrix(int sizeOfDiagonal) {

        Boolean[][] booleanIdentityMatrix = new Boolean[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentElementOfDiagonal = 0; currentElementOfDiagonal < sizeOfDiagonal; currentElementOfDiagonal++) {

            booleanIdentityMatrix[currentElementOfDiagonal][currentElementOfDiagonal] = true;

        }

        return booleanIdentityMatrix;

    }

    public static Boolean[][] buildBooleanDiagonalMatrix(boolean elementOfDiagonal, int sizeOfDiagonal) {

        Boolean[][] booleanIdentityMatrix = new Boolean[sizeOfDiagonal][sizeOfDiagonal];

        for(int currentElementOfDiagonal = 0; currentElementOfDiagonal < sizeOfDiagonal; currentElementOfDiagonal++) {

            booleanIdentityMatrix[currentElementOfDiagonal][currentElementOfDiagonal] = elementOfDiagonal;

        }

        return booleanIdentityMatrix;

    }

}
