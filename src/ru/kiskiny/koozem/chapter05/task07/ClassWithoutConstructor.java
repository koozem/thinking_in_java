package ru.kiskiny.koozem.chapter05.task07;

/**
 * класс без конструктора
 */
public class ClassWithoutConstructor {

    /**
     * @param args конструктор по умолчанию синтезируется автоматически
     */
    public static void main(String[] args) {
        ClassWithoutConstructor c = new ClassWithoutConstructor();
        System.out.println(c);
    }
}
