package ru.kiskiny.koozem.chapter07.task05;

class A{
    A(){
        System.out.println("a");
    }
}

class B{
    B(){
        System.out.println("b");
    }
}

public class C extends A{
    private static B b;

    public static void main(String[] args) {
        b = new B();  // конструктор В вызывется только в момент инициализации
        C cl = new C();  // конструктор А вызовется в момент создания объекта С
        C cll = new C();
        b = new B();
    }
}
