

public class Circle extends Polygon {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        super();
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    void display() {
        System.out.printf("I'm Circle з центром у (%.3f; %.3f) та радіусом %.3f\n", center.x, center.y, radius);
    }
}