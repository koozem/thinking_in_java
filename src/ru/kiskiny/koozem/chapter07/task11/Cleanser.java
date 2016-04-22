package ru.kiskiny.koozem.chapter07.task11;

class Cleanser {

    private String s = "Cleanser";

    void append(String a) {
        s += a;
        System.out.println("app");
    }

    void dilute() {
        append(" dilute()");
        System.out.println("X");
    }

    void apply() {
        append(" apply()");
        System.out.println("y");
    }

    void scrub() {
        append(" scrub()");
        System.out.println("z");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        x.scrub();
        System.out.println(x);
    }
}
