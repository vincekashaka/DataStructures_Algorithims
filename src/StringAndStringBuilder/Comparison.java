package StringAndStringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "Vincent";
        String b = "Vincent";
        String c = a;
//        System.out.println(c == a);
//        System.out.println(a == b);
        String name1 = new String("Vince");
        String name2 = new String("Vince");

//        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
