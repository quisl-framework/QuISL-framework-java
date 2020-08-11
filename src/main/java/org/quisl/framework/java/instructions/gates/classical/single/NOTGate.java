package org.quisl.framework.java.instructions.gates.classical.single;

import org.quisl.framework.java.instructions.gates.classical.ClassicalGate;

public class NOTGate extends ClassicalGate {


    private final Boolean input;

    private Boolean output;


    public NOTGate(Boolean input) {

        super(1, 1, "NOTGate");

        this.input = input;

        this.output = !this.input;

    }

    public NOTGate(Integer input) throws Exception {

        super(1, 1, "NOTGate");

        if(input == 1) {

            this.input = true;

        }
        else if(input == 0) {

            this.input = false;

        }
        else {

            throw new Exception();

        }

    }


    public Boolean getInput() {

        return this.input;

    }

    public Boolean getOutput() {

        return this.output;

    }

    @Override
    public void applyGate() {

        this.output = !this.input;

    }

    @Override
    public String[] getLabelsTruthTable() {

        return new String[] { "Input", "Output" };

    }

    @Override
    public Integer[][] getIntegerTruthTable() {

        return new Integer[][]
                {
                        new Integer[] { 0 , 1 },
                        new Integer[] { 1 , 0 }
                };

    }

    @Override
    public Boolean[][] getBooleanTruthTable() {

        return new Boolean[][]
                {
                        new Boolean[] { false , true },
                        new Boolean[] { true , false }
                };

    }

}
