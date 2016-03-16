package ru.kiskiny.koozem.chapter05.task13;

import static net.mindview.util.Print.print;

public class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups(){

        print("Cups()");
    }
}
