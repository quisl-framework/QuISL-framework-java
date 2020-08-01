package org.quisl.framework.java.math.geometry.utils.points;

import java.util.Objects;

public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {

        this.x = x;
        this.y = y;

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

    @Override
    public String toString() {

        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
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

        Point2D point2D = (Point2D) object;

        return Double.compare(point2D.x, x) == 0 &&
                Double.compare(point2D.y, y) == 0;

    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);

    }

}
