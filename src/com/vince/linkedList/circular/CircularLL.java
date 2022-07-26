package com.vince.linkedList.circular;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
            if(head == null){
                head = node;
                tail = node;
                return;
            }
            tail.next = node;
            node.next = head;
            tail = node;
        }

        //display
        public void display(){
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
        } while (node != head);
            System.out.println("HEAD");
        }
    }

    public void  delete(int val){
        Node node = head;
        if (node == null){
            return;
        }
        if (node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node target = node.next;
            if (target.val == val){
                node.next = target.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }



    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
