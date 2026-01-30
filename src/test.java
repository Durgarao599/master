import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<Integer>();
        test.add(217);
        test.add(317);
        test.add(417);
        test.add(517);
       // List<Integer> test =   Arrays.asList(217,317,417,517);

     /*   Set<Integer> set = new HashSet<Integer>();
        List<Integer> duplicate= test.stream().filter( t -> !set.add(t))
                .collect(Collectors.toList());
        duplicate.forEach( t -> System.out.println(t));*/

     List<Integer>  result=  test.parallelStream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        result.forEach( t -> System.out.println(t));

        String str="Durgarao";
       Map<Character,Long> charecters= str.chars().mapToObj(c ->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charecters);


       Map<Character,Long> duplicate= str.chars().mapToObj(c ->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(t -> t.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
       System.out.println("duplicate Charecters:: "+duplicate);

       List<String> strList =Arrays.asList("Durga","Angara","Durga","Jashwin","Angara");

        Set<String> uniqueSet = strList.stream().collect(Collectors.toSet());
        System.out.println("uniqueSet :: " +uniqueSet);
        Set<String> set = new HashSet<>();

        Set<String> duplicatedString= strList.stream().filter( t -> !set.add(t))
                .collect(Collectors.toSet());
        System.out.println("duplicatedString ::" +duplicatedString);

   Set<String>  nonRepeatedSet =  strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(t -> t.getValue()<2)
           .map(Map.Entry::getKey)
           .collect(Collectors.toSet());

   System.out.println("nonRepeatedSet "+nonRepeatedSet);

                //.collect(Collectors.toMap(Map.Entry::getKey ,Map.Entry::getValue));

        Functional func = (a, b)->{return ( a>b ? a:b);};

        System.out.println("Largest ::" +func.operation(3,4));

    }
}

@FunctionalInterface
interface Functional {
    int operation(int a, int b);
}