package MapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedValue {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Durga", "Angara", "Durga","Jithin", "Jashwin", "Angara");
        Set<String> nonRepeatedSet = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(t -> t.getValue() < 2)
                //.map(Map.Entry::getKey)
                .map(t ->t.getKey())
                .collect(Collectors.toSet());

        System.out.println("NonRepeatedValue " + nonRepeatedSet);
    }
}
