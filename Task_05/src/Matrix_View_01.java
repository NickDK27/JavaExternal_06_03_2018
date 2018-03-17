public class Matrix_View_01 {
    public static void main(String[] args) {
        int n = 5, min_range = 0, max_range = 10;
        int[][] A = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = (int)( Math.random() * (max_range-min_range) ) + min_range;
            }
        }

        System.out.println("Стандартний вивід початкової матриці");
        display(A);

        System.out.println("Вивід матриці в один рядок");
        for(int p = 0; p < (int)n/2; p++){
            for(int j = p; j < n - p - 1; j++)
                System.out.printf("%3d", A[p][j]);

            for(int i = p; i < n - p - 1; i++)
                System.out.printf("%3d", A[i][n - p - 1]);

            for(int j = n - p - 1; j > p; j--)
                System.out.printf("%3d", A[n - p - 1][j]);

            for(int i = n - p - 1; i > p; i--)
                System.out.printf("%3d", A[i][p]);
        }

        if (Math.floorMod(n, 2) != 0) {
            int t = (n - 1) / 2;
            System.out.printf("%3d", A[t][t]);
        }
    }


    public static void display(int[][] mas)
    {
        for(int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                System.out.printf("%3d", mas[i][j]);
            System.out.println("\n");
        }
    }

}
