public class Sort_Matrix_01 {
    public static void main(String[] args) {
        int m = 3, n = 5, min_range = -150, max_range = 270;
        int[][] A = new int[m][n], B = new int[m][n];
        int[][] vector = new int[2][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = (int)( Math.random() * (max_range-min_range) ) + min_range;
            }
        }

        System.out.println("Початкова матриця");
        display(A);

        for(int j = 0; j < n; j++)
            vector[0][j] = j;

        for(int j = 0; j < n; j++){
            for(int i = 0; i < m; i++)
                vector[1][j] += A[i][j];
            vector[1][j] /= m;
        }

        vector = Sort(vector);
        System.out.println("Відсортований масив середніх значень ствопців");
        display(vector);

        for(int j = 0; j < n; j++)
            for(int i = 0; i < m; i++)
                B[i][j] = A[i][vector[0][j]];

        A = B;

        System.out.println("Змінена матриця");
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

    public static int [][] Sort(int [][] vector)
    {
        int imin, temp, i_first_plus = 0;
        for(int i = 0; i < vector[0].length - 1; i++)
        {
            imin = i;
            for (int j = i + 1; j < vector[0].length; j++)
            {
                if (vector[1][j] > vector[1][imin])
                    imin = j;
            }

            temp = vector[1][imin];
            vector[1][imin] = vector[1][i];
            vector[1][i] = temp;

            temp = vector[0][imin];
            vector[0][imin] = vector[0][i];
            vector[0][i] = temp;
        }

        return vector;
    }
}
