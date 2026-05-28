package com.subh.practice.linkedList;

public class BasicsOfLL {

    public static void displayR(Node head) {
        //print the LL through recursively
        if (head == null)
            return;
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    public static void reversedLL(Node head) {
        if (head == null)
            return ;

        reversedLL(head.next);
        System.out.print(head.data + " ");
    }


    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }


    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(5);
        Node d = new Node(30);


        a.next = b;
        b.next = c;
        c.next = d;

        int size =0;
        Node temp = a;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            size++;
        }
        System.out.println();
        System.out.println("size " + size);

        displayR(a); //display recursively
        System.out.println();

        reversedLL(a); // display reversed list with reccursion
        System.out.println(a.data);



    }





}

