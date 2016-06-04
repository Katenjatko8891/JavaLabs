package javalabs.javatask04.figures;

import static java.lang.Math.*;

public class Rectangle implements Figure {
    private Point bottomLeftPoint;
    private Point topRightPoint;

    public Rectangle() {
        this(new Point(), new Point(1.0, 1.0));
    }

    public Rectangle(Point bottomLeftPoint, Point topRightPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
        this.topRightPoint = topRightPoint;
    }

    public Point getTopRightPoint() {
        return topRightPoint;
    }

    public void setTopRightPoint(Point topRightPoint) {
        this.topRightPoint = topRightPoint;
    }

    public Point getBottomLeftPoint() {
        return bottomLeftPoint;
    }

    public void setBottomLeftPoint(Point bottomLeftPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
    }

    @Override
    public double area() {
        double area = abs((topRightPoint.getCoordinateX() - bottomLeftPoint.getCoordinateX())
                * (topRightPoint.getCoordinateY() - bottomLeftPoint.getCoordinateY()));
        return area;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

}
