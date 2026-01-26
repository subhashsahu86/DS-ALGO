package com.subh.practice.FI_MR_Stream_api;

import java.util.List;

public class Test03_Filter_method {

    /*filter() method is used for returns a new stream consisting
    of this stream that match a given predicate or condition.
    * */

    public static void main(String[] args) {
        //Problem: Return only Even Integer No from a List that containing different type of object

        List<Object> elements = List.of("A", "N", 12, 45, 9, "G", 3, 6, 10.5, true, "Ram", "Naresh");

        elements.stream()
                .filter((obj) -> obj instanceof Integer ) //returning only the Integer objects
                .filter(obj -> ((Integer)obj) % 2==0) // Parsing the Integer Object into Integer and filter only Even Integer
                .forEach(System.out::println); // Printing all the filtered objects

        //Problem: Return only String Values from a List that containing different type of object

        elements.stream()
                .filter(obj -> obj instanceof String)
                .forEach(System.out::println);

        //filter method with custom objects

        //create list of students
        List<Student> students = List.of(
                new Student(101, "Ashok",  3500.0,"Core Java"),
                new Student(102, "Naresh", 5000.0,"Python"),
                new Student(103 ,"Kshitij",3000.0,"Full Stack"),
                new Student(104, "Ananth", 9000.0,"Core Java"),
                new Student(105, "Archana",5000.0,"Python"),
                new Student(106, "Dilip",  7000.0,"Core Java"),
                new Student(107, "Subhash",8000.0,"SQL")
        );

        //Problem : Retrive all the students

        students.stream()
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //problem retrive only core Java students
        students.stream()
                .filter(student -> (student.getSubject()).equalsIgnoreCase("Core Java"))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //Problem : retrive only core java students who did not paid full fee
        students.stream()
                .filter(student -> (student.getSubject()).equalsIgnoreCase("Core Java"))
                .filter(student -> (student.getFee())<9000.0)
                .forEach(System.out::println);
    }

}
