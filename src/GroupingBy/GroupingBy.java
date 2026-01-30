package GroupingBy;

import Utility.TestUtil;
import modal.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {

        List<Employee> employees = TestUtil.getEmployeeList();

    // Group employees by age using Stream API

        Map<Integer, Long> empByAge = employees.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));

        List<Employee> employeesMale  = employees.stream().filter(e ->e.getGender().equals("M"))
                .collect(Collectors.toList());

        employeesMale.stream().forEach(t->System.out.println( t.getGender() +" Name " +t.getName()));

        Map<String, Long> empByName = employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        Map<String, Long> empByGender = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        empByAge.forEach( (k,v) -> System.out.println("Age " +k +" " +v));

        empByGender.forEach( (k,v) -> System.out.println("empByGender " +k +" " +v));

// Print the grouped employees

        System.out.println("Employees grouped by age :: \n" + empByAge);

        // Count sal where >10000
        Map<Integer, Long> count = employees.stream().filter(t -> t.getSal() > 10000).collect(Collectors.groupingBy(Employee::getSal, Collectors.counting()));

        System.out.println("count Sal >10000 :: \n" + count);

        System.out.println("Count Number of employees whose sal >10000:::"+employees.stream().filter(t -> t.getSal() > 10000)
                .count());


        System.out.println("Get Number of employees whose sal >10000:::"+employees.stream().filter(t -> t.getSal() > 10000)
                .collect(Collectors.toList()));

     employees.stream().filter(t -> t.getSal() > 10000)
                .collect(Collectors.toList()).forEach(t ->System.out.println(t.getName()));

        Map<String, List<Employee>> test =     employees.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.toList()));

        test.forEach((k,v) ->{
            System.out.println("KEY:: \n" + k +" Employee details" +v);
        });
    }
}
