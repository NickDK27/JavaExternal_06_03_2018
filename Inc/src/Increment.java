public class Increment {
    public static class Test {
        public static void  main(String[] args){
            int a = 8;
            // a += a++ + ++a + a++;
            // a += a++ + ++a;
            a += a++ + ++a + a++;
            System.out.println(a);

            int eArr1[] = {10, 23, 10, 2};
            int[] eArr4 = new int[20] {};
            int[] eArr2 = new int[10];
            int eArr5[] = new int[2] {10, 20};
            int eArr3[] = new int[] {};

        }
    }
}
