package org.quisl.framework.java.circuits.classical;

import org.quisl.framework.java.circuits.Circuit;
import org.quisl.framework.java.circuits.utils.classical.ClassicalMoment;
import org.quisl.framework.java.common.ComputingPrefixes;
import org.quisl.framework.java.registers.classical.ClassicalRegister;
import org.quisl.framework.java.units.computing.classical.binary.deterministic.bits.Bit;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClassicalCircuit extends Circuit {

    private Map<Long, ClassicalRegister> classicalRegisters;

    private Map<Long, ClassicalMoment> classicalMoments;

    public ClassicalCircuit(Long id, ClassicalRegister ... classicalRegisters) {

        super( id, ComputingPrefixes.CLASSICAL_PREFIX.getComputingPrefix(),
             ( "cl-circ-" + id ), classicalRegisters );

        this.classicalRegisters = new ConcurrentHashMap<>();

        for(ClassicalRegister classicalRegister : classicalRegisters) {

            Long classicalRegisterId = classicalRegister.getId();

            if( !this.classicalRegisters.containsKey(classicalRegisterId) ) {

                this.classicalRegisters.put(classicalRegisterId, classicalRegister);

            }

        }

        this.classicalMoments = new ConcurrentHashMap<>();

    }

    public ClassicalCircuit(Long id, String classicalCircuitName, ClassicalRegister ... classicalRegisters) {

        super( id, ComputingPrefixes.CLASSICAL_PREFIX.getComputingPrefix(), classicalCircuitName, classicalRegisters );

        this.classicalRegisters = new ConcurrentHashMap<>();

        for(ClassicalRegister classicalRegister : classicalRegisters) {

            Long classicalRegisterId = classicalRegister.getId();

            if( !this.classicalRegisters.containsKey(classicalRegisterId) ) {

                this.classicalRegisters.put(classicalRegisterId, classicalRegister);

            }

        }

        this.classicalMoments = new ConcurrentHashMap<>();

    }


    public void NOT(Long bitId) {

        boolean isBitFound = false;

        Bit bitFound = null;


        for(ClassicalRegister classicalRegister : this.classicalRegisters.values()) {

            Map<Long, Bit> classicalRegisterBits = classicalRegister.getBits();

            if (classicalRegisterBits.containsKey(bitId)) {

                isBitFound = true;

                bitFound = classicalRegisterBits.get(bitId);

                break;

            }

        }


        if( isBitFound ) {

            NOT(bitId);

        }
        else {



        }

    }

}
