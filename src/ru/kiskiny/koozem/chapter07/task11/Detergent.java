package ru.kiskiny.koozem.chapter07.task11;


public class Detergent {
    private String s = "Cleanser";
    private Cleanser clean = new Cleanser();

    void append(String a) {
        clean.append(s += a);
    }
    void dilute() {
        clean.dilute();
    }
    void apply(){
        clean.apply();
    }
    void scrub() {
        clean.scrub();
    }
    public void f(){
        append(" foam()");
    }
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.f();
        System.out.println(x);
        System.out.println("And now check the base class");
        Cleanser.main(args);
    }
}

