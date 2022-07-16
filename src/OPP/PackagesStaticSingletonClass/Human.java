package OPP.PackagesStaticSingletonClass;

public class Human {
    int age;
    String name;
    int salary;
    static long    population;
    boolean married;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }
}
