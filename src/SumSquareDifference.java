public class SumSquareDifference {

    public static void main(String[] args) {

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

       /* for (int i = 1; i <= 100; i++) {
            sum1 = sum1 + (i * i);
        }
        System.out.println(sum1); */

        for (int i = 0; i <= 100; i++) {
            sum2 = sum2 + i;
            sum3 = sum2 * sum2;
            System.out.println(sum3);
        }
            int x = sum3 - sum1;
        System.out.println(x);
    }
}
