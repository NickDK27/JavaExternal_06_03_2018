public class Main {

    public static void main(String[] args) {
        int n = 15;
        int TYPE_POLYGON = 3;
        Polygon[] mas = new Polygon[n];

        for (int i = 0; i < n; i++)
            mas[i] = GetPolygon((int) (Math.random() * TYPE_POLYGON));

        for (int i = 0; i < n; i++)
            mas[i].display();
    }

    public static Polygon GetPolygon(int i) {
        switch (i) {
            case 0:
                return new Circle(new Point(Math.random(), Math.random()), Math.random());
            case 1:
                return new Triangle(new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()));
            case 2:
                return new Rectangle(new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()));
                default:
                    return  null;
        }
    }
}