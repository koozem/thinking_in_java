package ru.kiskiny.koozem.chapter06.task02;

import net.mindview.simple.Vector;

/**
 * использование одноименных классов из разных библиотек
 */
public class LibTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        java.util.Vector u = new java.util.Vector();
    }

}
