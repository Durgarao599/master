package MapVsFlatMap;

import Utility.TestUtil;
import modal.Employee;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class
EmpMap {

    public static void main(String[] args) {

        List<Employee> employees = TestUtil.getEmployeeList();

        List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);

       Map<String, Employee> map=  employees.stream().collect(Collectors.toMap(Employee::getName,Function.identity()));

        System.out.println("map.get(Laxmi) "+map.get("Laxmi").getAge());

        Map<String,String> listToMap=    employees.stream().collect(Collectors.toMap(Employee::getName,Employee::getGender));

        listToMap.forEach((k, v) -> {
            System.out.println("Gender "+ v +"  Name "+ k);
        });

        Map<String,Employee> listToMap2=    employees.stream().collect(Collectors.toMap(Employee::getName, Function.identity()));



        listToMap2.forEach((k, v)->{

            System.out.println("List to Map:: ");

            System.out.println( k + "Value "+ v.getGender() +", " + v.getSal());
        });

        System.out.println("List to Map:: " +listToMap2);

       Map<Employee, Set<Employee>> listToMap1= employees.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.toSet()));


      List<String> empNames=   employees.stream().map(Employee::getName).collect(Collectors.toList());

      System.out.println(empNames);

        List<Employee> list = employees.stream()
                .map(employee -> {
                    employee.setSal(employee.getSal() * 2);
                    return employee;
                }).collect(Collectors.toList());

        System.out.println(list);

        list.forEach((e)->{
       //     System.out.println("List to Map:: ");
            System.out.println(  "Value "+ e.getName() +", " + e.getSal());
        });


    List<Employee> empList=     employees.stream().filter(emp ->emp.getName().equals("Durga"))
        .map(employee ->{
            employee.setSal(employee.getSal()*2);
            return employee;
        }).limit(2).toList();

      //      .collect(Collectors.toList());


         System.out.println("List to Map:: ");
        empList.forEach((e)->{

            System.out.println(  "Value "+ e.getName() +", " + e.getSal());
        });
    }
}
