package LookingWay;

import Controller.Compare;
import DataStructure.MyResult;
import DataStructure.MyStack;
import DataStructure.Point;
import DataStructure.Data;

public class FindWay {

    public static MyStack find_path(boolean[][] matrix, MyStack stack, Point currentPoint, Point finishPoint){
        MyResult result = new MyResult(stack, false);
        result.getStack().push(currentPoint);
        if (!Compare.equals(result.getStack().peek(),finishPoint)) {
            result = MoveTo(Data.Move.Left, result.getFinalOut(), matrix, result.getStack(), finishPoint);
            result = MoveTo(Data.Move.Right, result.getFinalOut(), matrix, result.getStack(), finishPoint);
            result = MoveTo(Data.Move.Up, result.getFinalOut(), matrix, result.getStack(), finishPoint);
            result = MoveTo(Data.Move.Down, result.getFinalOut(), matrix, result.getStack(), finishPoint);
            if (!result.getFinalOut())
                result.getStack().pop();
        }
        return result.getStack();
    }

    public static MyResult MoveTo(Data.Move move, boolean final_out, boolean[][] matrix, MyStack stack, Point finishPoint){
        boolean fl = false;
        int nextX = -1, nextY = -1;
        switch (move) {
            case Left:
                nextX = stack.peek().getX() - 1;
                nextY = stack.peek().getY();
                fl = nextX >= 0;
                break;
            case Right:
                nextX = stack.peek().getX() + 1;
                nextY = stack.peek().getY();
                fl = nextX < matrix.length;
                break;
            case Up:
                nextX = stack.peek().getX();
                nextY = stack.peek().getY() - 1;
                fl = nextY >= 0;
                break;
            case Down:
                nextX = stack.peek().getX();
                nextY = stack.peek().getY() + 1;
                fl = nextY < matrix.length;
                break;
        }

        Point nextPoint = new Point(nextX, nextY);
        if (!final_out && fl && !Compare.contains(stack,nextPoint) && !matrix[nextX][nextY]) {
            stack = find_path(matrix, stack, nextPoint, finishPoint);
            if (Compare.equals(stack.peek(),finishPoint))
                final_out = true;
        }

        return new MyResult(stack, final_out);
    }
}
