package org.quisl.framework.java.instructions.operators.classical;

import org.quisl.framework.java.common.ComputingPrefixes;
import org.quisl.framework.java.instructions.gates.Gate;
import org.quisl.framework.java.instructions.gates.classical.ClassicalGate;
import org.quisl.framework.java.instructions.operators.Operator;
import org.quisl.framework.java.units.computing.classical.binary.deterministic.bits.Bit;

public abstract class ClassicalOperator extends Operator {

    private final Integer numBitsInput;

    private final Integer numBitsOutput;

    private ClassicalGate classicalGate;


    public ClassicalOperator(Long operatorId, Integer numBitsInput, Integer numBitsOutput) {

        super(operatorId, ComputingPrefixes.CLASSICAL_PREFIX.getComputingPrefix());

        this.numBitsInput = numBitsInput;
        this.numBitsOutput = numBitsOutput;

    }


    public Integer getNumBitsInput() {

        return this.numBitsInput;

    }

    public Integer getNumBitsOutput() {

        return this.numBitsOutput;

    }

    public ClassicalGate getClassicalGate() {

        return this.classicalGate;

    }

}
