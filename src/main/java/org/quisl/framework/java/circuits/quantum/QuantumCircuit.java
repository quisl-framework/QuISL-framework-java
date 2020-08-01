package org.quisl.framework.java.circuits.quantum;

import org.quisl.framework.java.registers.classical.ClassicalRegister;
import org.quisl.framework.java.registers.quantum.QuantumRegister;
import org.quisl.framework.java.units.qubits.Qubit;

import java.util.ArrayList;
import java.util.List;

public class QuantumCircuit {

    private List<QuantumRegister> quantumRegisterList;
    private List<ClassicalRegister> classicalRegisterList;

    public QuantumCircuit() {

        this.quantumRegisterList = new ArrayList<>();
        this.classicalRegisterList = new ArrayList<>();

    }


    public void id(int numQuantumRegister) throws Exception {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyIdentity();

        }

    }

    public void x(int numQuantumRegister) throws Exception {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyPauliX();

        }

    }

    public void y(int numQuantumRegister) throws Exception {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyPauliY();

        }

    }

    public void z(int numQuantumRegister) throws Exception {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyPauliZ();

        }

    }

    public void h(int numQuantumRegister) throws Exception {

        List<Qubit> quantumRegisterQubits = this.quantumRegisterList.get(numQuantumRegister).getQubits();

        for (Qubit qubit : quantumRegisterQubits) {

            qubit.applyHadamard();

        }

    }

}
