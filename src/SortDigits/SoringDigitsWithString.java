package SortDigits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoringDigitsWithString {
    public static void main(String[] args) {
        Integer number = 5623157;
        List<Integer> lt = new ArrayList<>();
        for (char ch : number.toString().toCharArray()) {
            //  lt.add(Integer.parseInt(((Character) ch).toString()));
            lt.add(Character.getNumericValue(ch));
        }
        lt.stream().sorted().forEach(System.out::print);
    }
}
