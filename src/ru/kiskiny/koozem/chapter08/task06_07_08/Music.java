package ru.kiskiny.koozem.chapter08.task06_07_08;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    static String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    public String toString() {
        return Instrument.what();
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    static String what() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }

    public String toString() {
        return Wind.what();
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    static String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }

    public String toString() {
        return Percussion.what();
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    static String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }

    public String toString() {
        return Stringed.what();
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    static String what() {
        return "Brass";
    }

    public String toString() {
        return Brass.what();
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    static String what() {
        return "Woodwind";
    }

    void adjust() {
        System.out.println("Adjusting Woodwind");
    }

    public String toString() {
        return Woodwind.what();
    }
}

class Keyboards extends Instrument {
    void play(Note n) {
        System.out.println("Keyboards.play() " + n);
    }

    static String what() {
        return "Keyboards";
    }

    public String toString() {
        return Keyboards.what();
    }
}

public class Music {
    private static RandomGenerator ran = new RandomGenerator();
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] ins = new Instrument[9];
        for(int i = 0; i < ins.length; i ++){
            ins[i] = ran.next();
            tune(ins[i]);
            System.out.println(ins[i]);
        }

        /*
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Keyboards(),
        };
        tuneAll(orchestra);
        for (Instrument i : orchestra)
            System.out.println(i);*/
    }
}
