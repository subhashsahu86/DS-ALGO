package com.subh.leetcode.linkedList;

public  class Prob237_DeleteNode {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int x){
            this.val = x;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(7);

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(6);


        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;


//System.out.println(node1.val);
        displayNodes(node);

     //   deleteNode(node1);
      //  System.out.println(node1.val);

        deleteMiddle(node);

        displayNodes(node);






    }

    public static void deleteNode(ListNode node){

        ListNode prev = null;

        while(node.next != null){
            node.val = node.next.val;
            prev = node;
            node = node.next;

        }
        prev.next = null;

    }

    public static void displayNodes(ListNode node){
            ListNode temp = node;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void deleteMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = slow;

        while(fast.next != null && fast.next.next != null){
            prev = slow;
            slow = slow.next;

            fast = fast.next.next;
        }

        prev.next = slow.next;
    }
}
