package ru.kiskiny.koozem.chapter09.task09_10;

import ru.kiskiny.koozem.chapter08.task06_07_08.Note;


interface Playable {
    void play(Note n);
}

abstract class Instrument implements Playable {

    public abstract void adjust();

}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public void adjust() {
        System.out.println("Adjusting " + this);
    }

    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public void adjust() {
        System.out.println("Adjusting " + this);
    }

    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public void adjust() {
        System.out.println("Adjusting " + this);
    }

    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
       public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    // работа метода не зависит от фактического типа объекта
    // поэтому типы,добавленные в систему, будут работать правильно
    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        // восходящее преобразование при добавлении в массив
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),

        };
        tuneAll(orchestra);
    }
}

