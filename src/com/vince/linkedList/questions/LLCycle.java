package com.vince.linkedList.questions;


import java.util.List;

public class LLCycle {
    //Find cycle
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    // find the length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode temp = slow;
                int length  = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    // find where the cycle starts
    public ListNode detectCycle(ListNode head){
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                length =  lengthCycle(slow);
                break;
            }
            if (length == 0){
                return null;
            }
        }
        // Find the start using 2 pointers
         ListNode f = head;
        ListNode s = head;

        while (length > 0){
            s = s.next;
            length--;
        }
        //keep moving both s & f forward, tey will meet at cycle start
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;

    }

    private class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

}
