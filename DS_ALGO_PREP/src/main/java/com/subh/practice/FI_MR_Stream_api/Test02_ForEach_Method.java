package com.subh.practice.FI_MR_Stream_api;

import java.util.LinkedHashSet;

public class Test02_ForEach_Method {

    public static void main(String[] args) {

        //Problem : write a program to retrive the objects from LHS by using the forEach() method

        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Subhash");
        names.add("Ram");
        names.add("Shyam");
        names.add("Praveen");
        names.add("Ananth");
        names.add("Ashok");

        names.forEach(obj -> System.out.println(obj.toUpperCase()));
    }
}
