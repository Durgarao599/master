
public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        Functional1 largeString = (a, b) ->
                a.length() > b.length() ? a : b;

        System.out.println(largeString.operation("Durga", "Durgarao"));

        PredicateTest test = (a) -> {
            return (a % 2 == 0);
        };

        System.out.println(test.operation(2));
    }

}

@FunctionalInterface
interface Functional1 {
    String operation(String a, String b);
}


@FunctionalInterface
interface PredicateTest {
    boolean operation(int a);
}