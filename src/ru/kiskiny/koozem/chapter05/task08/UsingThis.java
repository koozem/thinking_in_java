package ru.kiskiny.koozem.chapter05.task08;

/**
 * использование ключевого слова this
 */
public class UsingThis {

    public int firstMethod(int i){
        return i;
    }

    /**
     * пример того как надо (1)
     * и как не надо (2)
     * использовать this
     *
     * this можно вызвать только в нестатическом методе
     */
    public void secondMethod(){
        System.out.println(firstMethod(3)); /** (1)*/
        System.out.println(this.firstMethod(1)); /** (2)*/
    }

    public static void main(String[] args) {
        UsingThis u = new UsingThis();
        u.secondMethod();
    }
}
