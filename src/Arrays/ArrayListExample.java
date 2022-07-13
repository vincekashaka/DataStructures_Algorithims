package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//         list.add(3474);
//         list.add(74);
//         list.add(344);
//         list.add(34);
//         list.add(37);
//         list.add(474);
//         list.add(44);

//        System.out.println(list.contains(44));
//
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here,
        }
        System.out.println(list);
    }
}
