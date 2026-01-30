package ParenthesesMatching;

import java.util.HashMap;
import java.util.Map;

public class Parentheses {


    static String str = "()[]{}";


    public static void main(String[] args) {

        Map<String, String> test = new HashMap<>();
        test.put("(", ")");
        test.put("[", "]");
        test.put("{", "}");

        test.put(")", "(");
        test.put("]", "[");
        test.put("}", "{");
        int count = 0;
        for (Character c : str.toCharArray()) {
            if (!check(c.toString(), test)) {
                count++;
                //  System.out.println("Not Matching");
            }
        }

        if (count > 0) {
            System.out.println(" NOT Matching");
        } else {
            System.out.println(" Matching");
        }

        String str = "()[]}{";

    }

    public static boolean check(String c, Map<String, String> map) {

        if (str.contains(c)) {
            if (!str.contains(map.get(c))) {
                return false;
            }
        }
        return true;
    }


}
