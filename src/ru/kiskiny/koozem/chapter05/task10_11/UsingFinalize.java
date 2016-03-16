package ru.kiskiny.koozem.chapter05.task10_11;

/**
 * использование метода finalize
 */
public class UsingFinalize {
    public static void main(String[] args) {
        WithFinalize h = new WithFinalize(0);
        h.inTrash();
        System.out.println("Сразу на удаление");

        WithFinalize f = new WithFinalize(13);
        f.inTrash();
        System.out.println("Использовали и удилили");

        WithFinalize g = new WithFinalize(5); // все эти объекты не могут быть удалены сейчас,
        g.iniz = 6;                           // так как все ссылки активны


        new WithFinalize(7); // забыли про ссылку -> объект должен быть удален
                             //но перед удалением вызывается finalize, указывающий на ошибку

        new WithFinalize(0); //забыли про ссылку, но условия finalize выполнены, объект будет удален сразу
        System.gc();
    }
}
