package org.quisl.framework.java.registers.common;

public enum RegisterUnitPrefixes {

    CLASSICAL_REGISTER_UNIT('C'),
    QUANTUM_REGISTER_UNIT('Q');

    private final Character registerUnitCharacter;

    RegisterUnitPrefixes(Character registerUnitCharacter) {

        this.registerUnitCharacter = registerUnitCharacter;

    }

    public Character getRegisterUnitCharacter() {

        return this.registerUnitCharacter;

    }

}
