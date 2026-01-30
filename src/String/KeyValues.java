package String;

import java.util.*;

public class KeyValues {
    static Map<String, List<String>> map = new HashMap<>();

    public static void main(String[] args) {

        List<String> list = Arrays.asList("India - Amaravati", "India -Delhi", "India - Bangalore"
                , "Usa - Los Angeles", "Usa - Chicago", "Usa - Houston",
                "Usa -- New York City");
        for (String str : list) {
            String[] s = str.split("-");
            addPair(s[0], s[1]);
        }
        System.out.println(map);
    }

    public static void addPair(String key, String value) {
       /* if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            map.put(key, new ArrayList<>(List.of(value)));
        }*/

        map.computeIfAbsent(key ,k->new ArrayList<>()).add(value);
    }

}
