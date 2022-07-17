package OPP.PackagesStaticSingletonClass;

public class SubSubclass extends Subclass {

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(12, "VInce");
        int n = obj.num;
    }
}
