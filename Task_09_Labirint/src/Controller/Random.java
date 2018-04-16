package Controller;

import DataStructure.Point;

public class Random {

    public static int random_s(int min_range, int max_range){
        return (int)( Math.random() * (max_range-min_range) ) + min_range;
    }

    public static boolean random_s(){
        return Math.random() > 0.5;
    }

    public static Point random_in_out(int n){
        switch (random_s(0,3)) {
            case 0: return new Point(random_s(0,n-1),0);
            case 1: return new Point(0,random_s(0,n-1));
            case 2: return new Point(random_s(0,n-1), n-1);
            case 3: return new Point(n-1, random_s(0,n-1));
            default: return new Point(-1,-1);
        }
    }

}
