package org.quisl.framework.java.circuits.utils.quantum;

import org.quisl.framework.java.circuits.utils.Moment;
import org.quisl.framework.java.circuits.utils.common.MomentPrefixes;
import org.quisl.framework.java.instructions.operators.quantum.QuantumOperator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class QuantumMoment extends Moment {

    private Map<Long, QuantumOperator> quantumOperators;


    public QuantumMoment(Long numMoment) {

        super(numMoment, MomentPrefixes.QUANTUM_MOMENT.getMomentPrefix());

        this.quantumOperators = new ConcurrentHashMap<>();

    }


    public Map<Long, QuantumOperator> getQuantumOperators() {

        return this.quantumOperators;

    }

}
