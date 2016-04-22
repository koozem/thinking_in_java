package ru.kiskiny.koozem.chapter09.task01;


abstract class Rodent {

    abstract void eat();
    abstract void sleep();
    abstract void sing();

    // вызываем методы классов SomethingWrite и Shared
}

class Mouse extends Rodent {
    void eat() {
        System.out.println("Mouse eats grain");
    }

    void sleep() {
        System.out.println("Mouse sleeps in a hole in the ground");
    }

    void sing() {
        System.out.println("Mouse sings: pi-pi-pi");
    }

    // здесь так же надо переопределить метод для удаления + вызвать метод родителя
    // тогда при использовании восходящего преобразования все правильно вызовется

}

class Hamster extends Rodent {
    void eat() {
        System.out.println("Hamster eats vegetables");
    }

    void sleep() {
        System.out.println("Hamster sleeps in a hole in the ground");
    }

    void sing() {
        System.out.println("Hamster sings: i-i-i");
    }

}

class Chipmunk extends Rodent {

    void eat() {
        System.out.println("Chipmunk eats nuts");
    }

    void sleep() {
        System.out.println("Chipmunk sleeps in a hole in the wood");
    }

    void sing() {
        System.out.println("Chipmunk sings: what's up man?");
    }

}

public class Rodents {
    public static void main(String[] args) {
        Rodent[] ro = {
                new Mouse(),
                new Hamster(),
                new Chipmunk(),
        };

        for(Rodent i : ro) {
            i.eat();
            i.sleep();
            i.sing();
        }
    }
}