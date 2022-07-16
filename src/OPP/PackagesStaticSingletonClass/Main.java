package OPP.PackagesStaticSingletonClass;

public class Main {
    public static void main(String[] args) {
        Human vincent = new Human(22, "Vincent Kashaka", 1000, false);
        Human peter= new Human(25, "Peter Johns", 500, true);

//        System.out.println(vincent.salary);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
    }

    // this is not independent
    static void fun() {
//        greeting(); // you can not use this because it requires an instance
        // but the function you are using it in does not depend on intances

        // you can not access non static stuff without referencing their instances in
        // a static context

        // hence, here i am referencing it
        Main obj = new Main();
        obj.greeting();

    }
    void fun2(){
        greeting();
    }
    // we know that something which is not static, belongs to an object
    void greeting() {
        System.out.println("hello boy");
    }
}
