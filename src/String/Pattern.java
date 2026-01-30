package String;

public class Pattern {
    public static void main(String[] args) {
        int value = 4;
       for (int i = value-1; i > 0; i--) {
            printCharecter(i);
            System.out.println("");
        }

        for (int i = 0; i <value; i++) {
            printCharecter(i);
            System.out.println("");

    }

  /*      int number = 4;
        while (0 < number) {
            printCharecter(number-1);
            System.out.println("");
            number = number - 1;
            if (number==0){
                System.out.println("weretewt");
                number = number + 2;
            }
        }*/
    }
        private static void printCharecter ( int number){
            for (int j = 0; j <= number; j++) {
                System.out.print("*");
            }

        }

}
