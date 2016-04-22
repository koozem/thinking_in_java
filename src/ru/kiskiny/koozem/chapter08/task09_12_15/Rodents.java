package ru.kiskiny.koozem.chapter08.task09_12_15;

class Shared {
    private int refcount = 0; // счетчик ссылок
    private static long counter = 0; // сколько создано таких объектов
    private final long id = counter++; // id всегда уникален

    public Shared() {
        System.out.println("Создаем " + this);
    }

    public String toString() {
        return "Shared " + id;
    }

    public void addRef() {
        refcount++;
    }

    public void dispose() {
        if (--refcount == 0)
            System.out.println("Уничтожили объект " + this);
    }
}

class SomethingWrite {
    private Shared shar; // создаем ссылку
    private static long counter = 0;
    private final long id = counter++;

    public SomethingWrite(Shared shared) {
        System.out.println("создаем " + this);
        this.shar = shared; // этой ссылке передаем значение аргумента
        this.shar.addRef(); // вызываем метод класса Shared
    }

    public String toString() {
        return "SomethingWrite " + id;
    }

    public void dispose() {
        System.out.println("уничтожение " + this);
        shar.dispose();
    }
}

class Rodent {
    public Shared sha = new Shared();
    private SomethingWrite rodd = new SomethingWrite(sha);

    void eat() {
        System.out.println("Rodent eats");
    }

    void sleep() {
        System.out.println("Rodent sleeps");
    }

    void sing() {
        System.out.println("Rodent sings");
    }

    // вызываем методы классов SomethingWrite и Shared
    void dispose() {
        rodd.dispose();
        sha.dispose();
    }
}

class Mouse extends Rodent {
    private SomethingWrite mo = new SomethingWrite(sha);

    void eat() {
        System.out.println("Mouse eats grain");
    }

    void sleep() {
        System.out.println("Mouse sleeps in a hole in the ground");
    }

    void sing() {
        System.out.println("Mouse sings: pi-pi-pi");
    }

    // здесь так же надо переопределить метод для удаления + вызвать метод родителя
    // тогда при использовании восходящего преобразования все правильно вызовется
    void dispose() {
        mo.dispose();
        super.dispose();
    }
}

class Hamster extends Rodent {
    private SomethingWrite ham = new SomethingWrite(sha);

    void eat() {
        System.out.println("Hamster eats vegetables");
    }

    void sleep() {
        System.out.println("Hamster sleeps in a hole in the ground");
    }

    void sing() {
        System.out.println("Hamster sings: i-i-i");
    }

    void dispose() {
        ham.dispose();
        super.dispose();
    }
}

class Chipmunk extends Rodent {
    private SomethingWrite chi = new SomethingWrite(sha);

    void eat() {
        System.out.println("Chipmunk eats nuts");
    }

    void sleep() {
        System.out.println("Chipmunk sleeps in a hole in the wood");
    }

    void sing() {
        System.out.println("Chipmunk sings: what's up man?");
    }

    void dispose() {
        chi.dispose();
        super.dispose();
    }
}

public class Rodents {
    public static void main(String[] args) {
        Rodent[] ro = {
                new Mouse(),
                new Hamster(),
                new Chipmunk(),
        };
        for(Rodent i : ro)
            i.dispose();
        /*for(Rodent i : ro) {
            i.eat();
            i.sleep();
            i.sing();
        }*/
    }
}
/* 09 task
* Mouse eats grain
Mouse sleeps in a hole in the ground
Mouse sings: pi-pi-pi
Hamster eats vegetables
Hamster sleeps in a hole in the ground
Hamster sings: i-i-i
Chipmunk eats nuts
Chipmunk sleeps in a hole in the wood
Chipmunk sings: what's up man?*/

/* 12 task
* Rodent string
Mouse string
Rodent string
Hamster string
Rodent string
Chipmunk string */

/* 15 task
* Создаем Shared 0
создаем SomethingWrite 0 эти ссылки создаются 2 раза, так как вызывается родитель, потом наследник
создаем SomethingWrite 1
Создаем Shared 1
создаем SomethingWrite 2
создаем SomethingWrite 3
Создаем Shared 2
создаем SomethingWrite 4
создаем SomethingWrite 5
уничтожение SomethingWrite 1
уничтожение SomethingWrite 0
Уничтожили объект Shared 0
уничтожение SomethingWrite 3
уничтожение SomethingWrite 2
Уничтожили объект Shared 1
уничтожение SomethingWrite 5
уничтожение SomethingWrite 4
Уничтожили объект Shared 2*/
