
import DataStructure.MyStack;
import DataStructure.Point;
import Controller.Random;
import Controller.Compare;
import LookingWay.FindWay;

public class Main{

    public static void main(String[] args) {
        final int n = 7;
        boolean[][] matrix = new boolean[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = Random.random_s();

        Point startPoint = Random.random_in_out(n);
        Point finishPoint = Random.random_in_out(n);
        matrix[startPoint.getX()][startPoint.getY()] = false;
        matrix[finishPoint.getX()][finishPoint.getY()] = false;
//        matrix = init_matrix(n);
//        startPoint.setX(2); startPoint.setY(4);
//        finishPoint.setX(1); finishPoint.setY(4);

        print_matrix(matrix);
        System.out.printf("Стартуємо у точці (%d, %d)\n", startPoint.getX(), startPoint.getY());
        System.out.printf("Фінішуємо у точці (%d, %d)\n", finishPoint.getX(), finishPoint.getY());
        if (Compare.equals(startPoint,finishPoint))
            System.out.printf("Старт співпадає з фінішом\n");
        else {
            MyStack path = new MyStack(1000);
            path = FindWay.find_path(matrix, path, finishPoint, startPoint);

            System.out.printf("Шлях\n");
            if (!path.isEmpty()) {
                Point currentPoint = path.pop();
                while (!path.isEmpty()) {
                    System.out.printf("(%d, %d), ", currentPoint.getX(), currentPoint.getY());
                    currentPoint = path.pop();
                }
                System.out.printf("(%d, %d).", currentPoint.getX(), currentPoint.getY());
            }
            else
                System.out.printf("Виходу з лабіринту немає\n");
        }
    }

    public static void print_matrix(boolean matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                if (matrix[i][j])
                    System.out.printf(" 1");
                else
                    System.out.printf(" 0");
            System.out.printf("\n");
        }
    }

    public static boolean[][] init_matrix(int n){
        boolean [][] matrix = new boolean[n][n];
        matrix[0][0] = false; matrix[0][1] = true; matrix[0][2] = true; matrix[0][3] = false; matrix[0][4] = false;
        matrix[1][0] = false; matrix[1][1] = false; matrix[1][2] = true; matrix[1][3] = false; matrix[1][4] = false;
        matrix[2][0] = false; matrix[2][1] = true; matrix[2][2] = true; matrix[2][3] = true; matrix[2][4] = false;
        matrix[3][0] = true; matrix[3][1] = false; matrix[3][2] = true; matrix[3][3] = true; matrix[3][4] = true;
        matrix[4][0] = false; matrix[4][1] = false; matrix[4][2] = true; matrix[4][3] = true; matrix[4][4] = true;
        return  matrix;
    }
}