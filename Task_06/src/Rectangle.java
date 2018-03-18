public class Rectangle extends Polygon {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void display() {
        System.out.printf("I'm Rectangle. Координати першої точки (%.3f; %.3f), другої точки (%.3f; %.3f), третьої точки (%.3f; %.3f) та четвертої точки (%.3f; %.3f)\n", a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY(), d.getX(), d.getY());
    }
}