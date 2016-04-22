package ru.kiskiny.koozem.chapter06.task05;

public class AllSpecifiers {
    public int i = 1;
    protected  int j = 2;
    private  int k = 3;
    int l = 4;

    public void pub(int x){
        System.out.println("This public method  " + i*x);
    }

    protected void protect(int x){
        System.out.println("This protected method  " + j*x);
    }

    private void priv(int x){
        System.out.println("This private method  " + k*x);
    }

    void pack(int x){
        System.out.println("This package access method  " + l*x);
    }
}
