package ru.kiskiny.koozem.chapter03.task14;

import static net.mindview.util.Print.print;

public class StringComparison {

    public static void compare(String s, String t){
        print(s + " = " + t + " it's "+ (s == t));
        print(s + " != " + t + " it's " + (s != t));

        int com = s.compareTo(t);
        if (com < 0){
            print(s + " < " + t);
        } else print(s + " > " + t);

        if (s.equals(t)) {
            print(s + " and "  + t + " equals");
        } else print(s + " and "  + t + " not equals");

    }
}
