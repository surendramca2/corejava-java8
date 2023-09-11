package com.surendra.java.Array;

import com.surendra.java.Java8.EmployeeClass;


import java.util.*;
import java.util.stream.Collectors;

/**
 *
 1. Find all employees object whose salary is > 5000.
 2. Collect all employee’s names in one list, who have salary >5000.
 3. Find employee’s name who has min salary.
 4. Group by all employees object based on dept.
 5. Sort the list based on salary.
 6. Find out all employee’s mobile numbers in single List.
 */
public class EmployeeJava8Example {

    public static void main(String[] args) {
        //id ,name , salary, List<phoneNo>.

        List<EmployeeClass> empList = new ArrayList<>();

        empList.add(new EmployeeClass(1,"Rajesh","IT",5000.00, Arrays.asList("987655555","9876433","76543444")));
        empList.add(new EmployeeClass(1,"Suresh","MS",1500.00, Arrays.asList("287655555","9876433","76543444")));
        empList.add(new EmployeeClass(1,"Ramesh","DT",4000.00, Arrays.asList("387655555","9876433","76543444")));
        empList.add(new EmployeeClass(1,"Dinesh","NS",12000.00, Arrays.asList("4987655555","9876433","76543444")));
        empList.add(new EmployeeClass(1,"Rakesh","JT",2000.00, Arrays.asList("587655555","9876433","76543444")));
        empList.add(new EmployeeClass(1,"Mahesh","JT",8000.00, Arrays.asList("687655555","9876433","76543444")));
        empList.add(new EmployeeClass(1,"Mukesh","IT",6000.00, Arrays.asList("787655555","9876433","76543444")));

        printEmp(empList);
        printEmpNameSalaryGt5000(empList);
        printEmpNameHaveMinSalary(empList);
        printAllEmpBasedOnDepartment(empList);
        printSortListOnSalary(empList);
        printMobileNo(empList);
    }

    /**
     *  Find all employees object whose salary is > 5000.
     * @param employeeClassList
     */
    private static void printEmp(List<EmployeeClass> employeeClassList){

        List<EmployeeClass> list = employeeClassList.stream().filter(emp->emp.getSalary()>5000).collect(Collectors.toList());


    }

    /**
     * Collect all employee’s names in one list, who have salary >5000.
     * @param employeeClassList
     * @return
     */
    private static List<String> printEmpNameSalaryGt5000(List<EmployeeClass> employeeClassList){

    List<String> list =     employeeClassList.stream().filter(s->s.getSalary()>5000).map(s->s.getName()).collect(Collectors.toList());
        System.out.print(list);
    return list;
    }

    /**
     * Find employee’s name who has min salary.
     * @return
     */
    private static void printEmpNameHaveMinSalary(List<EmployeeClass> employeeClassList){

        double minSalary = employeeClassList.stream().min(Comparator.comparing(s->s.getSalary())).map(s->s.getSalary()).get();
        System.out.println("minimum salary "+ minSalary);
        String empNameHaveMinSal =  employeeClassList.stream().min(Comparator.comparing(s->s.getSalary())).stream().map(s->s.getName()).findFirst().get();
        System.out.println("Emp name have min Salary -> "+empNameHaveMinSal);

        // get the minimum salary employee object
        EmployeeClass emp = employeeClassList.stream().collect(Collectors.groupingBy(s->s.getSalary(), TreeMap::new,Collectors.toList()))
                .firstEntry().getValue().get(0);
            System.out.println(emp.getName()+ " "+ emp.getSalary());
         // Get the sorted map based on the salary
        Map<Double, List<EmployeeClass>> map = employeeClassList.stream().collect(Collectors.groupingBy(s->s.getSalary(), TreeMap::new,Collectors.toList()));
    }

    /**
     * Group by all employees object based on dept.
     */
    private static void printAllEmpBasedOnDepartment(List<EmployeeClass> employeeClasses){

        Map<String , List<EmployeeClass>> map =employeeClasses.stream().collect(Collectors.groupingBy(s->s.getDepartment()));

       Iterator it =  map.keySet().iterator();
       while (it.hasNext()){
        Object obj = it.next();
         System.out.println(obj+" "+ map.get(obj));
     }
    }

    /**
     *  Sort the list based on salary.
     */
    private static void printSortListOnSalary(List<EmployeeClass> employeeClasses){
       List<Double>  sortedSalary =  employeeClasses.stream().map(s->s.getSalary()).sorted().collect(Collectors.toList());
        System.out.println("sorted salary " + sortedSalary);
    }
    /**
     *
     * @param employeeClassList
     */
    private  static void printMobileNo(List<EmployeeClass> employeeClassList){

        employeeClassList.stream().flatMap(employeeClass -> employeeClass.getPhoneNo().stream()).forEach(System.out::println);
    }
}
