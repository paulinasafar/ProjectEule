public class LargestPrimeFactor {

    public static void main(String[] args) {
           int number = 12;

        for (int i = 2; i < number; i++) {
             if (number % i == 0) {
                System.out.println("Primzahlen sind = " + i);
             }
        }
    }
    public static boolean isPrim(int number) {

    int counter = 2;
    boolean checkIsPrim = true;

        while (counter < number) {
        if (number % counter == 0) {

            checkIsPrim = false;
            break;
        }
        counter++;
    }
            return checkIsPrim;
}
}










