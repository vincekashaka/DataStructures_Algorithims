package com.vince.opp.abstractClass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(24);
        son.career();

        son.normal();

        Daughter daughter = new Daughter(21);
        daughter.career();

        Parent.hello();


    }
}
