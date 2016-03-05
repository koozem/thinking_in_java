package ru.kiskiny.koozem.chapter03.task03;

import static net.mindview.util.Print.print;
import static ru.kiskiny.koozem.chapter03.task03.PassObject.pas;

public class CombinationInMethods {

    public static void main(String[] args) {

        //упр. 3
        FloatNumber fl = new FloatNumber();
        fl.f = 2.8f;
        print("1: " + fl.f);

        pas(fl);
        print("2: " + fl.f);

    }

}
