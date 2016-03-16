package ru.kiskiny.koozem.chapter05.task13;

import static net.mindview.util.Print.print;

public class ExplicitStatic {
    public static void main(String[] args) {
        print("Inside main");
        Cups.cup1.f(99);
    }
    // static Cups cups1 = new Cups();
    // static Cups cups2 = new Cups();

}
