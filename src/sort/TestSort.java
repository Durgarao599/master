package sort;

import java.util.Arrays;
import java.util.List;

public class TestSort {

    public static void main(String[] args) {
        int a[] ={7,3,2,9,11,2,1,18,19};
        Arrays.sort(a);

        List<Integer> list= Arrays.asList(7,3,2,9,11,2,1,18,19);

        String[] stringArray = {"apple", "banana", "cherry"};
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<String> stringList1 = Arrays.asList(stringArray);
        List<Integer> intList1 = Arrays.asList(intArray);

        //List<Integer> intList2 = Arrays.asList(a); this won't work


        stringList1.add(1,"banana2");

        stringList1.forEach( t-> System.out.println(t));


        System.out.println("existing sorting ::: Arrays.sort(a)");
        Arrays.stream(a).forEach(t ->  System.out.println(t));


        int[] sortedArray = Arrays.stream(a)
                .sorted()
                .toArray();
        System.out.println("existing sorting ::: Arrays.stream(a)");
        Arrays.stream(sortedArray).forEach(t ->  System.out.println(t));
    }
}
