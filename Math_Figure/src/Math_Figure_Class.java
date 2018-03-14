public class Math_Figure_Class {
    public static void main(String[] args) {

        // rectangle
        int n = 10, m = 7;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        // triangle 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        // triangle 2 the same
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        // rhombus
        System.out.print("\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
