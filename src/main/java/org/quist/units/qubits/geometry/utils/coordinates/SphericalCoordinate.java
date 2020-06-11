package org.quist.units.qubits.geometry.utils.coordinates;

import java.util.Objects;

public class SphericalCoordinate extends Coordinate3D {

    private double radius;
    private double theta;
    private double phi;

    public SphericalCoordinate(double radius, double theta, double phi) {

        super(radius, theta, phi);

        this.radius = radius;
        this.theta = theta;
        this.phi = phi;

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getTheta() {
        return this.theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public double getPhi() {
        return this.phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    @Override
    public String toString() {
        return "SphericalCoordinate{" +
                "radius=" + this.radius +
                ", theta=" + this.theta +
                ", phi=" + this.phi +
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

        SphericalCoordinate that = (SphericalCoordinate) o;

        return Double.compare(that.radius, this.radius) == 0 &&
                Double.compare(that.theta, this.theta) == 0 &&
                Double.compare(that.phi, this.phi) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), this.radius, this.theta, this.phi);

    }

}
