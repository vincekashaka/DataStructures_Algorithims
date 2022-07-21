package com.vince.opp.cloning;

import java.awt.image.VolatileImage;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human vince = new Human(30, "Vincent Kashaka");
//        Human twin = new Human(vince);
        Human twin = (Human) vince.clone();
        System.out.println(twin.age + " " );
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));

        System.out.println(Arrays.toString(vince.arr));

    }
}
