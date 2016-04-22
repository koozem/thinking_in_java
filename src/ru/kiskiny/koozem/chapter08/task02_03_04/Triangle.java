package ru.kiskiny.koozem.chapter08.task02_03_04;

public class Triangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Triangle draw()");
    }
    @Override
    public void erase(){
        System.out.println("Triangle erase()");
    }
    @Override
    public void msg(){
        System.out.println("Triangle msg");
    }
}
