public class SmallestMultiple {

     public static void main(String[] args) {
         int i;
         boolean isDivisible = true;

        for (i = 1; i < 1000000000; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    isDivisible = false;
                    break;}
                else { isDivisible = true;}

                }
            if (isDivisible)
                break;
            }
        if (isDivisible) {
        System.out.println(i); }
        }
    }





        /*int smallestNumber = 1000000000;
        for (int i = 0; i < smallestNumber; i++) {
                if ((i % 1 == 0) && (i % 2 == 0) && (i % 3 == 0) && (i % 4 == 0) && (i % 5 == 0)
                        && (i % 6 == 0) && (i % 7 == 0) && (i % 8 == 0) && (i % 9 == 0) && (i % 10 == 0)
                        && (i % 11 == 0) && (i % 12 == 0) && (i % 13 == 0) && (i % 14 == 0) && (i % 15 == 0)
                        && (i % 17 == 0) && (i % 18 == 0) && (i % 19 == 0) && (i % 20 == 0)){
                    System.out.println(i); }
            } */

