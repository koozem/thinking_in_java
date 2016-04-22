package ru.kiskiny.koozem.chapter06.task04.testProtected;

/**
 * использование protected спецификатора на примере метода и поля
 */
public class Protected {
    protected int i = 76;
    protected void method(){
        System.out.println("This protected method");
        System.out.println("Protected field: " + i);

    }
}
