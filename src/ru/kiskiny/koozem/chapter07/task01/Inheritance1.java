package ru.kiskiny.koozem.chapter07.task01;

public class Inheritance1 {
    Inheritance1(){
        System.out.println("created");
    }

    public String toString(){
        return "Yo-ho-ho!";
    }
}

class Inheritance2 {
    public static void main(String[] args) {
        int i = 3;
        int g = 8;

        System.out.println("anyone");
        System.out.println(i + g);

        // отложенная инициализация (непосредственно перед использованием)
        Inheritance1 inh = new Inheritance1();
        System.out.println(inh);

    }
}