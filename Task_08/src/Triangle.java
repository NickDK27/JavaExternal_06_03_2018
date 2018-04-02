public class Triangle extends Polygon {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    void display() {
        System.out.printf("I'm Triangle. Координати першої точки (%.3f; %.3f), другої точки (%.3f; %.3f) та третьої точки (%.3f; %.3f)\n", a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());
    }
}