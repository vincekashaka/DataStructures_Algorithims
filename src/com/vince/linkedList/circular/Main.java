package com.vince.linkedList.circular;

public class Main {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(8);
        list.insert(9);
        list.insert(2);
        list.insert(7);
        list.insert(11);

        list.display();
        list.delete(2);
        list.display();
    }
}
