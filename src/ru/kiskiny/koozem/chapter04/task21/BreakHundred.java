package ru.kiskiny.koozem.chapter04.task21;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class BreakHundred {

    //если сначала использовать return в первом цикле, второй цикл не будет выполняться
        public static void main(String[] args) {
            for(int i = 1; i <101; i++){
                printnb(i + " ");
                if(i == 10) {
                    break;
                }
            }

            print(" ");
            for(int i = 1; i <101; i++){
                printnb(i + " ");
                if(i == 13) {
                    return;
                }
            }

        }
   }
