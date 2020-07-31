package org.quisl.framework.java.registers.classical;

import org.quisl.framework.java.registers.Register;
import org.quisl.framework.java.units.bits.Bit;
import org.quisl.framework.java.units.qubits.Qubit;
import org.quisl.framework.java.units.qubits.math.complex.ComplexNumber;

import java.util.Arrays;

public class ClassicalRegister extends Register {

    private Bit[] bits;

    private float[] bitsProbabilities;


    public ClassicalRegister(Long id) {

        super(id, "cl_reg" + id);

        this.setup("|0⟩", "|1⟩");

    }

    public ClassicalRegister(Long id, String stateNameBitNum1, String stateNameBitNum2) {

        super(id, "cl_reg" + id);

        this.setup(stateNameBitNum1, stateNameBitNum2);

    }

    public ClassicalRegister(Long id, String classicalRegisterName, String stateNameBitNum1, String stateNameBitNum2) {

        super(id, classicalRegisterName);

        this.setup(stateNameBitNum1, stateNameBitNum2);

    }

    private void setup(String stateNameBitNum1, String stateNameBitNum2) {

        this.setupBits(stateNameBitNum1, stateNameBitNum2);
        this.setupBitsProbabilities();

    }

    private void setupBits(String stateNameBitNum1, String stateNameBitNum2) {

        this.bits = new Bit[2];

        this.bits[0] = new Bit(1L, Bit.ZERO_STATE, stateNameBitNum1);
        this.bits[1] = new Bit(2L, Bit.ONE_STATE, stateNameBitNum2);

    }

    private void setupBitsProbabilities() {

        this.bitsProbabilities = new float[2];

        this.bitsProbabilities[Bit.ZERO_STATE] = 1.0f;
        this.bitsProbabilities[Bit.ONE_STATE] = 0.0f;

    }

    public Bit[] getBits() {
        return this.bits;
    }

    public void setBits(Bit[] bits) {
        this.bits = bits;
    }

    public float[] getBitsProbabilities() {
        return this.bitsProbabilities;
    }

    public void setBitsProbabilities(float[] bitsProbabilities) {
        this.bitsProbabilities = bitsProbabilities;
    }

    public void retrieveMeasurement(Qubit qubit) {

        if ( qubit.isMeasurementPerformed() ) {

            ComplexNumber[] qubitAmplitudes = qubit.getAmplitudes();

            this.bitsProbabilities[0] = (float) Math.pow(qubitAmplitudes[0].modulus(), 2.0);
            this.bitsProbabilities[1] = (float) Math.pow(qubitAmplitudes[1].modulus(), 2.0);

        }

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        ClassicalRegister that = (ClassicalRegister) o;

        return Arrays.equals(bits, that.bits) &&
               Arrays.equals(bitsProbabilities, that.bitsProbabilities);

    }

    @Override
    public int hashCode() {

        int result = super.hashCode();

        result = 31 * result + Arrays.hashCode(bits);

        result = 31 * result + Arrays.hashCode(bitsProbabilities);

        return result;

    }

    @Override
    public String toString() {
        return "ClassicalRegister{" +
                "bits=" + Arrays.toString(bits) +
                ", bitsProbabilities=" + Arrays.toString(bitsProbabilities) +
                '}';
    }
}
