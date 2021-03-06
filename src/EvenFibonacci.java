public class EvenFibonacci {

 public static void main(String[] args) {

        int counter = 0;
        int number1 = 0;
        int number2 = 1;
        int sum2 = 0;

        while (counter < 40) {
                int sum1 = number1 + number2;
                if (sum1 % 2 == 0) {
                System.out.print(sum1 + ", ");
                sum2 = sum2 + sum1;
            }
            number1 = number2;
            number2 = sum1;
            if (number1 < 4000000)  {
                counter++; }
            else {counter = 41;}
            }

        System.out.println("\nSum of even-valued Fibonacci numbers are :" + sum2);
    }

}

