package org.quisl.framework.java.units.qubits.geometry.utils.coordinates;

import java.util.Objects;

public class CartesianCoordinate extends Coordinate3D {

    private double x;
    private double y;
    private double z;

    public CartesianCoordinate(double x, double y, double z) {
        super(x, y, z);

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
        return "CartesianCoordinate{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
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

        CartesianCoordinate that = (CartesianCoordinate) o;

        return Double.compare(that.x, this.x) == 0 &&
                Double.compare(that.y, this.y) == 0 &&
                Double.compare(that.z, this.z) == 0;

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.x, this.y, this.z);
    }
}
