package ru.kiskiny.koozem.chapter05.task12;

public class Tank {
    String fill;

    Tank(String s){
        fill = s;
    }

    void toEmpty(){
        fill = "empty";
    }

    void toFill(){
        fill = "full";
    }

    @Override
    protected void finalize() throws Throwable {
        if(fill.equals("full")){
            super.finalize();
            System.out.println("Емкость не пуста");
        }

    }

}
