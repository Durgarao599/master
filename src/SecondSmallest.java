import java.util.Arrays;
import java.util.List;

public class SecondSmallest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 6, 2, 9, 1, 5, 8, 7, 32);

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (small > list.get(i)) {
                secondSmall = small;
                small = list.get(i);
            } else if (secondSmall > list.get(i)) {
                secondSmall = list.get(i);
            }
        }
        System.out.println("smallest Number::::" + small);
        System.out.println("secondSmall::::" + secondSmall);
    }
}
