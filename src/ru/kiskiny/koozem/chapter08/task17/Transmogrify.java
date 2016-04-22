package ru.kiskiny.koozem.chapter08.task17;

class Starship { //
    Starship(AlertStatus status) {
        System.out.println("The Starship " + status);
    }
}

enum AlertStatus {
    STOPS, WARP, FLIES;
}

public class Transmogrify {
    public void transmog_go(Starship starship) {
        starship =  new Starship(AlertStatus.FLIES);
    }

    public void transmog_warp(Starship starship) {
        starship =  new Starship(AlertStatus.WARP);
    }

    public static void main(String[] args) {
        Transmogrify t = new Transmogrify();
        Starship st = new Starship(AlertStatus.STOPS);
        t.transmog_go(st);
        t.transmog_warp(st);
    }
}
