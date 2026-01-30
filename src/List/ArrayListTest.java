package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>(5);

     //   List<Integer> list = Arrays.asList(3,2,5,6,8,9,7);
       //list=  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        // Adding element in List
        str.add("Kanaka");
        str.add("Rao");
        str.add("Angara");
        // use add() method to initially
        // add elements in the list
        str.add(1, "Durga");

        str.forEach(s ->System.out.println(s));

        List<String> str1 = new ArrayList<>();
        str1.add("Kanaka");
        str1.add("Rao");
        str1.add("Angara");
        // use add() method to initially
        // add elements in the list
        str1.add(1, "Durga");

        str1.remove(2);

        System.out.println(":::::::::After removing:::::::::");
        str1.forEach(s ->System.out.println(s));

        List<String> str2 = Arrays.asList("Kanaka","Rao","Angara");
        //str2.add(1, "Durga"); it won't work
     //   str2.forEach(s ->System.out.println(s));

    }
}
