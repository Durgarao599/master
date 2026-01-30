package sort;

import Utility.TestUtil;
import modal.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingTwice {

    public static void main(String[] args) {

        List<Employee> empList = TestUtil.getEmployeeList();

        List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(Employee::getSal).thenComparing(Employee::getName)).collect(Collectors.toList());

        for (Employee e : sortedList) {
            System.out.println(e.getSal() + " " + e.getName());
        }

    }
}
