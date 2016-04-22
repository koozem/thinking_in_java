package ru.kiskiny.koozem.chapter09.task11;

public class CharactersShuffle {

    public String name() {
        return getClass().getSimpleName();
    }
    public String process(Object input) {
        StringBuilder ss = new StringBuilder((String)input);
        for (int i = 0; i == ss.length(); i += 5) {
            char a = ss.charAt(i);
            char b = ss.charAt(i + 1);
            char c = ss.charAt(i + 2);
            char d = ss.charAt(i + 3);
            ss.setCharAt(i, c);
            ss.setCharAt(i + 1, d);
            ss.setCharAt(i + 2, a);
            ss.setCharAt(i + 3, b);
        }
        return ss.toString();
    }

    public static void main(String[] args) {
        CharactersShuffle ch = new CharactersShuffle();

        System.out.println(ch.process("hello koozemka"));
    }

}
