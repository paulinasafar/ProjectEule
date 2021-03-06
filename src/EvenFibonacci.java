public class EvenFibonacci {

 public static void main(String[] args) {


        int number1 = 0;
        int number2 = 1;
        int limit = 4000000;
        int sum2 = 0;
        System.out.println("Fibonacci numbers till 4.000.000 are: ");

        while (sum2 < limit) {
                int sum1 = number1 + number2;
                if (sum1 % 2 == 0) {
                System.out.print(sum1 + ", ");
                sum2 = sum2 + sum1;
            }
            number1 = number2;
            number2 = sum1;
            }

        System.out.println("\n\nSum of even-valued Fibonacci numbers is =" + sum2);
    }

}

