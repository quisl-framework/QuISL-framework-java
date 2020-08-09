package org.quisl.framework.java.circuits.utils.classical;

import org.quisl.framework.java.circuits.utils.Moment;
import org.quisl.framework.java.circuits.utils.common.MomentPrefixes;
import org.quisl.framework.java.instructions.operators.classical.ClassicalOperator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClassicalMoment extends Moment {

    private Map<Long, ClassicalOperator> classicalOperators;


    public ClassicalMoment(Long numMoment) {

        super(numMoment, MomentPrefixes.CLASSICAL_MOMENT.getMomentPrefix());

        this.classicalOperators = new ConcurrentHashMap<>();

    }


    public Map<Long, ClassicalOperator> getClassicalOperators() {

        return this.classicalOperators;

    }

}
