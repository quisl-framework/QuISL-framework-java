package org.quisl.framework.java.physics.classical.kinetics;

import org.quisl.framework.java.math.trigonometry.utils.radians.RadiansTrigonometryUtils;
import org.quisl.framework.java.physics.classical.ClassicalPhysicsUtils;

public class KineticsClassicalPhysicsUtils extends ClassicalPhysicsUtils {

    public static final double GRAVITATIONAL_CONSTANT_G = ( 6.67408 * Math.pow( 10.0 , -11.0 ) );


    public KineticsClassicalPhysicsUtils() {

    }


    public static double computeKineticsForceF(double objectMassM, double accelerationA) {

        return ( objectMassM * accelerationA );

    }

    public static double computeGravityForceF(double objectMassM, double gravityAccelerationG) {

        return ( objectMassM * gravityAccelerationG );

    }

    public static double computeMomentumM(double objectMassM, double velocityV) {

        return ( objectMassM * velocityV );

    }

    public static double computeVelocityV(double positionDisplacementS, double timeT) {

        return ( positionDisplacementS / timeT );

    }

    public static double computeAccelerationA1(double velocityDeltaV, double timeT) {

        return ( velocityDeltaV / timeT );

    }

    public static double computeAccelerationA2(double initialVelocityV0, double finalVelocityV, double timeT) {

        return ( ( finalVelocityV - initialVelocityV0 ) / timeT );

    }

    /**
     * Returns the <u><i><b>Position Displacement (x)</b></i></u>, given the <u><i><b>Initial Position (x0)</b></i></u>
     * and <u><i><b>Initial Velocity (v0)</b></i></u>, as also, the <u><i><b>Acceleration (a)</b></i></u>
     * of an <u><i>Object</i></u>, and some given <u><i><b>Unit of Time (t)</b></i></u>.
     *
     * @param initialPositionX0 the <u><i><b>Initial Position (x0)</b></i></u> from the <u><i>Object</i></u>
     *
     * @param initialVelocityV0 the <u><i><b>Initial Velocity (v0)</b></i></u> from the <u><i>Object</i></u>
     *
     * @param accelerationA the <u><i><b>Acceleration (a)</b></i></u> from the <u><i>Object</i></u>.
     *
     * @param timeT some <u><i><b>Unit of Time (t)</b></i></u>, given in <u><i>Seconds</i></u>, by default.
     *
     * NOTE:
     * - This <u><i>Equation</i></u> requires constant <u><i><b>Acceleration</b></i></u>
     *   from the <u><i>Object</i></u>, <u><i>to hold <b>True</b></i></u>.
     *
     * @return the <u><i><b>Position Displacement (x)</b></i></u>, given the <u><i><b>Initial Position (x0)</b></i></u>
     *         and <u><i><b>Initial Velocity (v0)</b></i></u>, as also,
     *         the <u><i><b>Acceleration (a)</b></i></u> of an <u><i>Object</i></u>,
     *         and some given <u><i><b>Unit of Time (t)</b></i></u>.
     */
    public static double computePositionDisplacementX(double initialPositionX0, double initialVelocityV0,
                                                     double accelerationA, double timeT) {

        return ( initialPositionX0 + ( initialVelocityV0 * timeT) +
                ( ( 1.0 / 2.0 ) * accelerationA * Math.pow( timeT , 2.0 ) ) );

    }

    /**
     * Returns the <u><i><b>Velocity (v)</b></i></u>, given the <u><i><b>Initial Velocity (v0)</b></i></u>,
     * as also, the <u><i><b>Acceleration (a)</b></i></u> of an <u><i>Object</i></u>,
     * and some given <u><i><b>Unit of Time (t)</b></i></u>.
     *
     * @param initialVelocityV0 the <u><i><b>Initial Velocity (v0)</b></i></u> from the <u><i>Object</i></u>
     *
     * @param accelerationA the <u><i><b>Acceleration (a)</b></i></u> from the <u><i>Object</i></u>.
     *
     * @param timeT some <u><i><b>Unit of Time (t)</b></i></u>, given in <u><i>Seconds</i></u>, by default.
     *
     * NOTE:
     * - This <u><i>Equation</i></u> requires constant <u><i><b>Acceleration</b></i></u>
     *   from the <u><i>Object</i></u>, <u><i>to hold <b>True</b></i></u>.
     *
     * @return the <u><i><b>Velocity (v)</b></i></u>, given the <u><i><b>Initial Velocity (v0)</b></i></u>, as also,
     *         the <u><i><b>Acceleration (a)</b></i></u> of an <u><i>Object</i></u>,
     *         and some given <u><i><b>Unit of Time (t)</b></i></u>.
     */
    public static double computeVelocityV1(double initialVelocityV0, double accelerationA, double timeT) {

        return ( initialVelocityV0 + ( accelerationA * timeT ) );

    }

    public static double computeVelocityVSquared(double initialVelocityV0, double accelerationA,
                                                 double positionDisplacementX) {

        return ( ( Math.pow( initialVelocityV0 , 2.0 ) ) + ( 2 * accelerationA * positionDisplacementX ) );

    }

    public static double computeVelocityV2(double initialVelocityV0, double accelerationA,
                                           double positionDisplacementX) {

        return ( Math.sqrt( ( Math.pow( initialVelocityV0 , 2.0 ) ) +
                            ( 2 * accelerationA * positionDisplacementX ) ) );

    }

    public static double computeAverageVelocityVAVG1(double initialVelocityV0, double currentVelocityV) {

        return ( ( initialVelocityV0 + currentVelocityV ) / 2.0 );

    }

    public static double computeAverageVelocityVAVG2(double totalDistance, double totalTime) {

        return ( totalDistance / totalTime );

    }

    public static double computeVelocityVFromGravityForce(double gravitationalAccelerationG, double heightFallenH) {

        return ( Math.sqrt( ( 2.0 * gravitationalAccelerationG * heightFallenH ) ) );

    }

    public static double computeCentripetalAccelerationAC(double constantVelocityV, double radiusCircleTrajectory) {

        return ( Math.pow( constantVelocityV , 2.0 ) / radiusCircleTrajectory );

    }

    public static double computeCentripetalForceFC(double massObjectM, double constantVelocityV, double radiusCircleTrajectory) {

        return ( massObjectM * Math.pow( constantVelocityV , 2.0 ) / radiusCircleTrajectory );

    }

    public static double computeForceFromGravityOnTwoObjectsF(double objectMass1, double objectMass2,
                                                              double radiusDistanceBetweenObjectsR) {

        return ( ( GRAVITATIONAL_CONSTANT_G * objectMass1 * objectMass2 ) /
                  Math.pow( radiusDistanceBetweenObjectsR , 2.0) );

    }

    public static double computeForceFromHookeLawF(double springConstantFromObjectK, double positionDisplacementX) {

        return ( -springConstantFromObjectK * positionDisplacementX);

    }

    public static double computeForceFromGravityWithInclinedPlane(double objectMassM,
                                                                  double gravitationalAccelerationG,
                                                                  double thetaAngleRadians) {

        return ( objectMassM * gravitationalAccelerationG * Math.sin(thetaAngleRadians) );

    }

    public static double convertPeriodTToTemporalFrequencyF(double periodT) {

        return ( 1.0 / periodT );

    }

    public static double convertTemporalFrequencyFToPeriodT(double temporalFrequencyF) {

        return ( 1.0 / temporalFrequencyF );

    }

    public static double computeAngularFrequencyF(double temporalFrequencyF) {

        return ( RadiansTrigonometryUtils.ANGLE_2_PI_RADIANS * temporalFrequencyF );

    }

    public static double computeDensityRho(double objectMassM, double objectVolumeV) {

        return ( objectMassM / objectVolumeV );

    }

    public static double computePressureP(double forceActingOnTheSurfaceF, double areaOfTheSurfaceA) {

        return ( forceActingOnTheSurfaceF / areaOfTheSurfaceA );

    }

    public static double computeLiquidPressureP(double depthH, double densityRho, double gravitationalFieldStrengthG) {

        return ( depthH * densityRho * gravitationalFieldStrengthG );

    }

    public static double computePressureInLiquid(double atmosphericPressurePATM, double depthH, double densityRho,
                                                 double gravitationalFieldStrengthG) {

        return ( atmosphericPressurePATM + ( depthH * densityRho * gravitationalFieldStrengthG ) );

    }

}
