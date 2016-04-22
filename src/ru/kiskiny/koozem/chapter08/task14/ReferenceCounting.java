package ru.kiskiny.koozem.chapter08.task14;

class Shared {
    private int refcount = 0; // подсчет ссылок
    private static long counter = 0; // кол-во созданных экземпляров Shared
    private final long id = counter++;

    public Shared() {
        System.out.println("Создаем " + this);
    }

    public void addRef() { // когда будет создан считаемый объект, будет вызван этот метод
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Уничтожаем " + this);
    }

    public String toString() {
        return "Shared " + id;
    }

    /**
     * с этим методом все работает так же.
     * объект Shared не может быть уничтожен пока есть ссылки
     */
    protected void finalize() {
        if(refcount != 0){
            System.out.println("АЙЯЙ! объект не будет уничтожен");
        }

    }
}

class Composing {
    private Shared shared; // сначала ссылка null
    private static long counter = 0; // кол-во созданных экземпляров Composing
    private final long id = counter++; // id будет неизменный для каждого объекта

    public Composing(Shared shared) { // тут мы пихаем ссылку на Shared
        System.out.println("Создаем " + this);
        this.shared = shared;
        this.shared.addRef(); // добавляем ссылку на объект
    }

    protected void dispose() {
        System.out.println("Уничтожаем " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };
        for (Composing c : composing)
            c.dispose();
        System.gc();
    }
}
/*
* Создаем Shared 0
Создаем Composing 0
Создаем Composing 1
Создаем Composing 2
Создаем Composing 3
Создаем Composing 4
Уничтожаем Composing 0
Уничтожаем Composing 1
Уничтожаем Composing 2
Уничтожаем Composing 3
Уничтожаем Composing 4
Уничтожаем Shared 0*/
