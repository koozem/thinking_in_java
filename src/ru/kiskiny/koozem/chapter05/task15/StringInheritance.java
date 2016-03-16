package ru.kiskiny.koozem.chapter05.task15;

public class StringInheritance {
    String str1;
    String str2;
    {
        str1 = new String("Hey");
        str2 = new String("Jude");
        System.out.println("строки инициализированы");
    }

    public static void main(String[] args) {
        StringInheritance s = new StringInheritance();
        System.out.println(s.str1 + " " + s.str2);
    }
}
