package ru.kiskiny.koozem.chapter04.task22;

import static net.mindview.util.Print.print;

public class SwitchCase {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            switch (i){
                case 0: print("This is 0"); break;
                case 1: print("This is 1"); break;
                case 2: print("This is 2"); break;
                case 3: print("This is 3"); break;
                case 4: print("This is 4"); break;
                default:  print("If you see this message, the program has a bug");
            }
        }
    }
}
