package ru.kiskiny.koozem.chapter09.task05_06.another_pack;

import ru.kiskiny.koozem.chapter09.task05_06.InterfaceDemonstration;

/**
 * нужно импортировать интерфейс, так же как обычный класс
 * а еще он должен быть со спецификатором public
 */
public class ImplementationInterface implements InterfaceDemonstration {
    public void one() {
        System.out.println("1");
    }

    public void two() {
        System.out.println("2");
    }

    public void three() {
        System.out.println("3");
    }

    public static void main(String[] args) {
        ImplementationInterface d = new ImplementationInterface();
        d.one();
        d.two();
        d.three();
    }
}

