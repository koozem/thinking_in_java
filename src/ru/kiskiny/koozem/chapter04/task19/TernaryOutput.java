package ru.kiskiny.koozem.chapter04.task19;

import static net.mindview.util.Print.print;

/**
 *
 */
public class TernaryOutput {
    static final int x = 0x09;
    static final int y = 0x10;

    public static String ternary(int i){// TODO ternary in task19
       String ter = "";
        for (int j = 0; i > 1; j++)
        if(i > 0) {
            String s = (i % 2 == 1) ? "1" : "0";
            ter += s;
            i = i / 2;
        }

        //сначала проверка знака
        //(i != 1) ? s += 1 : s+= 0;

        return ter;
    }

    /**
     * @param args program parameters
     * @see net.mindview.util.Print
     */

    public static void main(String[] args) {


        print("x = " + ternary(x));
        print("y = " + Integer.toBinaryString(y));
        print("x & y = " + Integer.toBinaryString(x & y));
        print("x | y = " + Integer.toBinaryString(x | y));
        print("x ^ y = " + Integer.toBinaryString(x ^ y));
        print("~x = " + Integer.toBinaryString(~x));
        print("~y = " + Integer.toBinaryString(~y));
        print("x >> 1 = " + Integer.toBinaryString(x >> 1));
        print("x << 1 = " + Integer.toBinaryString(x << 1));
        print("x >>> 1 = " + Integer.toBinaryString(x >>> 1));
        print("y >> 1 = " + Integer.toBinaryString(y >> 1));
        print("y << 1 = " + Integer.toBinaryString(y << 1));
        print("y >>> 1 = " + Integer.toBinaryString(y >>> 1));

    }
}
