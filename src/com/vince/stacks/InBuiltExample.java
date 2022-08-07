package com.vince.stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(6);
        stack.push(7);
        stack.push(50);
        stack.push(4);
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();

        queue.add(4);
        queue.add(24);
        queue.add(14);
        queue.add(44);
        queue.add(43);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
