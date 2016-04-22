package ru.kiskiny.koozem.chapter07.task20;

class WithFinals {
    //то же самое, что и просто private
    public void f() {
        System.out.println("WithFinals.f()");
    }

    //так же автоматически является final
    public void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    @Override
    public void f(){
        System.out.println("OverridingPrivate.f()");
    }
    @Override
    public void g() {
        System.out.println("OverridingPrivate.g()");
    }

}

class OverridingPrivate2 extends OverridingPrivate {
    @Override
    public void f(){ //был такой метод private final void f()
        System.out.println("OverridingPrivate2.f()");
    }
    @Override
    public void g() { // был такой метод private void g()
        System.out.println("OverridingPrivate2.g()");
    }

}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        //можно произвести восходящее преобразование
        OverridingPrivate op = op2;
        //но методы вызвать нельзя было до изменений
        op.f();
        op.g();
        WithFinals wf = op2;
        wf.f();
        wf.g();
        OverridingPrivate oop = new OverridingPrivate();
        WithFinals wwf = new WithFinals();
        oop.f();
        wwf.f();
    }
}
