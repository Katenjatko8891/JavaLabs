package javalabs.javatask06.figures;

import static java.lang.Math.*;

public class Triangle implements Figure {
    private Point bottomLeftPoint;
    private Point bottomRightPoint;
    private Point topPoint;

    public Triangle() {
        this(new Point(), new Point(0.0, 1.0), new Point(1.0, 0.0));
    }

    public Triangle(Point bottomLeftPoint, Point bottomRightPoint, Point topPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
        this.topPoint = topPoint;
    }

    public Point getBottomLeftPoint() {
        return bottomLeftPoint;
    }

    public void setBottomLeftPoint(Point bottomLeftPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopPoint() {
        return topPoint;
    }

    public void setTopPoint(Point topPoint) {
        this.topPoint = topPoint;
    }

   @Override
   public double area() {
        double area = 0.5 * abs((bottomLeftPoint.getCoordinateX() - bottomRightPoint.getCoordinateX())
                * (topPoint.getCoordinateY() - bottomRightPoint.getCoordinateY())
                - (topPoint.getCoordinateX() - bottomRightPoint.getCoordinateX())
                * (bottomLeftPoint.getCoordinateY() - bottomRightPoint.getCoordinateY()));
        return area;
    }

    @Override
    public String name() {
        return "Triangle";
    }

}
