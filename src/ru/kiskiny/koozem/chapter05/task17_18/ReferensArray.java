package ru.kiskiny.koozem.chapter05.task17_18;

/**
 * создать массив ссылок на класс
 */
public class ReferensArray {

    ReferensArray(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        ReferensArray[] arr = new ReferensArray[10]; //создали массив ссылок на класс

        for(Object obj : arr){  //а теперь заполняем массив - создаем объекты
            obj = new ReferensArray("koo");
        }
    }
}
