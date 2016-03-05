package ru.kiskiny.koozem.chapter03.task02;

import static net.mindview.util.Print.print;

public class Main {

    public static void main(String[] args) {

        //упр. 2
        Aliasing A_1 = new Aliasing();
        Aliasing A_2 = new Aliasing();

        A_1.number = 5.12f;
        A_2.number = 10.3f;
        print(String.valueOf("1: " + A_1.number) + "  2: " + String.valueOf(A_2.number));

        A_1.number = A_2.number;
        print(String.valueOf("1: " + A_1.number) + "  2: " + String.valueOf(A_2.number));

        A_1.number = 35.9f;
        print(String.valueOf("1: " + A_1.number) + "  2: " + String.valueOf(A_2.number));

        A_1 = A_2;
        print(String.valueOf("1: " + A_1.number) + "  2: " + String.valueOf(A_2.number));

        A_1.number = 4.35f;
        print(String.valueOf("1: " + A_1.number) + "  2: " + String.valueOf(A_2.number));

        A_2.number = 1f;
        print(String.valueOf("1: " + A_1.number) + "  2: " + String.valueOf(A_2.number));
    }

}
