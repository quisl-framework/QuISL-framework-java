package org.quist.qubits.geometry.sphere;

import java.util.Objects;

public abstract class Sphere {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
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

        Sphere sphere = (Sphere) o;

        return Double.compare(sphere.radius, radius) == 0;

    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);

    }

}
