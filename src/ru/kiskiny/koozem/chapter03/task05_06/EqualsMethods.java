package ru.kiskiny.koozem.chapter03.task05_06;

public class EqualsMethods {

    public static void main(String[] args) {

        //упр. 5
        Dog little = new Dog();
        Dog big = new Dog();

        little.name = "Spot";
        big.name = "Scruffy";

        little.says = "wow";
        big.says = "wow wow";

        System.out.println(little.name + " says " + little.says);
        System.out.println(big.name + " says " + big.says);

        //упр. 6
        Dog middle = new Dog();
        little.name = middle.name;

        System.out.println(middle == little); //true
        System.out.println(middle.equals(little)); //true

        little = middle;

        System.out.println(middle == little); //true
        System.out.println(middle.equals(little)); //true

    }
}
