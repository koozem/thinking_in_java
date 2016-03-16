package ru.kiskiny.koozem.chapter05.task12;

/**
 *
 */
public class UseTank {

    public static void main(String[] args) {
        for(int i = 1; i <2; i++){
            Tank t = new Tank("empty");
            System.out.println(t.fill);

            Tank u = new Tank("full");
            u.toEmpty();
            System.out.println(u.fill);

            Tank r = new Tank("Empty");
            r.toFill();
            System.out.println(r.fill);
        }

        System.gc();
    }
}
