package ru.kiskiny.koozem.chapter07.task02;

public class Detergent extends Cleanser {
    public void scrub() {
        append(" Detergent.scrub");
        super.scrub(); //метод базового класса
    }
    public void foam(){
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("And now check the base class");
        Cleanser.main(args);
    }
}
