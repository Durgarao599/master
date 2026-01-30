import java.util.Arrays;
import java.util.List;

public class TestIng {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList( 14, 12, 70, 15, 99, 65, 21, 90 );
        int buy = 0;
        int buyingDay = 0;
        int sell = 0;
        int sellingDay = 0;

        for (int i = 0, j = 1; j < list.size(); j++, i++) {
            if (list.get(j) < list.get(i)) {
                int temp = list.get(i) - list.get(j);
                if (temp > buy) {
                    buy = temp;
                    buyingDay = j;
                }
            }
            if (list.get(j) > list.get(i)) {
                int temp = list.get(j) - list.get(i);
                if (temp > sell) {
                    sell = temp;
                    sellingDay = j;
                }
            }
        }
        System.out.println("Day of buying is : " + buyingDay + " buying margin :  " + buy);
        System.out.println("Day of Selling is : " + sellingDay + " Selling Margin :" + sell);
    }
}
