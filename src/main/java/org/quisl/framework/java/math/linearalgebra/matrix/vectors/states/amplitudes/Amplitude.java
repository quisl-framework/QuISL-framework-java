package org.quisl.framework.java.math.linearalgebra.matrix.vectors.states.amplitudes;

import org.quisl.framework.java.math.utils.alphabets.GreekAlphabetLetter;

public class Amplitude {

    private GreekAlphabetLetter[] amplitudeVariable;

    private Float amplitudeValue;

    public Amplitude(GreekAlphabetLetter[] amplitudeVariable, Float amplitudeValue) {

        this.amplitudeVariable = amplitudeVariable;
        this.amplitudeValue = amplitudeValue;

    }

    public GreekAlphabetLetter[] getAmplitudeVariable() {

        return this.amplitudeVariable;

    }

    public void setAmplitudeVariable(GreekAlphabetLetter[] amplitudeVariable) {

        this.amplitudeVariable = amplitudeVariable;

    }

    public Float getAmplitudeValue() {

        return this.amplitudeValue;

    }

    public void setAmplitudeValue(Float amplitudeValue) {

        this.amplitudeValue = amplitudeValue;

    }

    public Float getModulusSquaredOfAmplitude() {

        return ( (float) Math.pow(Math.abs(this.amplitudeValue), 2.0) );

    }

}
