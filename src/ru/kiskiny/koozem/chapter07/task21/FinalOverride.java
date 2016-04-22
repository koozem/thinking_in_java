package ru.kiskiny.koozem.chapter07.task21;

class Final {
    public final void f() {
        System.out.println("final f");
    }

    final void g() {
        System.out.println("final g");
    }

    private void h() {
        System.out.println("final h");
    }
}

public class FinalOverride extends Final {
  /*  @Override
    public void f() { //нельзя, так как метод final
        System.out.println("a");
    }

    @Override
    void g() { //нельзя, так как метод final
        System.out.println("b");
    }

    @Override
    private void h() { //private метод так же является методом final,
        //но он не доступен для мерегрузки еще потому,
        // что private не доступен для других классов
        System.out.println("c");
    }*/
}
