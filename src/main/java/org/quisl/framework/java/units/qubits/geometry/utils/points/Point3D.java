package org.quisl.framework.java.units.qubits.geometry.utils.points;

import java.util.Objects;

public class Point3D {

    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double getX() {

        return this.x;

    }

    public void setX(double x) {

        this.x = x;

    }

    public double getY() {

        return this.y;

    }

    public void setY(double y) {

        this.y = y;

    }

    public double getZ() {

        return this.z;

    }

    public void setZ(double z) {

        this.z = z;

    }

    @Override
    public String toString() {

        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';

    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {

            return true;

        }

        if (object == null || getClass() != object.getClass()) {

            return false;

        }

        Point3D point3D = (Point3D) object;

        return Double.compare(point3D.x, x) == 0 &&
                Double.compare(point3D.y, y) == 0 &&
                Double.compare(point3D.z, z) == 0;

    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, z);

    }

}
