package ru.kiskiny.koozem.chapter05.task09;

/**
 * Вызов конструктора в конструкторе
 *
 */
public class OverloadAndThis {

    /**
     * @param i здесь слово this должно быть в первой строчке
     *          иначе заругается компилятор
     */
    OverloadAndThis(int i){
        this(i, " Hi");
        System.out.println("Первый конструктор");
    }

    OverloadAndThis(int i, String s){
        System.out.println("Второй конструктор" + s);
    }

    /**
     * @param args сообщение из второго конструктора вызовется первым,
     *             тут все логично
     */
    public static void main(String[] args) {
        OverloadAndThis to = new OverloadAndThis(12);
    }
}
