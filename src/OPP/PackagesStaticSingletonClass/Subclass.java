package OPP.PackagesStaticSingletonClass;

import OPP.AccessControl.A;

public class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(12, "VInce");
        int n = obj.num;
    }
}

