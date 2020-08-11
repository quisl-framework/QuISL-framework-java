package org.quisl.framework.java.instructions.gates.classical.multi;

import org.quisl.framework.java.instructions.gates.classical.ClassicalGate;

public class ORGate extends ClassicalGate {


    private final Boolean inputNo1;

    private final Boolean inputNo2;

    private Boolean output;


    public ORGate(Boolean inputNo1, Boolean inputNo2) {

        super(2, 1, "ORGate");

        this.inputNo1 = inputNo1;
        this.inputNo2 = inputNo2;

        this.output = null;

    }

    public ORGate(Integer inputNo1, Integer inputNo2) throws Exception {

        super(2, 1, "ORGate");

        if(inputNo1 == 1) {

            this.inputNo1 = true;

        }
        else if(inputNo1 == 0) {

            this.inputNo1 = false;

        }
        else {

            throw new Exception();

        }

        if(inputNo2 == 1) {

            this.inputNo2 = true;

        }
        else if(inputNo2 == 0) {

            this.inputNo2 = false;

        }
        else {

            throw new Exception();

        }


        this.output = null;

    }


    public Boolean getInputNo1() {

        return this.inputNo1;

    }

    public Boolean getInputNo2() {

        return this.inputNo2;

    }

    public Boolean getOutput() {

        return this.output;

    }

    @Override
    public void applyGate() {

        this.output = ( this.inputNo1 || this.inputNo2 );

    }

    @Override
    public String[] getLabelsTruthTable() {

        return new String[] { "Input #1", "Input #2", "Output" };

    }

    @Override
    public Integer[][] getIntegerTruthTable() {

        return new Integer[][]
                {
                        new Integer[] { 0 , 0, 0 },
                        new Integer[] { 0 , 1, 1 },
                        new Integer[] { 1 , 0, 1 },
                        new Integer[] { 1 , 1, 1 }
                };

    }

    @Override
    public Boolean[][] getBooleanTruthTable() {

        return new Boolean[][]
                {
                        new Boolean[] { false, false, false },
                        new Boolean[] { false, true, true },
                        new Boolean[] { true, false, true },
                        new Boolean[] { true, true, true }
                };

    }

}
