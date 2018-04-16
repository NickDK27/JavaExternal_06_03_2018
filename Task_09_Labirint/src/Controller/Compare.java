package Controller;

import DataStructure.MyStack;
import DataStructure.Point;

public class Compare {
    public static boolean equals(Point point1, Point point2){
        return point1.getX() == point2.getX() && point1.getY() == point2.getY();
    }

    public static boolean contains(MyStack stack, Point fixedPoint){
        for (int i = 0; i < stack.size(); i++)
            if (stack.element(i).getX() == fixedPoint.getX() && stack.element(i).getY() == fixedPoint.getY())
                return true;
        return false;
    }
}
