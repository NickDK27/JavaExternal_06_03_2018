public class Sort_01 {
    public static void main(String[] args) {
        int n = 10, a = -150, b = 270;
        int[] vector = new int[n];

        for(int i = 0; i < n; i++){
            vector[i] = (int)( Math.random() * (b-a) ) + a;
        }

        System.out.println("Початковий масив");
        display(vector);

        int imin, temp, i_first_plus = 0;
        for(int i = 0; i < n - 1; i++)
        {
            imin = i;
            for (int j = i + 1; j < n; j++)
            {
                if (vector[j] < vector[imin])
                    imin = j;
            }

            temp = vector[imin];
            vector[imin] = vector[i];
            vector[i] = temp;

            if (i_first_plus == 0 && temp > 0)
                i_first_plus = i;
        }

        int sub_length = (int) (n + i_first_plus) / 2;
        for(int i = i_first_plus; i < sub_length; i++)
        {
            temp = vector[n - 1 + i_first_plus - i];
            vector[n - 1 + i_first_plus - i] = vector[i];
            vector[i] = temp;
        }

        System.out.println("Відсортований масив");
        display(vector);
    }


    public static void display(int[] mas)
    {
        for(int i = 0; i < mas.length; i++)
            System.out.println(mas[i]);
    }
}
