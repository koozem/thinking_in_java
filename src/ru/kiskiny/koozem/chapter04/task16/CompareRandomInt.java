package ru.kiskiny.koozem.chapter04.task16;

import java.util.Random;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printf;

public class CompareRandomInt {

    public static void main(String[] args) {
        Random rand = new Random();
        int y = 0;

        for(int i = 0; i < 25; i ++) {
            int x = rand.nextInt(100);
            if (i>0){
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
            }
            y = x;
        }

    }
}
