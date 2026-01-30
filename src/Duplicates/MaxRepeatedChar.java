package Duplicates;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepeatedChar {
    public static void main(String[] args) {
        String word = "programming";

        // Count frequency of each character
        Map<Character, Long> freqMap = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the max repeated character
        Map.Entry<Character, Long> maxEntry = freqMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("Max repeated character: '" + maxEntry.getKey() +
                "' occurs " + maxEntry.getValue() + " times");
    }
}

