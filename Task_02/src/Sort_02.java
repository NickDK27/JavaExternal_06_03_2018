public class Sort_02 {
    public static void main(String[] args) {
        int n = 10, a = -150, b = 270;
        int[] vector = new int[n];

        for(int i = 0; i < n; i++){
            vector[i] = (int)( Math.random() * (b-a) ) + a;
        }

        System.out.println("Початковий масив");
        display(vector);

        int temp, i_plus = 0;
        for(int i = 0; i < n; i++)
        {
            if (vector[i] > 0) {
                temp = vector[i_plus];
                vector[i_plus] = vector[i];
                vector[i] = temp;
                i_plus = i_plus + 1;
            }
        }

        System.out.println("Змінений масив");
        display(vector);
    }


    public static void display(int[] mas)
    {
        for(int i = 0; i < mas.length; i++)
            System.out.println(mas[i]);
    }
}
