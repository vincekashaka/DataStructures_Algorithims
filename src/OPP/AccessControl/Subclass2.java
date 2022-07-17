package OPP.AccessControl;

import OPP.PackagesStaticSingletonClass.Subclass;

public class Subclass2 extends  A {
    public Subclass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
         Subclass obj = new Subclass(12, "VInce");
        int n = obj.num;
    }
}
