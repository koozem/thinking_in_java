package ru.kiskiny.koozem.chapter03.task07;

import java.util.Random;


public class TossACoin {

    public static void main(String[] args) {

        //упр. 7
        Random rand = new Random();
        int i = rand.nextInt(2);
        String j;
        if(i == 0) {
             j = "Reshka";
        } else {
             j = "Orel";
        }
        System.out.println(i + " = " + j);

    }
}
