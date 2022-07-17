package OPP.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4, 6, 7);
//        System.out.println(box.l + " " + box.w + " " + box.h);
//        BoxWeight box = new BoxWeight();
        BoxWeight box1 = new BoxWeight(2, 3, 4, 5);
//        System.out.println(box.l + " " + box.weight);

//        Box box2 = new BoxWeight(2, 3, 4, 5 );
//        System.out.println(box2.w);

        // thee are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e Boxweight
        // hence, you should have access to weight variable
        // this also means the ones you are trying to access should be initialised
        // but when the object itself is of type parent class, how wil you call the constructor
        // you cant have a child reference variable and a parent object, hence error.
//        BoxWeight box3 =new Box(2, 3, 4);
//        System.out.println(box3);

//        BoxPrice box = new BoxPrice(3, 5, 600);

        Box.greeting();

    }
}
