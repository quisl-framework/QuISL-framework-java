package org.quisl.framework.java.math.linearalgebra.common.notations.braket.ket;

import org.quisl.framework.java.math.linearalgebra.common.notations.braket.BraKetNotation;
import org.quisl.framework.java.math.linearalgebra.matrix.vectors.states.StateVector;
import org.quisl.framework.java.math.linearalgebra.matrix.vectors.states.amplitudes.Amplitude;
import org.quisl.framework.java.math.utils.alphabets.GreekAlphabetLetter;

public class KetNotation extends BraKetNotation {

    public KetNotation() {

    }

    public static StateVector buildKetZeroState() {

        return new StateVector
                (
                    ( (byte) 0x00 ),
                    "Ket (Zero)", "|0⟩",
                    "State Vector for Data from |0⟩'s State",
                    new Amplitude[]
                            {
                                    new Amplitude
                                            (
                                                    new GreekAlphabetLetter[] { GreekAlphabetLetter.ALPHA_LOWERCASE },
                                                    1.0f
                                            ),
                                    new Amplitude
                                            (
                                                    new GreekAlphabetLetter[] { GreekAlphabetLetter.BETA_LOWERCASE },
                                                    0.0f
                                            )
                            }
                );

    }

    public static StateVector buildKetOneState() {

        return new StateVector
                (
                    ( (byte) 0x01 ),
                    "Ket (One)", "|1⟩",
                    "State Vector for Data from |1⟩'s State",
                    new Amplitude[]
                            {
                                    new Amplitude
                                            (
                                                    new GreekAlphabetLetter[] { GreekAlphabetLetter.ALPHA_LOWERCASE },
                                                    0.0f
                                            ),
                                    new Amplitude
                                            (
                                                    new GreekAlphabetLetter[] { GreekAlphabetLetter.BETA_LOWERCASE },
                                                    1.0f
                                            )
                            }
                );

    }

    public static StateVector buildKetSuperpositionState(float ketZeroAmplitudeValue, float ketOneAmplitudeValue) {

        StateVector stateVectorKetSuperpositionState =
                        new StateVector
                                (
                                        ( (byte) 0x02 ),
                                        "Ket (Psi)", "|Ψ⟩",
                                        "State Vector for Data from |Ψ⟩'s State",
                                        new Amplitude[]
                                                {
                                                        new Amplitude
                                                                (
                                                                        new GreekAlphabetLetter[]
                                                                            {
                                                                                GreekAlphabetLetter.ALPHA_LOWERCASE
                                                                            },
                                                                        ketZeroAmplitudeValue
                                                                ),
                                                        new Amplitude
                                                                (
                                                                        new GreekAlphabetLetter[]
                                                                            {
                                                                                GreekAlphabetLetter.BETA_LOWERCASE
                                                                            },
                                                                        ketOneAmplitudeValue
                                                                )
                                                }
                                );

        float sumFromStateVectorAmplitudeValues = 0.0f;

        for(Amplitude stateVectorKetSuperpositionStateAmplitude :
                stateVectorKetSuperpositionState.getStateVectorAmplitudes()) {

            sumFromStateVectorAmplitudeValues +=
                    stateVectorKetSuperpositionStateAmplitude.getModulusSquaredOfAmplitude();

        }

        return ( sumFromStateVectorAmplitudeValues == 1.0f ) ? stateVectorKetSuperpositionState : null;

    }

}
