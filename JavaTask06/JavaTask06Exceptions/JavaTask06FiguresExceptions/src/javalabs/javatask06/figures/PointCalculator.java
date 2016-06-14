package javalabs.javatask06.figures;

import static java.lang.Math.*;

public class PointCalculator {
    public double distanceBetweenTwoPoints(Point firstPoint, Point secondPoint) {
        double distance = sqrt(pow(secondPoint.getCoordinateX() - firstPoint.getCoordinateX(), 2)
                + pow(secondPoint.getCoordinateY() - firstPoint.getCoordinateY(), 2));
        return distance;
    }
}
