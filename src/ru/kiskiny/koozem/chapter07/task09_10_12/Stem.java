package ru.kiskiny.koozem.chapter07.task09_10_12;

//если сделать конструкторы с аргументами, результат не изменится
public class Stem extends Root {
    Stem(int i){
        super(i);
        System.out.println("Stem");
    }
    Component1 co1 = new Component1(5);
    Component2 co2 = new Component2(7);
    Component3 co3 = new Component3(3);

    /**
     * удаление объектов должно происходить в обратном порядке создания
     * super.dispose вызывается для удаления объектов базового класса
     */
    void dispose(){
        co3.dispose();
        co2.dispose();
        co1.dispose();
        System.out.println("delete Stem");
        super.dispose();
    }

    public static void main(String[] args) {
        Stem s = new Stem(8);
        s.dispose();
    }
}
/*такой интересный результат работы проги до добавления dispose
com1
com2
com3
Root
com1
com2
com3
Stem*/

/* такой результат после
com1
com2
com3
Root
com1
com2
com3
Stem
delete component3
delete component2
delete component1
delete Stem
delete component3
delete component2
delete component1
delete Root */
