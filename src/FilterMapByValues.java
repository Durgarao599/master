import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
public class FilterMapByValues {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, "Apple");
        hmap.put(22, "Orange");
        hmap.put(33, "Kiwi");
        hmap.put(44, "Banana");
        hmap.put(77, "Orange");
        hmap.put(99, "Orange");
        System.out.println("Result: " + hmap);
        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(map -> "Orange".equals(map.getValue()))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result);
    }
}