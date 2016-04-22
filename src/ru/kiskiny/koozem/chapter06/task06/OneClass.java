package ru.kiskiny.koozem.chapter06.task06;

public class OneClass {
    protected static int i = 12;
    protected static String s = "miu";

    protected void one() {
        System.out.println("okey");
    }

}

class TwoClass {
    private static void kkoko() {
        for (int j = 0; j < OneClass.i; j++) {
            System.out.print(OneClass.s + " ");
        }
    }

    public static void main(String[] args) {
        OneClass ones = new OneClass();
        ones.one();
        kkoko();
    }
}
