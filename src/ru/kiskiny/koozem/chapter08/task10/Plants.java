package ru.kiskiny.koozem.chapter08.task10;

class Plant {
    void photosyntesis() {
        System.out.println("plant releases oxygen");
        breath();
    }
    void breath() {
        System.out.println("Plant breaths");
    }
}

class Flower extends  Plant {
    void breath() {
        System.out.println("Flower breaths");
    }
}

public class Plants {
    public static void main(String[] args) {
        Flower fl = new Flower();
        fl.photosyntesis();
    }
}
