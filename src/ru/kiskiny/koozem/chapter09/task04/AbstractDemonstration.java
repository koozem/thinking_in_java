package ru.kiskiny.koozem.chapter09.task04;

//TODO я нихрена не поняла из задания
abstract class AAA {

}

class AAB extends AAA {
    void meth() {
        System.out.println("AAB");
    }

    static void st() {
        // сделала так как-то
        AAA a = new AAB();
        // без нисходящего преобразования метод, конечно, не вызовется
        ((AAB) a).meth();
    }
    /**
     * в задании написано было "создать статический метод, получающий ссылку на базовый класс",
     * но базовый класс абстрактный... как получить ссылку на него - хз. экземпляр то не создашь
     */

}

public class AbstractDemonstration {
    public static void main(String[] args) {
        AAB.st();
    }
}
/* результат:
* AAB
*/
