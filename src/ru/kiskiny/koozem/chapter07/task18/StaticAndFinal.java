package ru.kiskiny.koozem.chapter07.task18;

import java.util.Random;

public class StaticAndFinal {

    static Random rand = new Random(47);
    static final int rs = rand.nextInt(20); //определится один раз и будет одинаковой для всех объектов
    final int op = rand.nextInt(20); //определится для каждого объекта по разному

    public static void main(String[] args) {
        //! op++; нельзя изменить, так как final
        //! rs++; так же
        StaticAndFinal s = new StaticAndFinal();
        System.out.println(s.rs);
        System.out.println(s.op);

        StaticAndFinal u = new StaticAndFinal();
        System.out.println(u.rs);
        System.out.println(u.op);

        StaticAndFinal t = new StaticAndFinal();
        System.out.println(t.rs);
        System.out.println(t.op);
    }
}
/* результат работы такой
18
15
18
13
18
1
 */
