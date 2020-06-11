package org.quist.qubits.geometry.sphere;

import org.quist.qubits.geometry.utils.coordinates.CartesianCoordinate;
import org.quist.qubits.geometry.utils.coordinates.SphericalCoordinate;

public class BlochSphere extends Sphere {

    private static final float BLOCH_SPHERE_RADIUS = 1.0f;

    private CartesianCoordinate cartesianCoordinate;

    private SphericalCoordinate sphericalCoordinate;

    public BlochSphere() {

        super(BLOCH_SPHERE_RADIUS);

        this.cartesianCoordinate = new CartesianCoordinate(0.0, 0.0, 1.0);

        this.sphericalCoordinate = new SphericalCoordinate(BLOCH_SPHERE_RADIUS, 0.0 ,0.0);

    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public CartesianCoordinate getCartesianCoordinate() {
        return this.cartesianCoordinate;
    }

    public void setCartesianCoordinate(CartesianCoordinate cartesianCoordinate) {
        this.cartesianCoordinate = cartesianCoordinate;
    }

    public SphericalCoordinate getSphericalCoordinate() {
        return this.sphericalCoordinate;
    }

    public void setSphericalCoordinate(SphericalCoordinate sphericalCoordinate) {
        this.sphericalCoordinate = sphericalCoordinate;
    }



}
