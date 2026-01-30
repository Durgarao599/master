package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareCharecterString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm");
        List<String> copyList = null;
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> str = new ArrayList<>();
            for (int j = i + 1; j < list.size(); j++) {
                if (compareCharecterString(list.get(i), list.get(j))) {
                    str.add(list.get(j));
                    copyList = new ArrayList<String>(list);
                    copyList.remove(list.get(j));
                }
            }
            str.add(list.get(i));
            if (str.size() > 1)
                System.out.println(str);
            list = copyList;
        }

    }

    private static boolean compareCharecterString(String str, String str2) {
        if (str.equals(str2))
            return false;
        for (Character c : str.toCharArray()) {
            if (!(str2.contains(c.toString()))) {
                return false;
            }
        }
        return true;
    }

}
