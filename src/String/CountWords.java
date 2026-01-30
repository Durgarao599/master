package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java program", "Java is great program", "Java is great");
        String[] str = list.stream().collect(Collectors.joining(" ")).split(" ");
        Map<String, Long> map = Arrays.asList(str).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("count " + map);

        Map<String, Integer> mapping = new HashMap<>();
        /*for (String s : str) {
            int count = 0;
            if (mapping.containsKey(s)) {
                count = mapping.get(s);
            }
            mapping.put(s, count + 1);
    }*/

        for (String s : str) {
            mapping.put(s, mapping.getOrDefault(s, 0) + 1);
        }

        System.out.println(mapping);

    }
}
