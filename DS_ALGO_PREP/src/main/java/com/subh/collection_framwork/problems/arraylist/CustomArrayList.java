package com.subh.collection_framwork.problems.arraylist;

public class CustomArrayList<E> {

   private int size;
   private int capacity;
   private static final int DEFAULT_CAPACITY = 10;

   Object[] objArray;

    public CustomArrayList(int initialCapacity){

        if(initialCapacity > 0){
            this.objArray = new Object[initialCapacity];
            size = 0;
            capacity = DEFAULT_CAPACITY;
        }

    }

    public CustomArrayList(){
        this.objArray = new Object[DEFAULT_CAPACITY];
        size = 0;
        capacity = DEFAULT_CAPACITY;
    }



    public void add(E e){

        if (size < capacity){
            objArray[size] = e;
            size++;
        }

    }


}
