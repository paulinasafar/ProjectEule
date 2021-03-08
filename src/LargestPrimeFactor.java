public class LargestPrimeFactor {

    public static void main(String[] args) {
           int number = 13195;
           int largest = 0;

        for (int i = 2; i < number; i++) {
            if (isPrim(number)) {
                System.out.println("Der größste Primfaktor ist = " + number);
                break;
            }
             if ((number % i == 0) && (isPrim(i))) {
                System.out.print("Primfaktoren sind = " + i + ", ");
                if (i > largest) {
                    largest = i; }
             } }

        if (isPrim(number) == false) {
        System.out.println();
        System.out.println("Der größte Primfaktor ist = " + largest);
    } }

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










