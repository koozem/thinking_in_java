package ru.kiskiny.koozem.chapter05.task19;

/**
 * Список аргументов переменной длины
 */
public class DynamicArray {

    /**
     * @param args массив строк переменной длины
     */
    public static void f(String... args){
        for(String a : args){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        String[] ar = {"ko", "oz","ma"};

        f(new String("koo"),new String("zem")); //так конечно не стоит делать
        f("teemee", "koozem", "lalalala", "tro lo lo lo"); //так можно
        f(ar); //и так можно

    }
}
