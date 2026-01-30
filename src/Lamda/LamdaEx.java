package Lamda;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class LamdaEx {

    public static void main(String[] args) {

        Test durga = (int a, int b) -> {
            return a > b ? a : b;
        };

        System.out.println("Largest Number : " + durga.large(5, 6));
    }
}

@FunctionalInterface
interface Test {
    int large(int a, int b);
}
