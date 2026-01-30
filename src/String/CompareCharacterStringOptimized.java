package String;

import java.util.*;

public class CompareCharacterStringOptimized {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm");

        Map<String, List<String>> grouped = new HashMap<>();

        for (String word : list) {
            // Normalize: sort characters to create a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
       //     String key = new String(chars);
            String key = chars.toString();

            // Group by normalized key
            //grouped.computeIfAbsent(key, k -> new ArrayList<>()).add(word);

            if(grouped.containsKey(key)){
                grouped.get(key).add(word);
            }else {
                grouped.put(key,new ArrayList<>(List.of(word)));

            }
        }
        // Print groups with more than one member
        for (List<String> group : grouped.values()) {
            if (group.size() > 1) {
                System.out.println(group);
            }
        }
    }
}