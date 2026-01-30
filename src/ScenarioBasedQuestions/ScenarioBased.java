package ScenarioBasedQuestions;

import java.util.*;
import java.util.stream.Collectors;


public class ScenarioBased {

    public static void main(String[] args) {

        System.out.println("Hello world");
        List<List<Insurence>> list = new ArrayList<>();

        List<Insurence> client1 = new ArrayList<>();
        client1.add(new Insurence(InsuredType.BUSINESS, 60));
        client1.add(new Insurence(InsuredType.TERM, 100));
        list.add(client1);

        List<Insurence> client2 = new ArrayList<>();
        client2.add(new Insurence(InsuredType.MIB, 50));
        client2.add(new Insurence(InsuredType.TERM, 90));

        List<Insurence> client3 = new ArrayList<>();
        client3.add(new Insurence(InsuredType.BUSINESS, 50));
        client3.add(new Insurence(InsuredType.HEALTH, 90));

        List<Insurence> client4 = new ArrayList<>();
        client4.add(new Insurence(InsuredType.BUSINESS, 70));
        client4.add(new Insurence(InsuredType.HEALTH, 20));
        client4.add(new Insurence(InsuredType.MIB, 50));
        client4.add(new Insurence(InsuredType.BIKE, 21));
        list.add(client2);
        list.add(client3);
        list.add(client4);

        Map<InsuredType, List<Insurence>> map = list.stream().flatMap(insuredTypes -> insuredTypes.stream()).sorted(Comparator.comparing(Insurence::insuredType).reversed()).collect(Collectors.groupingBy(Insurence::insuredType, Collectors.toList()));

        map.forEach((k, v) -> {
            for (Insurence insured : v) {
                System.out.println("Key:" + insured.insuredType + " values:" + insured.premium);
            }
        });
    }

    public enum InsuredType {
        BUSINESS, TERM, MIB, BIKE, HEALTH
    }

    public record Insurence(InsuredType insuredType, int premium) {
    }

}

