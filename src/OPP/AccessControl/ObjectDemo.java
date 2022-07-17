package OPP.AccessControl;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }
    // will go in detail
    @Override
    public int hashCode() {
        return super.hashCode();
//        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(32);
//        ObjectDemo obj2 = new ObjectDemo(32);
        ObjectDemo obj2 = obj;

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}
