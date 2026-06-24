package com.subh.leetcode.linkedList;

public class Prob142_LLCycle {



    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(0);
        Node node4 = new Node(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

      Node result =  detectCycle(node1);

        System.out.println(result.val);




    }

    public static Node detectCycle(Node head){
        Node slow = head;
        Node fast = head;

        if(fast.next == null ){
            return null;
        }

        slow = slow.next;
        fast = fast.next.next;

        while(slow != fast ){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow == fast){
            fast = head;
        }
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
