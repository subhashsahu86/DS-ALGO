package com.subh.practice.linkedList;

public class linkedList {
    Node head = null;
    Node tail = null;

    void insertAtEnd(int val){

        Node temp = new Node(val);

        //if list is empty
        if(head == null){
            head = temp;
        }
        else{
            tail.next = temp;

        }
        tail = temp;
    }

    void display(){
        if(head == null){
            return;
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    void insertAtBegin(int val){
        Node temp = new Node(val);

        if(head== null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }

    void insertAt(int idx, int val){
        Node temp = new Node(val);
        Node t = head;
        for(int i=0; i<=idx-1; i++ ){
            t = t.next;
        }
        
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }


    }

}
