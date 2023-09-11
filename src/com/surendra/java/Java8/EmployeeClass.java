package com.surendra.java.Java8;

import java.util.List;

public class EmployeeClass {

    private int id;

    private  String name ;
    private  double salary;

    private  String department;

    private List<String> phoneNo;

    public  EmployeeClass (int id, String name ,String department, double salary, List<String> phoneNo){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary= salary;
        this.phoneNo = phoneNo;
    }
    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<String> phoneNo) {
        this.phoneNo = phoneNo;
    }
}
