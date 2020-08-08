package org.quisl.framework.java.registers.quantum;

import org.quisl.framework.java.registers.Register;
import org.quisl.framework.java.registers.common.RegisterUnitPrefixes;
import org.quisl.framework.java.units.computing.quantum.binary.qubits.Qubit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QuantumRegister extends Register {

    private List<Qubit> qubits;


    public QuantumRegister(Long id, Integer numQubits) {

        super( id, RegisterUnitPrefixes.QUANTUM_REGISTER_UNIT.getRegisterUnitCharacter(),
             ( "qu-reg-" + id ), numQubits );

        this.qubits = new ArrayList<>(numQubits);

        this.addQubits(numQubits);

    }

    public QuantumRegister(Long id, String quantumRegisterName, Integer numQubits) {

        super( id, RegisterUnitPrefixes.QUANTUM_REGISTER_UNIT.getRegisterUnitCharacter(),
               quantumRegisterName, numQubits );

        this.qubits = new ArrayList<>(numQubits);

        this.addQubits(numQubits);

    }

    private void addQubits(Integer numQubits) {

        for(Long currentQubit = 0L; currentQubit < numQubits; currentQubit++) {

            Qubit qubit = new Qubit(currentQubit);

            this.qubits.add(qubit);

        }

    }

    public List<Qubit> getQubits() {

        return this.qubits;

    }

    public void setQubits(List<Qubit> qubits) {

        this.qubits = qubits;

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

        QuantumRegister that = (QuantumRegister) o;

        return Objects.equals(this.qubits, that.qubits);

    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), this.qubits);

    }

}
