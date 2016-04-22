package ru.kiskiny.koozem.chapter09.task03;

/**
 * при создании наследника вызывается конструктор базового класса
 * в конструкторе вызывается абстрактный метод
 * его реализация описана только в наследниках
 * по-этому вызывается метод наследника
 */
abstract class AB {
    abstract void print();

    AB() {
        print();
    }
}

class BC extends AB {
    int i;

    void print() {
        i = 3;
        System.out.println(i);
    }
}

class BD extends AB {
    int i;

    void print() {
        i = 7;
        System.out.println(i);
    }
}

public class Abctraction {
    /**
     * @param args а
     *             даже если закомментировать вызов print()
     *             результат все равно будет таким
     *
     *             3
     *             7
     */
    public static void main(String[] args) {
        BC x = new BC();
        //x.print();
        BD y = new BD();
        //y.print();
    }
}
