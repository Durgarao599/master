package MapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .toList();

        System.out.println("map::::"+listOfIntegers);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream())
                        //.collect(Collectors.toList());
                                .toList();

        System.out.println("Flatmap::::"+flattenedList);

        List<String> list = Arrays.asList("geeks", "gfg", "g",
                "e", "e", "k", "s");

        List<String> answer = list.stream()
                .map(temp -> temp.toUpperCase())
               // .map(String::toUpperCase)
                .collect(Collectors.toList());
        // displaying the new stream
        System.out.println(answer);
    }
}
