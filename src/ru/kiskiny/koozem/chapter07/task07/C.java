package ru.kiskiny.koozem.chapter07.task07;

class A{
    A(int i){
        System.out.println("a");
    }
}

class B{
    B(int i){
        System.out.println("b");
    }
}

public class C extends A{
    C(int i){
        super(i);
        System.out.println("c");
    }
    private static B b;

    public static void main(String[] args) {
        b = new B(5);  // конструктор В вызывется только в момент инициализации
        C cl = new C(5);  // конструктор А вызовется в момент создания объекта С
        C cll = new C(3);
        b = new B(9);
    }
}
