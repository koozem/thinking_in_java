package ru.kiskiny.koozem.chapter04.task24;

/**
 *
 */
public class Vampire {

    /**
     * числа "вымпиры"
     */
    public static void vamp(){

        int i, j, k;

        //двузначные множители
        for(i = 11; i < 100; i++){
            for(j = 11; j < 100; j++){
                k = i * j;

                //четырехзначное произведение
                if((k > 999) && (k < 10000) && (k % 10 != 0)){
                    //перевод из integer в char array
                    char[] a_arr = IntToCharArr.intToCharArr(i);
                    char[] b_arr = IntToCharArr.intToCharArr(j);
                    char[] c_arr = IntToCharArr.intToCharArr(k);

                    int x = 0;


                    for(int l = 0; l < 2; l++) {
                        if(a_arr[l] == 0){
                            x += 1;
                            continue;
                        }
                        if((a_arr[0] != a_arr[1]) && (a_arr[0] != b_arr[0]) && (a_arr[1] != b_arr[1]) && (a_arr[0] != b_arr[1]) && (a_arr[1] != b_arr[0])){
                            for (int n = 0; n < 4; n++) {

                                if (a_arr[l] == c_arr[n]) {
                                    x += 1;
                                    break;
                                }
                            }
                        }
                    }

                    int y = 0;
                    for(int m = 0; m < 2; m++) {
                        if(b_arr[m] == 0){
                            y += 1;
                            continue;
                        }
                        if((b_arr[0] != b_arr[1]) && (a_arr[0] != b_arr[0]) && (a_arr[1] != b_arr[1]) && (a_arr[0] != b_arr[1]) && (a_arr[1] != b_arr[0])){
                            for (int n = 0; n < 4; n++) {

                                if (b_arr[m] == c_arr[n]) {
                                    y += 1;
                                    break;
                                }
                            }
                        }
                    }

                    if((x == 2) && (y == 2)){
                        System.out.printf("%s = %s * %s", k, i, j);
                        System.out.println();
                    }
                }

            }
        }

    }

    public static void main(String[] args) {
        Vampire.vamp();
    }

}