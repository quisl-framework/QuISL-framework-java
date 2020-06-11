package org.quist.units.qubits;

import org.quist.units.qubits.math.ComplexNumber;
import org.quist.units.qubits.operators.*;
import org.quist.units.qubits.geometry.sphere.BlochSphere;
import org.quist.units.qubits.operators.single.*;

import java.util.ArrayList;
import java.util.List;

public class Qubit {

    private static final Integer GROUND_STATE = 0;
    private static final Integer EXCITED_STATE = 1;

    private Long id;

    private BlochSphere blochSphere;

    private List<QuantumOperator> quantumOperatorsList;

    private ComplexNumber[] amplitudes;

    private boolean measurementPerformed;

    private int finalOutcomeAfterMeasurement;


    public Qubit(Long id) {

        this.id = id;
        this.blochSphere = new BlochSphere();

        this.setup();

        this.quantumOperatorsList = new ArrayList<>();

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
        this.amplitudes[0] = new ComplexNumber(1.0f, 0.0f);
        this.amplitudes[1] = new ComplexNumber(0.0f, 0.0f);
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

    public List<QuantumOperator> getQuantumOperatorsList() {
        return quantumOperatorsList;
    }

    public void setQuantumOperatorsList(List<QuantumOperator> quantumOperatorsList) {
        this.quantumOperatorsList = quantumOperatorsList;
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

    public void applyIdentity() {

        QuantumOperator quantumOperator = new Identity(this);
        this.quantumOperatorsList.add(quantumOperator);

    }

    public void applyPauliX() {

        QuantumOperator quantumOperator = new PauliX(this);
        this.quantumOperatorsList.add(quantumOperator);

    }

    public void applyPauliY() {

        QuantumOperator quantumOperator = new PauliY(this);
        this.quantumOperatorsList.add(quantumOperator);

    }

    public void applyPauliZ() {

        QuantumOperator quantumOperator = new PauliZ(this);
        this.quantumOperatorsList.add(quantumOperator);

    }

    public void applyHadamard() {

        QuantumOperator quantumOperator = new Hadamard(this);
        this.quantumOperatorsList.add(quantumOperator);

    }

    public void measure() {

        for(QuantumOperator quantumOperator : quantumOperatorsList) {

            System.out.println(String.format("It was applied a Quantum Operator (%s) to the Qubit #%d!!!\n",
                                             quantumOperator.getName(), this.id));

            quantumOperator.apply();
            this.printOutcomesProbabilities();

        }


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
