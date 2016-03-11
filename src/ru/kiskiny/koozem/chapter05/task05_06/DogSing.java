package ru.kiskiny.koozem.chapter05.task05_06;

/**
 * демонстрация перегрузки
 */
public class DogSing {

    public static void main(String[] args) {
        Dog Pipi = new Dog();

        Pipi.bark((byte)10);
        Pipi.bark(26);
        Pipi.bark(37.8f);

        Pipi.bark(26, "Тише");
        Pipi.bark("Голос", 35);
    }
}
