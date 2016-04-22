package ru.kiskiny.koozem.chapter07.task23;

public class DownloadClass {
    private static final int count = g("здесь произошла загрузка класса и инициализация переменной");

    private static int g(String s){
        System.out.println(s);
        return 1;
    }

    DownloadClass() {
        //count = g("Инициализирована переменная");
        System.out.println("конструктор");
    }

    public static void f() {
        //count = g("Инициализирована переменная");
        System.out.println("метод");
    }

    public static void main(String[] args) {
        System.out.printf(String.valueOf(count));
        System.out.println();
        DownloadClass.f();
        DownloadClass d = new DownloadClass();
        d.f();
        DownloadClass e = new DownloadClass();
        e.f();

    }
}
