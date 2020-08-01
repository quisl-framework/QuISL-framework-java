package org.quisl.framework.java.math.linearalgebra.matrix.vectors.states;

import org.quisl.framework.java.math.linearalgebra.matrix.vectors.Vector;
import org.quisl.framework.java.math.linearalgebra.matrix.vectors.states.amplitudes.Amplitude;

public class StateVector extends Vector {

    private byte stateVectorID;

    private String stateVectorName;

    private String stateVectorRepresentation;

    private String stateVectorDescription;

    private Amplitude[] stateVectorAmplitudes;


    public StateVector(byte stateVectorID, String stateVectorName, String stateVectorRepresentation,
                       String stateVectorDescription, Amplitude[] stateVectorAmplitudes)
    {

        this.stateVectorID = stateVectorID;

        this.stateVectorName = stateVectorName;
        this.stateVectorRepresentation = stateVectorRepresentation;

        this.stateVectorDescription = stateVectorDescription;

        this.stateVectorAmplitudes = stateVectorAmplitudes;

    }


    public byte getStateVectorID() {

        return this.stateVectorID;

    }

    public void setStateVectorID(byte stateVectorID) {

        this.stateVectorID = stateVectorID;

    }

    public String getStateVectorName() {

        return this.stateVectorName;

    }

    public void setStateVectorName(String stateVectorName) {

        this.stateVectorName = stateVectorName;

    }

    public String getStateVectorRepresentation() {

        return this.stateVectorRepresentation;

    }

    public void setStateVectorRepresentation(String stateVectorRepresentation) {

        this.stateVectorRepresentation = stateVectorRepresentation;

    }

    public String getStateVectorDescription() {

        return this.stateVectorDescription;

    }

    public void setStateVectorDescription(String stateVectorDescription) {

        this.stateVectorDescription = stateVectorDescription;

    }

    public Amplitude[] getStateVectorAmplitudes() {

        return this.stateVectorAmplitudes;

    }

    public void setStateVectorAmplitudes(Amplitude[] stateVectorAmplitudes) {

        this.stateVectorAmplitudes = stateVectorAmplitudes;

    }

}
