package ru.kiskiny.koozem.chapter08.task01_05_18;

class Cycle {
    public int weels(){return 2;}
    public void ride() {
        System.out.println("Cycle ride");
        System.out.printf("Cycle weels " + weels() + "\n");
    }
}

class Unicycle extends Cycle {
    public void balanse() {
        System.out.println("Unicycle.balance()");
    }
    public int weels(){return 1;}
    public void ride() {
        System.out.println("Unicycle ride");
        System.out.printf("Unicycle weels " + weels() + "\n");
    }
}

class Bicycle extends Cycle {
    public void balanse() {
        System.out.println("Bicycle.balance()");
    }
    public int weels(){return 2;}
    public void ride() {
        System.out.println("Bicycle ride");
        System.out.printf("Bicycle weels " + weels() + "\n");
    }
}

class Tricycle extends Cycle {
    public int weels(){return 3;}
    public void ride() {
        System.out.println("Tricycle ride");
        System.out.printf("Tricycle weels " + weels() + "\n");
    }
}

public class Cycles {
    public static void main(String[] args) {
       /* Cycle a = new Unicycle(); //восходящее преобразование
        Cycle b = new Bicycle();
        Cycle c = new Tricycle();
        a.ride();
        b.ride();
        c.ride();*/

        //восходящее преобразование
        Cycle[] cy = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle(),
        };
        //! cy[0].balanse(); нельзя, т.к. в Cycle нет такого метода
        //! cy[1].balanse();
        //! cy[2].balance();

        // нисходящее преобразование
        ((Unicycle)cy[0]).balanse();
        ((Bicycle)cy[1]).balanse();
        //! ((Tricycle)cy[2]).balanse(); не получится
        //! ((Bicycle)cy[2]).balanse(); будет исключение
    }
}
