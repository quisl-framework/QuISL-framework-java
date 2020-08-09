package org.quisl.framework.java.circuits.classical;

import org.quisl.framework.java.circuits.Circuit;
import org.quisl.framework.java.circuits.common.CircuitPrefixes;
import org.quisl.framework.java.circuits.utils.classical.ClassicalMoment;
import org.quisl.framework.java.registers.classical.ClassicalRegister;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClassicalCircuit extends Circuit {

    private Map<Long, ClassicalRegister> classicalRegisters;

    private Map<Long, ClassicalMoment> classicalMoments;

    public ClassicalCircuit(Long id, ClassicalRegister ... classicalRegisters) {

        super( id, CircuitPrefixes.CLASSICAL_CIRCUIT.getCircuitPrefix(),
             ( "cl-circ-" + id ), classicalRegisters);

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

        super( id, CircuitPrefixes.CLASSICAL_CIRCUIT.getCircuitPrefix(),
               classicalCircuitName, classicalRegisters);

        this.classicalRegisters = new ConcurrentHashMap<>();

        for(ClassicalRegister classicalRegister : classicalRegisters) {

            Long classicalRegisterId = classicalRegister.getId();

            if( !this.classicalRegisters.containsKey(classicalRegisterId) ) {

                this.classicalRegisters.put(classicalRegisterId, classicalRegister);

            }

        }

        this.classicalMoments = new ConcurrentHashMap<>();

    }


}
