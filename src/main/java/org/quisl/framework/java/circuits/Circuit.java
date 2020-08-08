package org.quisl.framework.java.circuits;

import org.quisl.framework.java.registers.Register;
import org.quisl.framework.java.registers.classical.ClassicalRegister;
import org.quisl.framework.java.registers.quantum.QuantumRegister;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Circuit {

    private Long id;

    private String prefix;

    private String circuitName;

    private List<Register> registers;


    public Circuit(Long id, String prefix, String circuitName, Register ... registers) {

        this.id = id;

        this.prefix = prefix;

        this.circuitName = circuitName;

        this.registers = Arrays.asList(registers);

    }

    public Long getId() {

        return this.id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public String getPrefix() {

        return this.prefix;

    }

    public void setPrefix(String prefix) {

        this.prefix = prefix;

    }

    public String getCircuitName() {

        return this.circuitName;

    }

    public void setCircuitName(String circuitName) {

        this.circuitName = circuitName;

    }

    public List<Register> getRegisters() {

        return this.registers;

    }

    public void setRegisters(List<Register> registers) {

        this.registers = registers;

    }

    public Integer getNumOfRegisters() {

        return this.registers.size();

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {

            return true;

        }

        if (o == null || getClass() != o.getClass()) {

            return false;

        }


        Circuit circuit = (Circuit) o;

        return Objects.equals(this.id, circuit.id);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

}
