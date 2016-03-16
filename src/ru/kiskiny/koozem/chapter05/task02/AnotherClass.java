package ru.kiskiny.koozem.chapter05.task02;

/**
 * В чем отличия инициализации в конструкторе
 * от инициализации в точке вызова
 */
public class AnotherClass {
    static String s;

    /**
     * Строка S инициализируется автоматически со значением null
     * При запуске программы S, инициализированная в main(), сразу станет равной koo
     * Значение zem будет присвоено только после создания экземпляра класса
     */
    AnotherClass(){
        s = "zem";
        System.out.println(s);
    }
    public static void main(String[] args) {
        s = "koo";
        System.out.println(s);
        AnotherClass a = new AnotherClass();
    }
}
