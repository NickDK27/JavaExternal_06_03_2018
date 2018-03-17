public class Sort_Matrix_01 {
    public static void main(String[] args) {
        int m = 3, n = 5, min_range = -150, max_range = 270;
        int[][] A = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = (int)( Math.random() * (max_range-min_range) ) + min_range;
            }
        }

        System.out.println("Початковий масив");
        display(A);



        System.out.println("Змінений масив");
        display(A);
    }


    public static void display(int[][] mas)
    {
        for(int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                System.out.printf("%5d", mas[i][j]);
            System.out.println("\n");
        }
    }
}
