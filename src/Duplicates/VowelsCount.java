package Duplicates;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelsCount {

    public static void main(String[] args) {

        String str= "Durgarao having 10 years of exp in java technologies";

       Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
                .filter(c -> c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u'))
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
       System.out.println(map);
    }
}
