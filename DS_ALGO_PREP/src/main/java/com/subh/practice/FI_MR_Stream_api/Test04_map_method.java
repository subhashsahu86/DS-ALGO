package com.subh.practice.FI_MR_Stream_api;

import java.util.List;

public class Test04_map_method {
    public static void main(String[] args) {

        //map() method transform each value from collection and give the new value/ Stream
        // returned values elements return type is apply return type
        // It uses the Function FI
        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);

        List<Object> elements = List.of("A", "N", 12, 45, 9, "G", 3, 6, 10.5, true, "Ram", "Naresh");

        elements.stream()   // stream with Object type and elements are also type of Object
                .map(obj -> obj.toString()) // all the List<Object> elements converted/Transform into String type
                .forEach(obj -> System.out.println( obj + " subh")); //  all the String elements concet with Subh

        System.out.println("=============================================================");

        elements.stream()
                .map(ele -> 5)
                .forEach(System.out::println);

        System.out.println("=============================================================");

        // Problem : Retrive only Strings, print them in upper case
        elements.stream()  //all objects
                .filter(obj -> obj instanceof  String) // only String objects
                .map(obj -> obj.toString()) //converting String Objects into String Literal
                .forEach(obj -> System.out.println(obj.toUpperCase())); // printing in UpperCase

        System.out.println("=============================================================");


        elements.stream()
                .filter(obj -> obj instanceof String)
                        .map(obj -> obj.toString().toUpperCase())//converting object into String and uppercaseing
                                .forEach(System.out::println);

//Note : if we don't apply the filter method then all the objects will come and change into String

        System.out.println("=============================================================");

        // Retrive only Integers and return those integer as int type and 10 in each int value

        elements.stream()
                .filter(obj -> obj instanceof Integer)
               // .map(obj -> ((Integer) obj).intValue() + 10 )
                .map(ele -> ((int)ele ) + 10 )
                .forEach(System.out::println);

        System.out.println("=============================================================");



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

        // Retrive Each Student name and print

        students.stream()
                .map(student -> student.getName())
                .forEach(System.out::println);

        System.out.println("=============================================================");


        // Retrive Each Student name and print in the upper case
        students.stream()
                .map(student -> student.getName().toUpperCase()) //all students
                .forEach(System.out::println); // only return student name

        System.out.println("=============================================================");

        // Retrive only Core Java Students name
        students.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase("Core Java")) //only core java students
                .map(student -> student.getName()) // only return student name
                .forEach(System.out::println);




    }
}
