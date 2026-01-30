package FindConsonants;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartingWithVowels
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","orange");

     List<String> vowels=   list.stream().map( w ->w.toLowerCase())
                .filter( w -> (w.startsWith("a")|| w.startsWith("e") ||  w.startsWith("i") || w.startsWith("o") ||  w.startsWith("u")))
                .collect(Collectors.toList());

/*        List<String> vowels= list.stream().filter( w -> (w.startsWith("a")|| w.startsWith("e") ||  w.startsWith("i") || w.startsWith("o") ||  w.startsWith("u")))
                .collect(Collectors.toList());*/


      List<String> filer= list.stream().filter( w -> !(w.equals("Apple")))
                .collect(Collectors.toList());


        filer.forEach( t -> System.out.println(t));


        IntPredicate consonantsCheck = new IntPredicate() {
            @Override
            public boolean test(int w) {
                return (w== 'a'|| w== 'e' || w== 'i'|| w== 'o'|| w== 'u');
            }
        };

        String str= "Hello Durga rao";
       // int[] array = str.chars().filter(consonantsCheck).toArray();
       // System.out.println(array.toString());
        str.chars().filter(consonantsCheck).forEach(c -> System.out.printf("%c", c));


       /* Stream<Character> sch = str.chars().mapToObj(i -> (char)i);
        sch.forEach(ch -> System.out.printf("%c %s%n", ch, ch.getClass().getName()));*/

        System.out.println(":::consonents in list");
       Long consonentsCount= str.chars()
                .mapToObj(c -> (char) c)
                .filter(w -> !(w== 'a'|| w== 'e' || w== 'i'|| w== 'o'|| w== 'u'))
               .collect(Collectors.counting());
        System.out.println(":::consonentsCount  in list " +consonentsCount);
               // .forEach(ch -> System.out.print( ch));

        System.out.println(":::Vowels in list:::::");
        Long vowelsCount= str.chars()
                .mapToObj(c -> (char) c)
                .filter(v -> (v== 'a'|| v== 'e' || v== 'i'|| v== 'o'|| v== 'u'))
                .collect(Collectors.counting());
        System.out.println(":::vowelsCount  in list " +vowelsCount);
                //.forEach(ch -> System.out.print(ch));



/*       list.stream().map(t-> t.chars()
               .mapToObj(c -> (char) c)
               .filter(w -> !(w== 'a'|| w== 'e' || w== 'i'|| w== 'o'|| w== 'u'))
               .forEach(ch -> System.out.printf("%c", ch)));*/

        String string = "1, 2, 3, 4";
        List<Integer> lis = Arrays.asList(string.split(",")).stream().map(s -> Integer.parseInt(s.trim())).collect(Collectors.toList());

/*
        List<String> test=   list.stream().map( w ->w.toLowerCase())
                .filter(consonantsCheck)
                .collect(Collectors.toList());

        test.forEach( t -> System.out.println(t));*/
    }
}
