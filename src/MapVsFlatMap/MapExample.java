package MapVsFlatMap;

import java.awt.print.Book;
import java.util.*;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        // new map
        Map<Integer, String> map = new HashMap<>();

        // add data
        map.put(1, "V1");
        map.put(5, "V2");
        map.put(10, "V3");


        System.out.println("map.get(1) "+map.get(1));

        System.out.println("#1. Using forEach");
        map.forEach( (k,v) -> {
            System.out.println("key: " + k + ", value: " + v);
        });

        map.entrySet().stream().forEach((record) -> {
            System.out.println("key: " + record.getKey() + ", value: " + record.getValue());
        });


        System.out.println("#2. Using Map.entrySet() method");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.println("key: " + k + ", value: " + v);
        }

        System.out.println("#3. Using map.keySet() method - Keys only");
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            System.out.println("key: " + k);
        }

        System.out.println("#4. Using map.values() method - Values only");
        Collection<String> values = map.values();
        for (String v : values) {
            System.out.println("value: " + v);
        }


        Map<Integer, String> result =   map.entrySet()
                .stream()
                .filter(m -> "V1".equals(m.getValue()))
               // .collect(Collectors.toMap(m -> m.getKey(), m -> m.getValue()));
       .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        result.forEach((v,k) -> System.out.println(v +" "+k ));


    }


/*    List<Book> library = Arrays.asList(new Book("Book1", new Author(30, "FirstName1", "LastName1")),

            new Book("Book2", new Author(50, "FirstName2", "LastName2")),

            new Book("Book3", new Author(60, "FirstName2", "LastName2")),

            new Book("Book4", new Author(60, "FirstName2", "LastName2")),

            new Book("Book3", new Author(70, "FirstName4", "LastName4")),

            new Book("Book3", new Author(85, "FirstName3", "LastName3")));*/




}