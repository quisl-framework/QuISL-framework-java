package org.quisl.framework.java.logics.operators.classical.expressions.single;

import org.quisl.framework.java.logics.operators.classical.ClassicalLogicExpressionOperator;

public class NOTLogicExpressionOperator extends ClassicalLogicExpressionOperator {

    private Boolean input;

    private Boolean output;

    public NOTLogicExpressionOperator() {

    }

    public NOTLogicExpressionOperator(Boolean input) {

        this.input = input;

        this.output = !this.input;

    }

    public NOTLogicExpressionOperator(Integer input) throws Exception {

        if(input == 1) {

            this.input = true;

        }
        else if(input == 0) {

            this.input = false;

        }
        else {

            throw new Exception();

        }

        this.output = !this.input;

    }

    public Boolean getInput() {

        return this.input;

    }

    public Boolean getOutput() {

        return this.output;

    }

    public static String[] getLabelsNOTTruthTable() {

        return new String[] { "Input", "Output" };

    }

    public static Integer[][] getIntegerNOTTruthTable() {

        return new Integer[][]
        {
            new Integer[] { 0 , 1 },
            new Integer[] { 1 , 0 }
        };

    }

    public static Boolean[][] getBooleanNOTTruthTable() {

        return new Boolean[][]
                {
                        new Boolean[] { false , true },
                        new Boolean[] { true , false }
                };

    }

}
