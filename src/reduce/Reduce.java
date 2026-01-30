package reduce;

import Utility.TestUtil;
import modal.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class Reduce {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(2, 5, 6, 7, 1, 9, 8);
        Integer sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum " + sum);

        Integer multi = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("multi " + multi);

        Integer max = list.stream().reduce(0, (a, b) -> a > b ? a : b);

        System.out.println("max " + max);
        Integer sum1 = list.stream().mapToInt(i -> i).sum();

        System.out.println("sum1 " + sum1);


        List<Employee> empList = TestUtil.getEmployeeList();

        Integer SumOfSalary = empList.stream().filter(i -> i.getSal() >= 100100)
                .map(Employee::getSal)
                .reduce(0, (a, b) -> a + b);

        System.out.println("SumOfSalary by using filter condition" + SumOfSalary);


        List<Integer> it = empList.stream().map(emp -> emp.getSal() * 2)
                .collect(Collectors.toList());

        System.out.println("After Increment Salary by 100%");
        it.stream().forEach(t -> System.out.println(t.intValue()));

        List<Employee> list1 = TestUtil.getEmployeeList().stream().filter(t -> ((String.valueOf(t.getSal())).startsWith("2")))
                .collect(Collectors.toList());
        System.out.println("Salary starts with 2: " + list1.get(0).getSal());


        System.out.println("::before Increment Salary by 100%::");
        empList.forEach(emp -> System.out.println(emp.getName() + " " + emp.getSal()));

        List<Employee> updated = empList.stream().map(emp -> {
            emp.setSal(emp.getSal() * 2);
            return emp;
        }).collect(Collectors.toList());
        System.out.println("::After Increment Salary by 100%::");
        updated.forEach(emp -> System.out.println(emp.getName() + " " + emp.getSal()));
    }
}
