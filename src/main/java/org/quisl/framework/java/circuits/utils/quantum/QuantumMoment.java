package org.quisl.framework.java.circuits.utils.quantum;

import org.quisl.framework.java.circuits.utils.Moment;
import org.quisl.framework.java.circuits.utils.common.MomentPrefixes;

public class QuantumMoment extends Moment {

    public QuantumMoment(Long numMoment) {

        super(numMoment, MomentPrefixes.QUANTUM_MOMENT.getMomentPrefix());

    }

}
