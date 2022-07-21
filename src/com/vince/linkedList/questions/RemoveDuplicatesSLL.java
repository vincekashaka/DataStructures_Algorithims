package com.vince.linkedList.questions;

import com.vince.linkedList.singly.LL;

public class RemoveDuplicatesSLL {

    private int size;
    private Node head;
    private Node tail;

    public RemoveDuplicatesSLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new  Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp !=null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void duplicates(){
        Node node = head;

        while (node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    public static RemoveDuplicatesSLL merge(RemoveDuplicatesSLL first,
                                            RemoveDuplicatesSLL second){
        Node f = first.head;
        Node s =  second.head;

        RemoveDuplicatesSLL ans = new RemoveDuplicatesSLL();

        while (f != null && s != null){
            if (f.value < s.value){
                ans.insertFirst(f.value);
                f = f.next;
            } else {
                ans.insertFirst(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertFirst(f.value);
            f = f.next;
        }

        while (s != null){
            ans.insertFirst(s.value);
            s = s.next;
        }

        return ans;


    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesSLL first = new RemoveDuplicatesSLL();
        RemoveDuplicatesSLL second = new RemoveDuplicatesSLL();

        first.insertFirst(5);
        first.insertFirst(3);
        first.insertFirst(1);

        second.insertFirst(14);
        second.insertFirst(9);
        second.insertFirst(2);
        second.insertFirst(1);

        first.display();
        second.display();

        merge(first, second).display();



    }
}
