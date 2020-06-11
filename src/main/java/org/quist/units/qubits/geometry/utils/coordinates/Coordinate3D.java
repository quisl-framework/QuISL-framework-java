package org.quist.units.qubits.geometry.utils.coordinates;

import java.util.Objects;

public abstract class Coordinate3D {

    private Object coordinateNo1;
    private Object coordinateNo2;
    private Object coordinateNo3;

    public Coordinate3D(Object coordinateNo1, Object coordinateNo2, Object coordinateNo3) {

        this.coordinateNo1 = coordinateNo1;
        this.coordinateNo2 = coordinateNo2;
        this.coordinateNo3 = coordinateNo3;

    }

    public Object getCoordinateNo1() {
        return this.coordinateNo1;
    }

    public void setCoordinateNo1(Object coordinateNo1) {
        this.coordinateNo1 = coordinateNo1;
    }

    public Object getCoordinateNo2() {
        return this.coordinateNo2;
    }

    public void setCoordinateNo2(Object coordinateNo2) {
        this.coordinateNo2 = coordinateNo2;
    }

    public Object getCoordinateNo3() {
        return this.coordinateNo3;
    }

    public void setCoordinateNo3(Object coordinateNo3) {
        this.coordinateNo3 = coordinateNo3;
    }

    @Override
    public String toString() {
        return "Coordinate3D{" +
                "coordinateNo1=" + this.coordinateNo1 +
                ", coordinateNo2=" + this.coordinateNo2 +
                ", coordinateNo3=" + this.coordinateNo3 +
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

        Coordinate3D that = (Coordinate3D) o;

        return Objects.equals(this.coordinateNo1, that.coordinateNo1) &&
                Objects.equals(this.coordinateNo2, that.coordinateNo2) &&
                Objects.equals(this.coordinateNo3, that.coordinateNo3);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.coordinateNo1, this.coordinateNo2, this.coordinateNo3);
    }
}
