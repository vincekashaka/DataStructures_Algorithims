package com.vince.opp.PackagesStaticSingletonClass;

// outside classes can not be static
public class InnerClasses {
     static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

         @Override
         public String toString() {
             return name;
         }
     }

    public static void main(String[] args) {
        Test a = new Test("Vince");
        Test b = new Test("Todd");
//
//        System.out.println(a.name);
//        System.out.println(b.name);
        System.out.println(a);
    }
}
