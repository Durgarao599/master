package Duplicates;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatedBySet {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 3, 1, 9, 9, 4, 1);

        System.out.println("Original List ::" + list);

        Set<Integer> result = findDuplicatedBySetAdd(list);
        System.out.println("Duplicate /Repeated Numbers::" +result);
      //  result.forEach(System.out::println);

        Set<Integer> unique = findSetAdd(list);
       // unique.forEach(System.out::println);
        System.out.println("Numbers in list::" +unique);

        Map<Integer, Long> duplicate = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      //  System.out.println("duplicate Values ::: " + duplicate);

        List li= duplicate.entrySet().stream().filter( mp ->mp.getValue()<2)
                .map(mp ->mp.getKey())
                .collect(Collectors.toList());

        System.out.println("Non repeated/Unique Values ::: " + li);

        String input = "programming";
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicateChar = input.chars().mapToObj(c -> (char) c)
                .filter(i -> !seen.add(i))
                .collect(Collectors.toSet());

        System.out.println("Unique Charecters ::: " + seen);

        System.out.println("Duplicate Charecters ::: " + duplicateChar);
    }

    public static <T> Set<T> findDuplicatedBySetAdd(List<T> list) {
        Set<T> items = new HashSet<>();
        return list.stream()
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }


    public Map<Integer,Long> findDuplicatedBySet(List<Integer> list) {
        Map<Integer,Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return map;
    }


    public static <T> Set<T> findSetAdd(List<T> list) {
        return list.stream()
                .collect(Collectors.toSet());
    }

}