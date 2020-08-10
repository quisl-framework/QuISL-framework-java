package org.quisl.framework.java.instructions.operators.classical.single;

import org.quisl.framework.java.instructions.gates.classical.single.NOTGate;
import org.quisl.framework.java.instructions.operators.classical.ClassicalOperator;
import org.quisl.framework.java.units.computing.classical.binary.deterministic.bits.Bit;

public class NOTOperator extends ClassicalOperator {

    private final Bit bitInput;

    private final Bit bitOutput;

    private NOTGate notGate;


    public NOTOperator(Long operatorId, Bit bitInput, Bit bitOutput) throws Exception {

        super(operatorId, 1, 1);

        this.bitInput = bitInput;
        this.bitOutput = bitOutput;

        this.setupGate( new Bit[] { bitInput } , new Bit[] { bitOutput } , "NOTGate");

    }

    public Bit getBitInput() {

        return this.bitInput;

    }

    public Bit getBitOutput() {

        return this.bitOutput;

    }

    @Override
    public void setupGate(Object[] inputs, Object[] outputs, String gateName) throws Exception {

        if( ( inputs instanceof Bit[] ) && ( outputs instanceof Bit[] ) ) {

            if( ( inputs.length == 1 ) && ( outputs.length == 1 ) ) {

                this.notGate = new NOTGate( ( (Bit) inputs[0] ).getStateInBinary() );

            }
            else {

                throw new Exception();

            }

        }
        else {

            throw new Exception();

        }

    }

    @Override
    public void applyGate() {

        this.notGate.applyGate();

        this.bitOutput.setStateInBoolean( this.notGate.getOutput() );

    }

}
