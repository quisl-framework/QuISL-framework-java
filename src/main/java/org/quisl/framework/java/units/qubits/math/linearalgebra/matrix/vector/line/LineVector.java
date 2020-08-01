package org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.vector.line;

import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;
import org.quisl.framework.java.units.qubits.math.linearalgebra.matrix.vector.Vector;

public class LineVector extends Vector {

    private final Object[][] elements;

    public LineVector(Object ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public LineVector(Integer ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public LineVector(Double ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public LineVector(Float ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public LineVector(Boolean ... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public LineVector(ComplexNumber... elements) {

        this.elements = new Object[1][elements.length];

        this.elements[0] = elements;

    }

    public boolean isObjectLineVector() {

        for(Object element : this.elements[0]) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isIntegerLineVector() {

        for(Integer element : ( (Integer[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isDoubleLineVector() {

        for(Double element : ( (Double[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isFloatLineVector() {

        for(Float element : ( (Float[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isBooleanLineVector() {

        for(Boolean element : ( (Boolean[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

    public boolean isComplexNumberLineVector() {

        for(ComplexNumber element : ( (ComplexNumber[]) this.elements[0] ) ) {

            if(element == null) {

                return false;

            }

        }

        return true;

    }

}
