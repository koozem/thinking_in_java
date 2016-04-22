package ru.kiskiny.koozem.chapter07.task02;

public class Sponge extends Detergent {
    public void scrub(){
        append(" Sponge.scrub()");

    }
    public void sterilize(){
        append(" sterilize()");
    }

    public static void main(String[] args) {
        Sponge x = new Sponge();
        x.dilute();
        x.foam();
        x.scrub();
        x.sterilize();
        System.out.println(x);
        System.out.println("Detergent: ");
        Detergent.main(args);

    }
}
