package org.quisl.framework.java.instructions.operators;

public abstract class Operator {

    private Long operatorId;

    public Operator(Long operatorId) {

        this.operatorId = operatorId;

    }

    public Long getOperatorId() {

        return this.operatorId;

    }

}
