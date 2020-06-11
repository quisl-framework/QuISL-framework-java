package org.quist.circuits;

import org.quist.registers.classical.ClassicalRegister;
import org.quist.registers.quantum.QuantumRegister;
import org.quist.units.qubits.Qubit;

import java.util.ArrayList;
import java.util.List;

public class QuantumCircuit {

    private List<QuantumRegister> quantumRegisterList;
    private List<ClassicalRegister> classicalRegisterList;

    public QuantumCircuit() {

        this.quantumRegisterList = new ArrayList<>();
        this.classicalRegisterList = new ArrayList<>();

    }


    public void id(int numQuantumRegister) {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyIdentity();

        }

    }

    public void x(int numQuantumRegister) {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyPauliX();

        }

    }

    public void y(int numQuantumRegister) {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyPauliY();

        }

    }

    public void z(int numQuantumRegister) {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyPauliZ();

        }

    }

    public void h(int numQuantumRegister) {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyHadamard();

        }

    }

}
