package SortDigits;

import java.util.HashMap;
import java.util.Map;

import static SortDigits.SortDigits.sortDigits;

public class test {

    public static void main(String[] args) {

        sortDigits1(2571147);

    }

    private static void sortDigits1(int i) {

        Map<Integer,Integer> map= new HashMap<>();
        while (i > 0) {
             int digit = i%10;
            Integer count = map.get(digit);
            if(count==null){
                count=0;
            }
             i= i/10;
            map.put(digit,count+1);
        }
        StringBuffer sb = new StringBuffer();
          for(int j=0 ;j< 10;j++){

          if(map.get(j) !=null) {
              for (int k = 0; k < map.get(j); k++) {
                  sb.append(j);
              }
          }
          }
        System.out.println(map);
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
