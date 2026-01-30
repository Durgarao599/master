import java.util.Arrays;
import java.util.List;

public class SecondLargeNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,10,4,36, 6, 2, 9, 1, 11,5, 8, 7, 32);

        int large = Integer.MIN_VALUE;;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (large < list.get(i)) {
                secondLarge = large;
                large = list.get(i);
            } else if (secondLarge < list.get(i)) {
                secondLarge = list.get(i);
            }
        }
        System.out.println("Largest Number:::: " + large);
        System.out.println("secondLarge:::: " + secondLarge);
    }
}
