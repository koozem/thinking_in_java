package ru.kiskiny.koozem.chapter07.task08;

class Base {
    Base() {
        System.out.println("Base");
    }
}

public class Inherit extends Base{
    Inherit() {
        super(); //сейчас не важно, есть ли вызов базового конструктора,
        // он все равно будет вызван до производного
        System.out.println("Inh");
    }
    Inherit(String s){

        System.out.println("inherit");
    }

    public static void main(String[] args) {
        Inherit in = new Inherit();
        Inherit inh = new Inherit("ko");
    }
}
