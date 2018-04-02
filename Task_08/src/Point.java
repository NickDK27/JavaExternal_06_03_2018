import java.io.Serializable;

public class Point extends Polygon implements Serializable {

    double x;
    double y;

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    void display() {
        System.out.printf("I'm Point. Мої координати (%.3f; %.3f)\n", this.getX(), this.getY());
    }
}