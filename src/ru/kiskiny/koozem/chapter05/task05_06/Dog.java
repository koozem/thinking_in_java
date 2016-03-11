package ru.kiskiny.koozem.chapter05.task05_06;

/**
 * Перегрузка методов для примитивных типов
 */
public class Dog {

    public void bark(byte b){
        System.out.printf("Громкость %s. Собака скулит \n", b);
    }

    public void bark(int i){
        System.out.printf("Громкость %s. Собака воет \n", i);
    }

    public void bark(float f){
        System.out.printf("Громкость %s. Собака лает \n", f);
    }

    /**
     * @param i начальный порядок
     * @param s использования этих параметров
     */
    public void bark(int i, String s){
        System.out.printf("Громкость %s. Собака воет. Успокой ее словом %s \n", i, s);
    }

    /**
     * @param s другой порядок
     * @param i использования тех же параметров
     */
    public void bark(String s, int i){
        System.out.printf("Громкость %s. Говоришь %s и собака воет \n", i, s);
    }
}
