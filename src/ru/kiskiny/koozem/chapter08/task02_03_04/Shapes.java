package ru.kiskiny.koozem.chapter08.task02_03_04;

/**
 * Аннотация @Override ничего не изменяет
 * Если не переопределить какой-то метод, будет вызван метод родителя
 * Можно добавлять новые типы, программы будет работать правильно
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[7];
        for(int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for(Shape shp: s){
            shp.draw();
            //shp.msg();
        }
    }
}
