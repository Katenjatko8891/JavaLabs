package javalabs.javatask06.figures;

import static java.lang.Math.*;

public class Circle implements Figure {
    private Point centerPoint;
    private double radius;

    public Circle() {
        this(new Point(), 1.0);
    }

    public Circle(double radius) {
        this(new Point(), radius);
    }

    public Circle(Point centerPoint, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius is: " + radius + " and it can not be <= 0!");
        }
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = PI * pow(radius, 2);
        return area;
    }

    @Override
    public String name() {
        return "Circle";
    }
}
