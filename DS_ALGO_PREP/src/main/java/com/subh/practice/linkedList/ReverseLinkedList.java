package com.subh.practice.linkedList;

public class ReverseLinkedList {

    /*
    Problem : reverse the given the LL and return the head.
     */
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;

        while(curr!= null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }



    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        a.next = b;
        b.next = c;

      Node head =  reverseLL(a);

        System.out.println(head.data);

    }
}
