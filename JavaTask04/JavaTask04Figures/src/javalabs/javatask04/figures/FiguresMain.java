package javalabs.javatask04.figures;

public class FiguresMain {
    public static void main(String[] args) {
        Figure figuresArray[] = new Figure[5];
        for (int i = 0; i < 5; i++) {
            int figureType = (int)(Math.random() * 3);
            switch (figureType) {
                case 0: {
                    figuresArray[i] = new Triangle();
                    break;
                }
                case 1: {
                    figuresArray[i] = new Rectangle();
                    break;
                }
                case 2: {
                    figuresArray[i] = new Circle();
                }
                default: {
                    break;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.format("%s: %.2f%n",figuresArray[i].name(), figuresArray[i].area());
        }

        Point newBottomPointForRec = new Point(0.0, 7.0);
        Point newTopPointForRec = new Point(6.0, 0.0);
        Rectangle testRec = new Rectangle(newBottomPointForRec, newTopPointForRec);
        figuresArray[0] = testRec;
        Point newBottomLeftPointForTr = new Point(-1.0, 0.0);
        Point newBottomRightPointForTr = new Point(7.0, 0.0);
        Point newTopPointForTr = new Point(0.0, 3.0);
        Triangle testTr = new Triangle(newBottomLeftPointForTr, newBottomRightPointForTr, newTopPointForTr);
        figuresArray[1] = testTr;
        Circle testCr = new Circle(10);
        figuresArray[2] = testCr;
        for (int i = 0; i < 5; i++) {
            System.out.format("%s: %.2f%n",figuresArray[i].name(), figuresArray[i].area());
        }

        PointCalculator test = new PointCalculator();
        System.out.format("Distance: %.2f%n", test.distanceBetweenTwoPoints(newBottomPointForRec, newTopPointForRec));
    }
}
