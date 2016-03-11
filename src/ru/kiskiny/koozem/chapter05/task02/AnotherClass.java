package ru.kiskiny.koozem.chapter05.task02;

/**
 * В чем отличия инициализации в конструкторе
 * от инициализации в точке вызова
 */
public class AnotherClass {
    static String s;

    /**
     * переменной из конструктора можно пользоваться
     * только при создании экземпляра класса
     * в отличии от переменной из main()
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
