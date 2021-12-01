package exercise8;

public class Point {
    double x;
    double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.y;
        this.y = otherPoint.y;
    }

    public void initialize() {

        x = Utils.INPUT.nextDouble();
        y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        x = x + xDelta;
        y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        double newX = x + xDelta;
        double newY = y + yDelta;
        return new Point(newX, newY);
    }

    public boolean equals(Point otherPoint) {
        boolean xEquals = Utils.equals(x, otherPoint.x);
        boolean yEquals = Utils.equals(y, otherPoint.y);
        return xEquals && yEquals;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y +")";
    }
}