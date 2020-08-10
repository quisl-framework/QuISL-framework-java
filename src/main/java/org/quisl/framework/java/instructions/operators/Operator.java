package org.quisl.framework.java.instructions.operators;

public abstract class Operator {

    private final Long operatorId;

    private final String prefixComputing;


    public Operator(Long operatorId, String prefixComputing) {

        this.operatorId = operatorId;

        this.prefixComputing = prefixComputing;

    }


    public Long getOperatorId() {

        return this.operatorId;

    }

    public String getPrefixComputing() {

        return this.prefixComputing;

    }

    public abstract void setupGate(Object[] inputs, Object[] outputs, String gateName) throws Exception;

    public abstract void applyGate();

}
