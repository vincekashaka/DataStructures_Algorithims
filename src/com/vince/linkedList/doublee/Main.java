package com.vince.linkedList.doublee;

public class Main {
    public static void main(String[] args) {

        DoubleLL list = new DoubleLL();

        // inserting
        list.insertFirst(12);
        list.insertFirst(51);
        list.insertFirst(31);
        list.insertFirst(4 );
        list.insertLast(34);
        list.insert(31, 3);

        list.display();


    }
}
