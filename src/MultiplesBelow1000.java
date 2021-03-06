public class MultiplesBelow1000 {

    public static void main(String[] args) {

        int number = 1;
        int sum = 0;

        while (number < 1000) {

            if ((number % 3 == 0) || (number % 5 == 0))   {
                System.out.print(number + ", ");
                sum = sum + number;
            }
            number++;
        }
        System.out.println("\nSum of all the multiples of 3 or 5 is = " + sum);
    }
}
