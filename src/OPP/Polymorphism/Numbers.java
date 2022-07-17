package OPP.Polymorphism;

public class Numbers {

    double sum(double a , int b){
        return a + b;
    }

    int sum(int a , int b){
        return a + b;
    }

    int sum(int a , int b, int c){
        return a + b - c;
    }

    public static void main(String[] args) {
        Numbers number = new Numbers();

        number.sum(2, 4);
        number.sum(4, 6, 2);

//        number.sum(2, 4, 5, 6)
    }
}
