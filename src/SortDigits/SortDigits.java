package SortDigits;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortDigits {

    public static void main(String[] args) {
        int number = 4214;

        List<Integer> numbers = new LinkedList<>(); // a LinkedList is not backed by an array
        for (int i = number; i > 0; i /= 10)
            numbers.add(i % 10);
        numbers.stream().sorted().forEach(System.out::println);

        System.out.println( numbers.stream().sorted().collect(Collectors.toList()));

        sortDigits(4214);
    }

    public static void sortDigits(int x) {
        Map<Integer, Integer> digitCounts = new HashMap<>();

        while (x > 0) {
            int digit = x % 10;
            Integer currentCount = digitCounts.get(digit);
            if (currentCount == null) {
                currentCount = 0;
            }
            digitCounts.put(digit, currentCount + 1);
            x = x / 10;
        }
        StringBuffer sb =new StringBuffer();
        for (int i = 0; i < 10; i++) {
            Integer count = digitCounts.get(i);
            if (count == null) {
                continue;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(i);
                sb.append(i);

            }

        }
        System.out.println("");
        int result=  Integer.valueOf(sb.toString());
        System.out.println(result);
    }
}
