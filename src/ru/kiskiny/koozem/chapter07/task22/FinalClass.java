package ru.kiskiny.koozem.chapter07.task22;

final class FinalInheritance {
    private FinalInheritance() {
        System.out.println("тут что то делается");
    }

    public static FinalInheritance f() {
        FinalInheritance fi = new FinalInheritance();
        System.out.println("тут что то выводится");
        return fi;
    }

}

public class FinalClass {//! extends FinalInheritance { // нельзя

    public static void main(String[] args) {
        System.out.println("d");

        // но создать экземпляр класса или вызвать его методы можно
        FinalInheritance f = FinalInheritance.f();

    }

}