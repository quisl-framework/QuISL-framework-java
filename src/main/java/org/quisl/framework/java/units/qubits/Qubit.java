package org.quisl.framework.java.units.qubits;

import org.quisl.framework.java.instructions.operators.quantum.QuantumOperator;
import org.quisl.framework.java.instructions.operators.quantum.multi.swap.Swap;
import org.quisl.framework.java.instructions.operators.quantum.single.SingleQuantumOperator;
import org.quisl.framework.java.instructions.operators.quantum.single.hadamard.Hadamard;
import org.quisl.framework.java.instructions.operators.quantum.single.pauli.Identity;
import org.quisl.framework.java.instructions.operators.quantum.single.pauli.PauliX;
import org.quisl.framework.java.instructions.operators.quantum.single.pauli.PauliY;
import org.quisl.framework.java.instructions.operators.quantum.single.pauli.PauliZ;
import org.quisl.framework.java.math.complex.ComplexNumber;
import org.quisl.framework.java.math.geometry.spheres.BlochSphere;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Qubit {

    private static final Integer GROUND_STATE = 0;
    private static final Integer EXCITED_STATE = 1;

    private Long id;

    private BlochSphere blochSphere;

    private List<QuantumOperator> allQuantumOperatorsList;

    private List<QuantumOperator> pendingQuantumOperatorsList;

    private Map<Integer, Qubit[]> qubitsUsedInMultiQuantumOperatorsList;

    private ComplexNumber[] amplitudes;

    private boolean measurementPerformed;

    private int finalOutcomeAfterMeasurement;


    public Qubit(Long id) {

        this.id = id;
        this.blochSphere = new BlochSphere();

        this.setup();

        this.allQuantumOperatorsList = new ArrayList<>();
        this.pendingQuantumOperatorsList = new ArrayList<>();

    }

    private void setup() {

        this.setupAmplitudes();

        this.measurementPerformed = false;
        this.finalOutcomeAfterMeasurement = -1;

        System.out.println(String.format("Started/Initialised the Qubit #%d!!!\n", this.id));

        this.printOutcomesProbabilities();

    }

    private void setupAmplitudes() {
        this.amplitudes = new ComplexNumber[2];
        this.amplitudes[0] = ComplexNumber.real_one_img_zero;
        this.amplitudes[1] = ComplexNumber.real_zero_img_zero;
    }

    public static Integer getGroundState() {
        return GROUND_STATE;
    }

    public static Integer getExcitedState() {
        return EXCITED_STATE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BlochSphere getBlochSphere() {
        return blochSphere;
    }

    public void setBlochSphere(BlochSphere blochSphere) {
        this.blochSphere = blochSphere;
    }

    public List<QuantumOperator> getAllQuantumOperatorsList() {
        return this.allQuantumOperatorsList;
    }

    public void setAllQuantumOperatorsList(List<QuantumOperator> allQuantumOperatorsList) {
        this.allQuantumOperatorsList = allQuantumOperatorsList;
    }

    public List<QuantumOperator> getPendingQuantumOperatorsList() {
        return this.pendingQuantumOperatorsList;
    }

    public void setPendingQuantumOperatorsList(List<QuantumOperator> pendingQuantumOperatorsList) {
        this.pendingQuantumOperatorsList = pendingQuantumOperatorsList;
    }

    public ComplexNumber[] getAmplitudes() {
        return this.amplitudes;
    }

    public boolean isMeasurementPerformed() {
        return this.measurementPerformed;
    }

    public void setMeasurementPerformed() {
        this.measurementPerformed = true;
    }

    public void setAmplitudes(ComplexNumber[] amplitudes) {
        this.amplitudes = amplitudes;
    }

    public int getFinalOutcomeAfterMeasurement() {
        return this.finalOutcomeAfterMeasurement;
    }

    public void applyIdentity() throws Exception {

        SingleQuantumOperator singleQuantumOperator = new Identity(this);
        this.allQuantumOperatorsList.add(singleQuantumOperator);
        this.pendingQuantumOperatorsList.add(singleQuantumOperator);

    }

    public void applyPauliX() throws Exception {

        SingleQuantumOperator singleQuantumOperator = new PauliX(this);
        this.allQuantumOperatorsList.add(singleQuantumOperator);
        this.pendingQuantumOperatorsList.add(singleQuantumOperator);

    }

    public void applyPauliY() throws Exception {

        SingleQuantumOperator singleQuantumOperator = new PauliY(this);
        this.allQuantumOperatorsList.add(singleQuantumOperator);
        this.pendingQuantumOperatorsList.add(singleQuantumOperator);

    }

    public void applyPauliZ() throws Exception {

        SingleQuantumOperator singleQuantumOperator = new PauliZ(this);
        this.allQuantumOperatorsList.add(singleQuantumOperator);
        this.pendingQuantumOperatorsList.add(singleQuantumOperator);

    }

    public void applyHadamard() throws Exception {

        SingleQuantumOperator singleQuantumOperator = new Hadamard(this);
        this.allQuantumOperatorsList.add(singleQuantumOperator);
        this.pendingQuantumOperatorsList.add(singleQuantumOperator);

    }

    public Qubit[] applySwap(Qubit otherQubit) throws Exception {

        this.performPendingAppliedQuantumOperators();
        otherQubit.performPendingAppliedQuantumOperators();

        Swap swapMultiQuantumOperator = new Swap(new Qubit[]{ this, otherQubit });

        this.allQuantumOperatorsList.add(swapMultiQuantumOperator);
        otherQubit.allQuantumOperatorsList.add(swapMultiQuantumOperator);

        System.out.println(String.format("It was applied a Quantum Operator (%s) to the Qubits #%d and #%d!!!\n\n",
                swapMultiQuantumOperator.getName(), this.getId(), otherQubit.getId()));

        swapMultiQuantumOperator.doProductCross();

        ComplexNumber[] swappedQubitProductAmplitudes;

        swappedQubitProductAmplitudes = swapMultiQuantumOperator.getQubitProductAmplitudes();

        System.out.println(String.format("Multi-Qubit System [ #%d , #%d ], " +
                        "before the Quantum Operator (%s) be performed:\n=> " +
                        "Probability(|00⟩) = %.3f | Probability(|01⟩) = %.3f | " +
                        "Probability(|10⟩) = %.3f | Probability(|11⟩) = %.3f\n\n",
                        this.id, otherQubit.id,
                        swapMultiQuantumOperator.getName(),
                        Math.pow(swappedQubitProductAmplitudes[0].modulus(), 2.0),
                        Math.pow(swappedQubitProductAmplitudes[1].modulus(), 2.0),
                        Math.pow(swappedQubitProductAmplitudes[2].modulus(), 2.0),
                        Math.pow(swappedQubitProductAmplitudes[3].modulus(), 2.0)));

        swapMultiQuantumOperator.apply();

        swappedQubitProductAmplitudes = swapMultiQuantumOperator.getQubitProductAmplitudes();

        System.out.println(String.format("Multi-Qubit System [ #%d , #%d ], " +
                        "after the Quantum Operator (%s) be performed:\n=> " +
                        "Probability(|00⟩) = %.3f | Probability(|01⟩) = %.3f | " +
                        "Probability(|10⟩) = %.3f | Probability(|11⟩) = %.3f\n\n",
                        otherQubit.id, this.id,
                        swapMultiQuantumOperator.getName(),
                        Math.pow(swappedQubitProductAmplitudes[0].modulus(), 2.0),
                        Math.pow(swappedQubitProductAmplitudes[1].modulus(), 2.0),
                        Math.pow(swappedQubitProductAmplitudes[2].modulus(), 2.0),
                        Math.pow(swappedQubitProductAmplitudes[3].modulus(), 2.0)));

        System.out.println(String.format("The order of the Qubits, before the Quantum Operator (%s) be performed:\n",
                swapMultiQuantumOperator.getName()));

        this.printOutcomesProbabilities();
        otherQubit.printOutcomesProbabilities();

        Qubit[] qubitsSwapped = Swap.performSwap(this, otherQubit);

        System.out.println(String.format("The order of the Qubits, after the Quantum Operator (%s) be performed:\n",
                swapMultiQuantumOperator.getName()));

        qubitsSwapped[0].printOutcomesProbabilities();
        qubitsSwapped[1].printOutcomesProbabilities();

        return qubitsSwapped;

    }

    public void swapQubitObject(Qubit otherQubit) {

        this.id = otherQubit.id;
        this.blochSphere = otherQubit.blochSphere;

        this.allQuantumOperatorsList = otherQubit.allQuantumOperatorsList;
        this.pendingQuantumOperatorsList = otherQubit.pendingQuantumOperatorsList;

    }

    public void performPendingAppliedQuantumOperators() throws Exception {

        for(QuantumOperator quantumOperator : this.pendingQuantumOperatorsList) {

            if(quantumOperator instanceof SingleQuantumOperator) {

                System.out.println(String.format("It was applied a Quantum Operator (%s) to the Qubit #%d!!!\n",
                        quantumOperator.getName(), this.id));

                ((SingleQuantumOperator) quantumOperator).apply();

            }
            else {

                if(quantumOperator.getNumQubits() == 2) {

                    System.out.println(String.format("It was applied a Quantum Operator (%s) to the Qubits #%d and #%d!!!\n",
                            quantumOperator.getName(), quantumOperator.getQubits()[0].id,
                            quantumOperator.getQubits()[1].id));

                }

            }

            this.printOutcomesProbabilities();

        }

        this.pendingQuantumOperatorsList.clear();

    }

    public void measure() throws Exception {

        this.performPendingAppliedQuantumOperators();

        this.setMeasurementPerformed();

        float probabilitiesForOutcomeNo0 = (float) Math.pow(this.amplitudes[0].modulus(), 2.0);
        float probabilitiesForOutcomeNo1 = (float) Math.pow(this.amplitudes[1].modulus(), 2.0);

        if (probabilitiesForOutcomeNo0 == 1.0f) {

            this.finalOutcomeAfterMeasurement = 0;

        }
        else if (probabilitiesForOutcomeNo1 == 1.0f) {

            this.finalOutcomeAfterMeasurement = 1;

        }
        else {

            // TODO

        }

        System.out.println(String.format("It was Measured the Qubit #%d!!!\n", this.id));

        this.printOutcomesProbabilities();

        System.out.println(String.format("The final Outcome for the measured Qubit #%d is: %d\n\n",
                                        this.id, this.finalOutcomeAfterMeasurement));

    }

    public void printOutcomesProbabilities() {

        System.out.println(String.format("Qubit #%d => Probability(|0⟩) = %.3f | Probability(|1⟩) = %.3f\n\n", this.id,
                                         Math.pow(this.amplitudes[0].modulus(), 2.0), Math.pow(this.amplitudes[1].modulus(), 2.0)));

    }

}
