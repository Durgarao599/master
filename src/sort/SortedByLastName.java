package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedByLastName {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Durga Angara", "Hari Sahoo", "Krishna Kumari", "Ram Krishna", "Jashwin Angar");

        Comparator<String> sortedByLastName = (e1, e2) -> e1.split(" ")[1].compareTo(e2.split(" ")[1]);

        List<String> sortedList = list.stream().sorted(sortedByLastName).collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
