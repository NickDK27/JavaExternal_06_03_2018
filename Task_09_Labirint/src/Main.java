
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Stack<Point> path = new Stack<>();

        final int n = 5;
        boolean[][] matrix = new boolean[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = random_s();

        Point startPoint, finishPoint;
        switch (random_s(0,3)) {
            case 0: startPoint = new Point(random_s(0,n-1),0);
                break;
            case 1: startPoint = new Point(0,random_s(0,n-1));
                break;
            case 2: startPoint = new Point(random_s(0,n-1), n-1);
                break;
            case 3: startPoint = new Point(n-1, random_s(0,n-1));
                break;
                default: startPoint = new Point(0,0);
        }
        switch (random_s(0,3)) {
            case 0: finishPoint = new Point(random_s(0,n-1),0);
                break;
            case 1: finishPoint = new Point(0,random_s(0,n-1));
                break;
            case 2: finishPoint = new Point(random_s(0,n-1), n-1);
                break;
            case 3: finishPoint = new Point(n-1, random_s(0,n-1));
                break;
            default: finishPoint = new Point(0,0);
        }

        if (startPoint.getX() == finishPoint.getX() && startPoint.getY() == finishPoint.getY())
            System.out.printf("Старт співпадає з фінішом\n");
        else {
            Stack<Point> stack = new Stack<>();
            stack = find_path(matrix, stack, finishPoint, startPoint);

            Point currentPoint = new Point(0,0);
            System.out.printf("Шлях\n");
            if (!stack.isEmpty())
                currentPoint = stack.pop();
            while (!stack.isEmpty()) {
                System.out.printf("(%d, %d), ", currentPoint.getX(), currentPoint.getY());
                currentPoint = stack.pop();
            }
            System.out.printf("(%d, %d).", currentPoint.getX(), currentPoint.getY());
        }


    }

    public static Stack<Point> find_path(boolean[][] matrix, Stack<Point> stack, Point currentPoint, Point finishPoint){
        boolean final_out = false;
        Point nextPoint;

        
        stack.push(currentPoint);
        if (!(stack.lastElement().getX() == finishPoint.getX() && stack.lastElement().getY() == finishPoint.getY())) {
            if (currentPoint.getX() > 0)
            if (!matrix[currentPoint.getX() - 1][currentPoint.getY()]) {
                nextPoint = new Point(currentPoint.getX() - 1, currentPoint.getY());
                stack = find_path(matrix, stack, nextPoint, finishPoint);
                if (stack.lastElement().getX() == finishPoint.getX() && stack.lastElement().getY() == finishPoint.getY())
                    final_out = true;
            }

            if (currentPoint.getX() < matrix.length)
            if (!final_out && !matrix[currentPoint.getX() + 1][currentPoint.getY()]) {
                nextPoint = new Point(currentPoint.getX() + 1, currentPoint.getY());
                stack = find_path(matrix, stack, nextPoint, finishPoint);
                if (stack.lastElement().getX() == finishPoint.getX() && stack.lastElement().getY() == finishPoint.getY())
                    final_out = true;
            }

            if (currentPoint.getY() > 0)
            if (!final_out && !matrix[currentPoint.getX()][currentPoint.getY() - 1]) {
                nextPoint = new Point(currentPoint.getX(), currentPoint.getY() - 1);
                stack = find_path(matrix, stack, nextPoint, finishPoint);
                if (stack.lastElement().getX() == finishPoint.getX() && stack.lastElement().getY() == finishPoint.getY())
                    final_out = true;
            }

            if (currentPoint.getY() < matrix.length)
            if (!final_out && !matrix[currentPoint.getX()][currentPoint.getY() + 1]) {
                nextPoint = new Point(currentPoint.getX(), currentPoint.getY() + 1);
                stack = find_path(matrix, stack, nextPoint, finishPoint);
                if (stack.lastElement().getX() == finishPoint.getX() && stack.lastElement().getY() == finishPoint.getY())
                    final_out = true;
            }

            if (!final_out)
                stack.pop();
        }

        return stack;
    }


    public static int random_s(int min_range, int max_range){
        return (int)( Math.random() * (max_range-min_range) ) + min_range;
    }

    public static boolean random_s(){
        return Math.random() > 0.5;
    }




}

