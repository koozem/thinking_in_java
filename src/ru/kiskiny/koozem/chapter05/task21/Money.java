package ru.kiskiny.koozem.chapter05.task21;

public class Money {

    public enum Currency{
        DOLLAR, EURO, RUBLE, FRANK, HRYVNIA, BITCOIN
    }


    public static void main(String[] args) {
        for(Currency s: Currency.values()){ //в порядке следования
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
