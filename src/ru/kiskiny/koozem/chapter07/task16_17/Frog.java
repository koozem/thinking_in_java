package ru.kiskiny.koozem.chapter07.task16_17;

class Amphibian {
    public void breath() {
        System.out.println("Amphibian can breathe");
    }

    public void watсh() {
        System.out.println("Amphibian can watch");
    }

    public void eat() {
        System.out.println("Amphibian can eat");
    }
}

public class Frog extends Amphibian {
    // переопределение методов
    //если их не будет, то работает восходящее преобразование
    public void breath() {
        System.out.println("Frog can breathe");
    }

    public void watсh() {
        System.out.println("Frog can watch");
    }

    public void eat() {
        System.out.println("Frog can eat");
    }

    public static void main(String[] args) {
        Frog x = new Frog();
        x.breath(); //восходящее преобразование
        x.watсh();
        x.eat();
    }
}
