import java.util.*;

public class TrainsEx {



    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<Integer>();


        List<Integer>  arrieved  = Arrays.asList(1000, 935, 1100);
        List<Integer>  dept  = Arrays.asList(1200, 1240, 1130);

        List<Integer>   arr = arrieved.stream().sorted().toList();

       List<Integer> sorted  =dept.stream().sorted().toList();
        int max =0;
        for(int i=0, j=0 ; i< arr.size() ;i++){
            queue.push(arr.get(i));
            if( i < arr.size()-1 && arr.get(i+1) > sorted.get(j))
            {
               if(max <queue.size()) {
                   max= queue.size();
               }
                queue.pop();
               j++;
            }
        }
System.out.println(max);
    }
}
