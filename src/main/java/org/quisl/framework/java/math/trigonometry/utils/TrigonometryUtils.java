package org.quisl.framework.java.math.trigonometry.utils;

public abstract class TrigonometryUtils {

    public TrigonometryUtils() {

    }

    public static double degreesToRadians(double thetaAngleDegrees) {

        return Math.toRadians(thetaAngleDegrees);

    }

    public static double radiansToDegrees(double thetaAngleRadians) {

        return Math.toDegrees(thetaAngleRadians);

    }

}
