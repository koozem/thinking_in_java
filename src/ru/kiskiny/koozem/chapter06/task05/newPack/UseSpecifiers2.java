package ru.kiskiny.koozem.chapter06.task05.newPack;

import ru.kiskiny.koozem.chapter06.task05.AllSpecifiers;

public class UseSpecifiers2 {
    public static void main(String[] args) {
        AllSpecifiers all = new AllSpecifiers();

        //public
        System.out.println(all.i);
        all.i = 3;
        all.pub(7);

        //protected нельзя
        //! all.j = 2;
        //! all.protect(6);

        //package access нельзя
        //! all.l = 5;
        //! all.pack(8);

        //private нельзя
        //! all.k = 9;
        //! all.priv(5);
    }
}
