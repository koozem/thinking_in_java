package ru.kiskiny.koozem.chapter04.task23;

public class Fibonacci {

    Fibonacci(){
    }

    public void fibonacci(int i) {
        int a[] = new int[i];
        a[0] = 1;
        a[1] = 1;
        for(int j = 2; j <i; j++) {
            a[j] = a[j-1] + a[j-2];

        }
        for(int x : a){
            System.out.println(x);
        }

    }

}
