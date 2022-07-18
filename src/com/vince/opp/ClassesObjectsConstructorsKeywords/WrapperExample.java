package com.vince.opp.ClassesObjectsConstructorsKeywords;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

        Integer num = 45;


//        final   int bonus = 2;
//       bonus = 3;
        A vince = new A("Vince Kayz");
        vince.name = "ohter fance name";

        //when a non primitive is final, you cannot reasign it.
//        vince = new A("new object");

    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destoyed");
    }
}
class A {
    final  int num = 10;
    String name;
    public A(String name) {
        this.name = name;
    }
}

