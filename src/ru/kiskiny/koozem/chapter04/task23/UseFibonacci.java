package ru.kiskiny.koozem.chapter04.task23;

public class UseFibonacci {

    public static void main(String[] args) {

        int k = Integer.valueOf(args[0]);
        Fibonacci f = new Fibonacci();
        f.fibonacci(k);

    }
}
