package ru.kiskiny.koozem.chapter05.task16;

import java.util.Random;

/**
 * Создать массив строк
 */
public class ArrayOfStrings {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] arr = new String[rand.nextInt(10)];
        System.out.println("длина массива: " + arr.length);

        for(String a : arr){
            a = ":*";

            System.out.print(a + " ");
        }
    }
}
