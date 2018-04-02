
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final int n = 15, n_points = 3, n_triangles = 1, n_lines = 3;
        int TYPE_POLYGON = 4;
        Polygon[] mas = new Polygon[n];
        Point[] points = new Point[n_points];
        Line[] lines = new Line[n_lines];
        Triangle[] triangles = new Triangle[n_triangles];

        Serial_Task_1(points, lines, triangles);
        Serial_Task_2(mas, TYPE_POLYGON, n);

        DeSerial_Task_1();
        DeSerial_Task_2(n);
    }



    public static Polygon GetPolygon(int i) {
        switch (i) {
            case 0:
                return new Circle(new Point(Math.random(), Math.random()), Math.random());
            case 1:
                return new Line(new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()));
            case 2:
                return new Triangle(new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()));
            case 3:
                return new Rectangle(new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()), new Point(Math.random(), Math.random()));
                default:
                    return  null;
        }
    }


    public static void Serial_Task_1(Point[] points, Line[] lines, Triangle[] triangles) throws IOException, ClassNotFoundException{

        System.out.printf("\nДо серіалізації (перше завдання)\n");
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(Math.random(), Math.random());
            points[i].display();
        }

        for (int i = 0; i < lines.length; i++){
            lines[i] = (Line)GetPolygon(1);
            lines[i].display();
        }

        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = (Triangle) GetPolygon(2);
            triangles[i].display();
        }

        ObjectOutputStream out_points = new ObjectOutputStream(new FileOutputStream("data/points.dat"));
        ObjectOutputStream out_lines = new ObjectOutputStream(new FileOutputStream("data/lines.dat"));
        ObjectOutputStream out_triangles = new ObjectOutputStream(new FileOutputStream("data/triangles.dat"));

        out_points.writeObject(points);
        out_lines.writeObject(lines);
        out_triangles.writeObject(triangles);

        out_points.close();
        out_lines.close();
        out_triangles.close();
    }


    public static void Serial_Task_2(Polygon[] mas, int TYPE_POLYGON, int n) throws IOException, ClassNotFoundException {

        ObjectOutputStream out_polygon_circles = new ObjectOutputStream(new FileOutputStream("data/polygon_circles.dat"));
        ObjectOutputStream out_polygon_triangles = new ObjectOutputStream(new FileOutputStream("data/polygon_triangles.dat"));
        ObjectOutputStream out_polygon_rectangles = new ObjectOutputStream(new FileOutputStream("data/polygon_rectangles.dat"));

        Date now = new Date(System.currentTimeMillis());
        out_polygon_circles.writeObject(now);
        for (int i = 0; i < n; i++) {
            mas[i] = GetPolygon((int) (Math.random() * TYPE_POLYGON));
            if (mas[i] instanceof Circle)
                out_polygon_circles.writeObject(mas[i]);
            else  if(mas[i] instanceof Triangle)
                out_polygon_triangles.writeObject(mas[i]);
            else if(mas[i] instanceof Rectangle)
                out_polygon_rectangles.writeObject(mas[i]);
        }
        out_polygon_circles.close();
        out_polygon_triangles.close();
        out_polygon_rectangles.close();

        System.out.printf("\nДруге завдання. До серіалізації\n");
        for (int i = 0; i < n; i++)
            mas[i].display();
    }

    public static void DeSerial_Task_1() throws IOException, ClassNotFoundException {
        System.out.printf("\nПісля серіалізації (перше завдання)\n");

        ObjectInputStream in_points =  new ObjectInputStream (new FileInputStream("data/points.dat"));
        ObjectInputStream in_lines =  new ObjectInputStream (new FileInputStream("data/lines.dat"));
        ObjectInputStream in_triangles =  new ObjectInputStream (new FileInputStream("data/triangles.dat"));

        Point[] points_after_s = (Point[]) in_points.readObject();
        Line[] lines_after_s = (Line[]) in_lines.readObject();
        Triangle[] triangles_after_s = (Triangle[]) in_triangles.readObject();

        for (int i = 0; i < points_after_s.length; i++)
            points_after_s[i].display();

        for (int i = 0; i < lines_after_s.length; i++)
            lines_after_s[i].display();

        for (int i = 0; i < triangles_after_s.length; i++)
            triangles_after_s[i].display();

        in_points.close();
        in_lines.close();
        in_triangles.close();
    }

    public static void DeSerial_Task_2(int n) throws IOException, ClassNotFoundException {

        FileInputStream f_in_polygon_circles = new FileInputStream("data/polygon_circles.dat");
        FileInputStream f_in_polygon_triangles = new FileInputStream("data/polygon_triangles.dat");
        FileInputStream f_in_polygon_rectangles = new FileInputStream("data/polygon_rectangles.dat");
        ObjectInputStream in_polygon_circles =  new ObjectInputStream (f_in_polygon_circles);
        ObjectInputStream in_polygon_triangles =  new ObjectInputStream (f_in_polygon_triangles);
        ObjectInputStream in_polygon_rectangles =  new ObjectInputStream (f_in_polygon_rectangles);

        Date d1 = (Date)in_polygon_circles.readObject();
        Polygon[] mas_after_s = new Polygon[n];

        int i = 0;
        while ( f_in_polygon_circles.available() > 0 ){
            mas_after_s[i] = (Polygon) in_polygon_circles.readObject();
            i++;
        }

        while ( f_in_polygon_triangles.available() > 0 ){
            mas_after_s[i] = (Polygon) in_polygon_triangles.readObject();
            i++;
        }

        while ( f_in_polygon_rectangles.available() > 0 ){
            mas_after_s[i] = (Polygon) in_polygon_rectangles.readObject();
            i++;
        }

        in_polygon_circles.close();
        in_polygon_triangles.close();
        in_polygon_rectangles.close();

        System.out.printf("\nДруге завдання. Після серіалізації (%tD)\n", d1);
        for (int j = 0; j < i; j++)
            mas_after_s[j].display();
    }
}