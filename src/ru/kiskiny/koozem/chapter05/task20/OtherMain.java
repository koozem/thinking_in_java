package ru.kiskiny.koozem.chapter05.task20;

/**
 * передаем в VariableLengthArgsInMain.main аргументы
 */
public class OtherMain {

    /**
     * @param args здесь разные варианты задания списков
     */
    public static void main(String[] args){
        String[] c = new String[]{"good", "for", "you"}; // массив строк
        String[] d = new String[]{}; //пустой массив строк

        String[] e = { //возможна такая инициализация массива строк
                new String("sun"), //такой способ может привести к ошибкам
                new String("moon"), //но здесь он тоже выполняется
                "star", //автоматическая упаковка
        };

        VariableLengthArgsInMain.main("hel", "lo", " ", "my", "friend");
        VariableLengthArgsInMain.main(c);
        VariableLengthArgsInMain.main(d);
        VariableLengthArgsInMain.main(e);
    }
}
/*Result: аргументы:  hel lo   my friend
          аргументы:  good for you
          аргументы:
          аргументы:  sun moon star*/
