public class LargestPrimeFactor {

    public static void main(String[] args) {

        int counter = 1;
        int counter1 = 1;
        int i = 2;

        while (counter < 13195F) {
            if (13195F % counter == 0) {
                System.out.print(counter + ", "); }
                while (counter % i == 0) {
                    System.out.print(counter + ", ");
                    i++;
                }
            counter++;
        }

    }
    }

