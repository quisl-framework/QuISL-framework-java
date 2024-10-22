package org.quisl.framework.java.instructions.gates.classical;

import org.quisl.framework.java.common.ComputingPrefixes;
import org.quisl.framework.java.instructions.gates.Gate;

public abstract class ClassicalGate extends Gate {

    public ClassicalGate(Integer numInputs, Integer numOutputs, String gateName) {

        super(numInputs, numOutputs, ComputingPrefixes.CLASSICAL_PREFIX.getComputingPrefix(), gateName);

    }

    @Override
    public void applyGate() {

        // Empty Method

    }

    public abstract String[] getLabelsTruthTable();

    public abstract Integer[][] getIntegerTruthTable();

    public abstract Boolean[][] getBooleanTruthTable();

}
