package ru.kiskiny.koozem.chapter09.task08;

interface FastFood {
    void fast();
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

class Pickle {
    Pickle() {
        System.out.println("Pickle()");
    }
}

public class Sandwich extends PortableLunch implements FastFood {
    /**
     * реализация метода интерфейса
     */
    public void fast() {
        System.out.println("Быстренько");
    }
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich");
    }

    public static void main(String[] args) {
        Sandwich s = new Sandwich();
        s.fast();
    }
}
