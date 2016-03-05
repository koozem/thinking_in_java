package ru.kiskiny.koozem.chapter03.task04;

import java.util.Random;
import static net.mindview.util.Print.print;

public class SpeedCalculation {

    public static void main(String[] args) {
        Random rand = new Random();
        int s, t;
        float v;

        s = rand.nextInt(1000);
        t = rand.nextInt(100);
        v = s/t;
        print("S = " + s + "\n" + "T = " + t + "\n" + "V = " + v);


    }
}
