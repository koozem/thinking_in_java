package ru.kiskiny.koozem.chapter08.task02_03_04;

public class Diamond extends Shape {
    @Override
    public void draw() {
        System.out.println("Diamond draw()");
    }
    @Override
    public void erase() {
        System.out.println("Diamond erase()");
    }
    @Override
    public void msg(){
        System.out.println("Diamond msg");
    }
}
