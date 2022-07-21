package com.vince.linkedList.singly;


public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(11);
        list.insertFirst(8);

        list.insertLast(40);

        list.insert(77, 3);

        list.display();

        list.insertRec(44, 2);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

//        System.out.println(list.get(2));



    }
}
