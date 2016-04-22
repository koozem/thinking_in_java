package ru.kiskiny.koozem.chapter07.task19;

public class NullFinal {
    final int x;

    NullFinal() {
        x = 4;
    }
    NullFinal(int j){
        x = j;
    }

    public static void main(String[] args) {
        NullFinal n = new NullFinal();
        //! n.x ++; нельзя
        NullFinal m = new NullFinal(3);
        //! m.x = 5; нельзя
    }
}
