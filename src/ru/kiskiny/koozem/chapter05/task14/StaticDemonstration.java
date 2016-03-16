package ru.kiskiny.koozem.chapter05.task14;

public class StaticDemonstration {
    static String s, g;
    static {
        g = "zem";
    }

    static void printing(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        s = "koo";
        printing(s);
        printing(g);
    }
}
