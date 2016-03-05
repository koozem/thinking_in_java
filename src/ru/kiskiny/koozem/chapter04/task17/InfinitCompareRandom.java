package ru.kiskiny.koozem.chapter04.task17;

import java.util.Random;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printf;

public class InfinitCompareRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int y = 0;

        //CAUTION!
        //for stop press to Ctrl+F2
        while(true) {
            int x = rand.nextInt(100);
            if(x < y) {
                printf("%s < %s", x, y);
                print();
            } else if (x > y){
                printf("%s > %s", x, y);
                print();
            } else {
                printf("%s = %s", x, y);
                print();
            }

            y = x;
        }

    }
}
