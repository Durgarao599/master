import Utility.TestUtil;
import modal.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CountMaleFemale {

    public static void main(String[] args) {

        List<Employee> empList = TestUtil.getEmployeeList();

        // Define a map to store the count of male and female employees

        Map<String, Long> noOfMaleAndFemaleEmployees = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));


           //  noOfMaleAndFemaleEmployees = empList.stream()
             //   .collect(Collectors.groupingBy(emp->emp.getGender(), Collectors.counting()));


        Map<String, List<Employee>> noOfMaleAndFemaleEmployees1 = empList.stream()

                .collect(Collectors.groupingBy(Employee::getGender, Collectors.toList()));

// Print the count of male and female employees

        System.out.println("Count of male and female employees present in the organization:: \n" + noOfMaleAndFemaleEmployees);


        Comparator<Employee> bySalary = Comparator.comparing(Employee::getSal);

        List<Employee> list = empList.stream().sorted(bySalary).collect(Collectors.toList());

        System.out.println(":::::Displaying the employee details by sorted order:::::::::::::");
        list.forEach(t -> System.out.println(t.getName() + " " + t.getSal()));

        Optional<Employee> emp = empList.stream().collect(Collectors.reducing(BinaryOperator.maxBy(bySalary)));
        System.out.println("::::: employee highest salary ::::::::::::");
        System.out.println(emp.get().getName() + " " + emp.get().getSal());
        Map<String, Optional<Employee>> collect =
                empList.stream().collect(
                        Collectors.groupingBy(
                                Employee::getGender,
                             //   Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSal)))
                                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(empl->empl.getSal())))
                        )
                );


        System.out.println(":::::::::::::::::::::");
        collect.entrySet().stream().forEach(System.out::println);
        System.out.println("::::::::::::::tttttttttttttt:::::::");
        System.out.println(":::::::::highest salay by gender wise:::::::::::::::::::::");
        collect.entrySet().stream().forEach(t -> System.out.println(t.getValue().get().getName() + " " + t.getValue().get().getSal()));
    }


}
