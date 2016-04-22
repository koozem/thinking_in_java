package ru.kiskiny.koozem.chapter08.task02_03_04;

public class Square extends Shape {
    @Override
    public void draw(){
        System.out.println("Square draw()");
    }
    @Override
    public void erase(){
        System.out.println("Square erase()");
    }
    @Override
    public void msg(){
        System.out.println("Square msg");
    }
}
