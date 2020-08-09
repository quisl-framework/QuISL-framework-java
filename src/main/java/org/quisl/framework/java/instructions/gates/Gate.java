package org.quisl.framework.java.instructions.gates;

public abstract class Gate {

    private Integer numInputs;

    private Integer numOutputs;

    private String prefix;

    private String gateName;


    public Gate(Integer numInputs, Integer numOutputs,
                String prefix, String gateName) {

        this.numInputs = numInputs;
        this.numOutputs = numOutputs;

        this.prefix = prefix;

        this.gateName = gateName;

    }

    public Integer getNumInputs() {

        return this.numInputs;

    }

    public Integer getNumOutputs() {

        return this.numOutputs;

    }

    public String getPrefix() {

        return this.prefix;

    }

    public String getGateName() {

        return this.gateName;

    }

}
