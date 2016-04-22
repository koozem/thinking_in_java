package ru.kiskiny.koozem.chapter05.task22;

import ru.kiskiny.koozem.chapter05.task21.Money;

/**
 * Создать описание валюты в switch
 */
public class DescribeMoney {
    Money.Currency money; //ссылка на наименование из перечислений в классе Money

    private DescribeMoney(Money.Currency money){ //конструктор создаст класс с аргументом money
        this.money = money;              //этот тип будет использован в методе describe
    }

    private void describe(){

        switch (money){
            case RUBLE:
                System.out.println("Российская валюта"); break;
            case DOLLAR:
                System.out.println("По большей части северо-американская и австралийская валюта"); break;
            case EURO:
                System.out.println("Валюта Евросоюза"); break;
            case FRANK:
                System.out.println("Валюта Франции, и некоторых других стран до перехода на евро"); break;
            case BITCOIN:
                System.out.println("Криптовалюта. Используется в проведении удаленных платежей"); break;
            case HRYVNIA:
                System.out.println("Украинская валюта"); break;

        }
    }

    public static void main(String[] args) {
        DescribeMoney[] a = { // массив объектов DescribeMoney c аргументом из перечисления из класса Money
                new DescribeMoney(Money.Currency.RUBLE),
                new DescribeMoney(Money.Currency.BITCOIN),
                new DescribeMoney(Money.Currency.DOLLAR),
                new DescribeMoney(Money.Currency.FRANK),
                new DescribeMoney(Money.Currency.HRYVNIA),
                new DescribeMoney(Money.Currency.EURO),
        };

        for (DescribeMoney x : a) {
            x.describe();
        }
    }

}
