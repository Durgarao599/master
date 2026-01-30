import Utility.TestUtil;
import modal.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargeJava8 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 6, 2, 9, 1, 5, 8, 7, 32);


        Optional<Integer> secondLarge = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
        //System.out.println("Large::::" + large);

        // Second Largest Number
        System.out.println("Second Largest Number::::" + secondLarge.get());
        Integer largestNumber = list.stream().sorted(Comparator.reverseOrder()).limit(1).findFirst().get();

        //  Largest Number
        System.out.println("Largest Number::::::::::" + largestNumber);



//Second Smallest Number
        System.out.println("Second Smallest Number::::" + list.stream().sorted().limit(2).skip(1).findFirst().get());

        //Smallest Number
        System.out.println("SmallestNumber:::::::::::" + list.stream().sorted().limit(1).findFirst().get());

        List<Employee> empList = TestUtil.getEmployeeList();

        System.out.println("Second Largest Number in Employee::::" +  empList.stream().map(Employee::getSal).sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get());

        System.out.println("Second Largest Number in Employee::::" +  empList.stream().sorted((Comparator.comparing(Employee::getSal)).reversed()).limit(2).skip(1).findFirst().get().getSal());
    }
}
