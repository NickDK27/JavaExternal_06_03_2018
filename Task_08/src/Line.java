public class Line extends Polygon {

    private Point a;
    private Point b;
    private Point c;

    public Line(Point a, Point b) {
        super();
        this.a = a;
        this.b = b;
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

    void display() {
        System.out.printf("I'm Line. Координати першої точки (%.3f; %.3f), другої точки (%.3f; %.3f)\n", a.getX(), a.getY(), b.getX(), b.getY());
    }

}
