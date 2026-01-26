package com.subh.practice.FI_MR_Stream_api;

class Employee {
    private int empId;
    private String name;
    private double salary;
    private String dept;

    // Constructor
    public Employee(int empId, String name, double salary, String dept) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    // Setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee(ID: " + empId + ", Name: " + name +
                ", Salary: $" + salary + ", Dept: " + dept + ")";
    }
}



