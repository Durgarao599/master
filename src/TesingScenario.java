import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TesingScenario {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> map = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Long> mostRepeatd = map.entrySet().stream().map(t -> t.getValue()).sorted(Comparator.reverseOrder()).findFirst();

        Optional<String> key = map.entrySet().stream().filter(t -> t.getValue() == mostRepeatd.get())
                .map(t -> t.getKey())
                .limit(1).findFirst();
        System.out.println(key.get());






            /*
            int mostRepeate = 0;


            for (String str::  map.entrySet().stream().) {
                value = map.get(str);

                if (mostRepeate > value) {

                    mostRepeated = value;
                }

            }

            String key = map.getValue(mostRepeated);*/

    }

}
