package GroupingBy;

import Utility.TestUtil;
import modal.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class GenderWiseHighestSal {

    public static void main(String[] args) {

        List<Employee> empList = TestUtil.getEmployeeList();

        System.out.println("Second Largest Number in Employee::::" + empList.stream().map(Employee::getSal).sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get());

// Departmernt wise highest salary
        Map<String, Employee> topEmployees =
                empList.stream()
                        //.sorted(Comparator.comparing(Employee::getSal)).limit(1).findFirst().get();
                        .collect(Collectors.toMap(
                                e -> e.getGender(),
                                e -> e,
                                BinaryOperator.maxBy(Comparator.comparingInt(e -> e.getSal()))
                        ));

        topEmployees.forEach((K, V) -> System.out.println(K + ", Employee Name :" + V.getName() + ", Salary :" + V.getSal()));
        System.out.println(":::::::::::::::::::::::::::::::::::::::");

        Map<String, Employee> mapEmployees =
                empList.stream()
                        .collect(Collectors.toMap(
                                e -> e.getGender(),
                                e -> e,
                                BinaryOperator.maxBy(Comparator.comparing(Employee::getSal))
                        ));


        mapEmployees.forEach((K, V) -> System.out.println(K + ", Employee Name :" + V.getName() + ", Salary :" + V.getSal()));

        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        Employee emp = empList.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).limit(1).findFirst().get();

        System.out.println("Largest emp in the list::::" + emp.getName() + ": " + emp.getSal());

        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        Integer largestSalary = empList.stream().map(Employee::getSal).sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("largestSalary::::::" + largestSalary);

        Employee maxEmp = empList.stream().max(Comparator.comparing(Employee::getSal)).get();

        Employee minEmp = empList.stream().min(Comparator.comparing(Employee::getSal)).get();



        System.out.println("max getSal ::::::" + maxEmp.getSal() + "  max getSal "+ minEmp.getSal());
       List<Employee> l= empList.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).collect(Collectors.toList());


        System.out.println("Sorted getSal ::::::" + l);

        Map<String, Optional<Employee>> collect =
                empList.stream().collect(
                        Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSal)))
                        )
                );


    }
}
