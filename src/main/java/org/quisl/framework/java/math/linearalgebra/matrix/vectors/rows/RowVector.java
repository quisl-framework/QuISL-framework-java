package org.quisl.framework.java.math.linearalgebra.matrix.vectors.rows;

import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.math.linearalgebra.matrix.vectors.Vector;

public class RowVector extends Vector {

    private final Object[][] elements;

    public RowVector(Object ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public RowVector(Integer ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public RowVector(Double ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public RowVector(Float ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public RowVector(Boolean ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public RowVector(ComplexNumber... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public boolean isObjectRowVector() {

        for(Object element : this.elements[0]) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isIntegerRowVector() {

        for(Integer element : ( (Integer[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isDoubleRowVector() {

        for(Double element : ( (Double[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isFloatRowVector() {

        for(Float element : ( (Float[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isBooleanRowVector() {

        for(Boolean element : ( (Boolean[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isComplexNumberRowVector() {

        for(ComplexNumber element : ( (ComplexNumber[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

}
