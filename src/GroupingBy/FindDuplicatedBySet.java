package GroupingBy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatedBySet {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2,3,1, 9, 9, 4,1);
        System.out.println("list Values: "+list);

        System.out.println("Duplicate Values");
        Set<Integer> result = findDuplicatedBySetAdd(list);
        result.forEach(System.out::println);
        System.out.println("Unique Values");
        Set<Integer> unique = findSetAdd(list);
        unique.forEach(System.out::println);

        Map<Integer ,Long> duplicate = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Integer ,Long> duplicate1 =  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("duplicate Values ::: "+duplicate);


        String input = "programming";
        Set<Integer> seen = new HashSet<>();
        input.chars()
                .filter(i -> !seen.add(i))
                .forEach(i -> System.out.print((char) i));
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