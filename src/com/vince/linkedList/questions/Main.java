package com.vince.linkedList.questions;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicatesSLL list = new RemoveDuplicatesSLL();

        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(3);

        list.display();
      list.duplicates();
        list.display();
    }
}
