package org.quisl.framework.java.registers.classical;

import org.quisl.framework.java.registers.Register;
import org.quisl.framework.java.registers.common.RegisterUnitPrefixes;
import org.quisl.framework.java.units.computing.classical.binary.deterministic.bits.Bit;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class ClassicalRegister extends Register {

    private Map<Long, Bit> bits;


    public ClassicalRegister(Long id, Integer numBits) {

        super( id, RegisterUnitPrefixes.CLASSICAL_REGISTER_UNIT.getRegisterUnitCharacter(),
             ( "cl-reg-" + id ), numBits );

        this.bits = new ConcurrentHashMap<>(numBits);

        this.addBits(numBits);

    }

    public ClassicalRegister(Long id, String classicalRegisterName, Integer numBits) {

        super( id, RegisterUnitPrefixes.CLASSICAL_REGISTER_UNIT.getRegisterUnitCharacter(),
               classicalRegisterName, numBits );

        this.bits = new ConcurrentHashMap<>(numBits);

        this.addBits(numBits);

    }

    public void addBits(Integer numBits) {

        for(Long currentBit = 0L; currentBit < numBits; currentBit++) {

            Bit bit = new Bit(currentBit);

            this.bits.put(bit.getId(), bit);

        }

    }

    public Map<Long, Bit> getBits() {

        return this.bits;

    }

    public void setBits(Map<Long, Bit> bits) {

        this.bits = bits;

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

        return Objects.equals(this.bits, that.bits);

    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), this.bits);

    }

}
