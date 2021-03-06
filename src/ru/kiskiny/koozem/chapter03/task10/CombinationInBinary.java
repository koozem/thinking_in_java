package ru.kiskiny.koozem.chapter03.task10;

import static net.mindview.util.Print.print;

/**
 *
 */
public class CombinationInBinary {
    static final int x = 0x011;
    static final int y = 0x10;

    /**
     * @param args program parameters
     * @see net.mindview.util.Print
     */
    public static void main(String[] args) {

        print("x = " + Integer.toBinaryString(x));
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
