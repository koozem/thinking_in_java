package ru.kiskiny.koozem.chapter07.task09_10_12;

class Component1 {
    Component1(int i){
        System.out.println("com1");
    }
    void dispose(){
        System.out.println("delete component1");
    }
}

class Component2 {
    Component2(int i){
        System.out.println("com2");
    }
    void dispose(){
        System.out.println("delete component2");
    }
}

class Component3 {
    Component3(int i){
        System.out.println("com3");
    }
    void dispose(){
        System.out.println("delete component3");
    }
}

public class Root {
    Root(int i){
        System.out.println("Root");
    }

    Component1 com1 = new Component1(1);
    Component2 com2 = new Component2(3);
    Component3 com3 = new Component3(4);

    void dispose(){
        com3.dispose();
        com2.dispose();
        com1.dispose();
        System.out.println("delete Root");
    }
}
