package ru.kiskiny.koozem.chapter05.task20;

/**
 * Main со списком аргументов переменной длины
 */
public class VariableLengthArgsInMain { //а еще не стоит создавать таких длинных имен

    /**
     * @param args список аргументов переменной длины
     */
    public static void main(String... args) {
        System.out.print("аргументы: ");
        for(String s : args){
            System.out.print(" " + s);
        }
        System.out.println();
    }

}
