package Utility;

import modal.Employee;

import java.util.ArrayList;
import java.util.List;

public class TestUtil {

    public static List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<Employee>();
        Employee Jashwin = new Employee("Jashwin", 7, 100000, "M");
        Employee Jithin = new Employee("Jithin", 3, 100000, "M");
        Employee Laxmi = new Employee("Laxmi", 12, 10000, "F");

        Employee Harsh = new Employee("Harsh", 2, 20000, "M");
        Employee Durga = new Employee("Durga", 37, 150000, "M");
        Employee Kumari = new Employee("Kumari", 58, 100100, "F");


        employees.add(Jashwin);
        employees.add(Jithin);
        employees.add(Laxmi);
        employees.add(Harsh);
        employees.add(Durga);
        employees.add(Kumari);

        return employees;
    }

}
