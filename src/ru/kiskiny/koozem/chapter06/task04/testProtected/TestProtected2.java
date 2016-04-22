package ru.kiskiny.koozem.chapter06.task04.testProtected;

public class TestProtected2 {
    public static void main(String[] args) {
        Protected p = new Protected();
        p.i = 3;
        p.method(); // можно, так как в том же пакете
    }
}
