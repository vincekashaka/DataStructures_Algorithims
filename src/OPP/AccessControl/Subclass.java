package OPP.AccessControl;

public class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(33, "Vince");
        int n = obj.num;
    }
}
