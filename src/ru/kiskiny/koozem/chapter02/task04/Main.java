package ru.kiskiny.koozem.chapter02.task04;

public class Main {

    /** Упражнения 1-10
     *
     * @param args бла блабла
     */

    public static void main(String[] args) {

        //* упр. 4
        DataOnly data = new DataOnly();
        data.i = 35;
        data.d = 35.0;
        System.out.println(data.check(data.i, data.d));
        
    }

}