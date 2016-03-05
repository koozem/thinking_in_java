package ru.kiskiny.koozem.chapter04.task18;

import static net.mindview.util.Print.print;

public class PrimeNumbers {

    public static void main(String[] args) {

        for (int i = 3; i < 100; i++) {
            for (int j = 2; j <= i; j++) {
                int k = i % j;

                if (k == 0) {
                    if (j == i){
                        print(i);
                    }else break;
                }

            }
        }
    }
}


