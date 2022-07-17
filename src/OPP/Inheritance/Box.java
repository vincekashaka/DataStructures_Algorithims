package OPP.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    static void greeting() {
        System.out.println("Hey I am in Box class");
    }

    Box () {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
        // Cube
        Box (double side) {
            this.w = side;
            this.l = side;
            this.h = side;
        }

        Box (double l, double w, double h) {
            System.out.println("Box class constructor");
            this.l = l;
            this.h = h;
            this.w = w;
        }

        Box(Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
        }

        public void information () {
            System.out.println("Run the box");
        }
}

