package ru.kiskiny.koozem.chapter04.task20;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printf;

public class IfElse {

    public static int test(int testval, int target, int begin,  int end){
        if(begin > end){
            int i = begin;
            begin = end;
            end = i;
        }
        if((testval < begin) || (testval > end)) {
            printf("Тестовое значение %s выходит за допустимые границы: [%s; %s] ", testval, begin, end);
            return 0;
        }
        else if(begin == end) {
            printf("Недопустимый диапазон: [%s; %s] ", begin, end);
            return 0;
        }
        else if(testval > target) return +1;
        else if(testval < target) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        print(test(4, 7, 5, 10));
        print(test(10, -1, -7, 13));
        print(test(6, 4, 10, 0));
        print(test(5, 5, 0, 7));
        print(test(5, 5, 5, 5));
    }
}
