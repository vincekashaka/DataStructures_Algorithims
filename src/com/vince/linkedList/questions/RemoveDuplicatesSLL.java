package com.vince.linkedList.questions;

import com.vince.linkedList.singly.LL;

import javax.management.NotificationEmitter;
import java.util.List;

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
    // find a Happy number
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        } while (slow != fast);

        if (slow == 1){
            return true;
        }
        return false;
    }

    // find the sqr of a number
    private int findSquare(int number){
        int ans = 0;
        while (number > 0){
            int rem = number % 10;
            ans += rem  * rem;
            number /=10;
        }
        return ans;
    }

    // Find middle of a linkedlist
    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Revers a linkedlist part1 Google, Microsoft, Facebook
    public Node reverseList(Node head){
        if (head == null){
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null){
                next = next.next;
            }
        }
        return prev;

    }
    public Node revereBetween(Node head, int left, int right){
        if (left == right){
            return head;
        }

        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left -1 ; i++) {
            prev = current;
            current = current.next;
        }
        Node last = prev;
        Node newEnd = current;

        // reverse between left and right
        Node next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }

        if (last != null){
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

    //Reverse nodes in k- group
    public Node reversKGroup(Node head, int k){
        if (k <=1 || head == null){
            return head;
        }
        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;

        while (true) {
            Node last = prev;
            Node newEnd  = current;

            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k ; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
            }
            if (last != null){
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;

            if (current == null){
                break;
            }
            prev = newEnd;
        }
            return head;
    }

    //Rever alternateKGroup
    //Reverse nodes in k- group
    public Node reverseAlternateKGroup(Node head, int k){
        if (k <=1 || head == null){
            return head;
        }
        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node last = prev;
            Node newEnd  = current;

            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k ; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
            }
            if (last != null){
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;
            //skip the k nodes
            for (int i = 0; current != null && i < k ; i++) {
                prev = current;
                current = current.next;
            }

        }
        return head;
    }
    // Rotate Right given k = 2
    public Node rotateRight(Node head, int k){
        if (k <= 0 || head == null || head.next == null){
            return head;
        }
        //finding the tail/ last node
        Node last =  head;
        int length = 1;
        while (last.next != null){
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;

        Node newLast = head;
        for (int i = 0; i < skip -1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }


    // Determine if the  list is palindrome
    public  boolean isPalindrome(Node head){
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid);
        Node rereverseHead = headSecond;

        // compare both halves
        while (head != null && headSecond != null){
            if (head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        if (head == null || headSecond == null) {
            return true;
        }
        return false;
    }

    // ReorderList Facebook, Google question

    public void reorderList(Node node){
        if (head == null || head.next == null){
            return;
        }

        Node mid = middleNode(head);

        Node headSecond = reverseList(mid);
        Node headFirst = head;

        //rearange
        while (headFirst != null && headSecond != null){
            Node temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        // next tail to null
        if (headFirst != null){
            headFirst.next = null;

        }
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
