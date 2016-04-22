package ru.kiskiny.koozem.chapter06.task04;

import ru.kiskiny.koozem.chapter06.task04.testProtected.Protected;

public class TestProtected1 {

    public static void main(String[] args) {
        Protected s = new Protected();
        //! s.i = 5;
        //! s.method(); //нельзя, так как protected
    }
}
