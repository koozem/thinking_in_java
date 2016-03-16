package ru.kiskiny.koozem.chapter05.task10_11;

public class WithFinalize {
    int iniz = 0;

    WithFinalize(int i){
        iniz = i;
    }

    void inTrash(){
        iniz = 0;
    }


    @Override
    protected void finalize() throws Throwable {
        if(iniz != 0){
            System.out.println("Вызывается finalize" +
                    "Обнулите iniz");
            //super.finalize();
        }

    }
}
