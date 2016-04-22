package ru.kiskiny.koozem.chapter06.task05;

public class UseSpecifiers {

    public static void main(String[] args) {
        AllSpecifiers all = new AllSpecifiers();

        //public
        System.out.println(all.i);
        all.i = 3;
        all.pub(7);

        //protected
        System.out.println(all.j);
        all.j = 2;
        all.protect(6);

        //package access
        System.out.println(all.l);
        all.l = 5;
        all.pack(8);

        //private нельзя
        //! all.k = 9;
        //! all.priv(5);
    }
}
