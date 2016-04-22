package ru.kiskiny.koozem.chapter07.task13;

public class FourthOverload extends TreeOverload {
    void tree(String s) {
        System.out.println("tree(string)");
    }

    public static void main(String[] args) {
        FourthOverload f = new FourthOverload();
        f.tree(1);
        f.tree('g');
        f.tree("koozm");
        f.tree(4.35f);
    }
}
