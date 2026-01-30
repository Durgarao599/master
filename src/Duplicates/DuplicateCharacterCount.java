package Duplicates;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterCount {

    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Long> count = null;
                input.chars()
                .mapToObj(c -> (char) c)
               // Convert each int to a char
                // Step 2: Group characters and count occurrences
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().forEach(t ->System.out.println(t));
      //  System.out.println(count);

        Map<Character, Long> duplicateChars = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(t -> t.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(duplicateChars);


        input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v)-> {
                    System.out.println(k + " " +v);
                });



        Set<Integer> seen = new HashSet<>();
        input.chars()
                .filter(i -> !seen.add(i))
                .forEach(i -> System.out.print((char) i));

        System.out.println(" :::: Duplicates::::::::::::");

        Set<Character> set = new HashSet<>();
        Set<Character> duplicates=  input.chars().mapToObj(c -> (char) c)
               .filter( i -> !set.add(i))
                .collect((Collectors.toSet()));

        System.out.println(" :::::::::: duplicates::::::::::: "+duplicates);

        System.out.println(" :::::::::: charecters in set::::::::: "+set);

        input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v) ->{
                    System.out.println("Charecter: "+ k +" -No of times repeated: "+ v);
                });

    }
}
