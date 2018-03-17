public class Sort_Matrix_02 {
    public static void main(String[] args) {
        int m = 7, n = 25, min_range = 0, max_range = 10;
        int[][] A = new int[m][n], B = new int[m][n];
        int[][] vector = new int[2][m];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = (int)( Math.random() * (max_range-min_range) ) + min_range;
            }
        }

        System.out.println("Початкова матриця");
        display(A);

        for(int i = 0; i < m; i++) {
            vector[0][i] = i;
            vector[1][i] = recognition_seq(A[i]);
        }

        vector = Sort(vector);
        System.out.println("Відсортований масив довжин однакових послідовностей у рядках матриці");
        display(vector);

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                B[i][j] = A[vector[0][i]][j];

        A = B;

        System.out.println("Змінена матриця");
        display(A);
    }


    public static void display(int[][] mas)
    {
        for(int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                System.out.printf("%3d", mas[i][j]);
            System.out.println("\n");
        }
    }

    public static int recognition_seq(int[] mas)
    {
        int length = 1, j = 1;
        for(int i = 0; i < mas.length - 1; i++) {
            if (mas[i] == mas[i+1])
                j += 1;
            else
                if (j > 1) {
                    length = j;
                    j = 1;
                }
        }
        return length;
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
