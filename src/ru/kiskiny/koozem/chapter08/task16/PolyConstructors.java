package ru.kiskiny.koozem.chapter08.task16;

class Glyph {
    private void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызова draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
        draw();
    }

    private void draw() {
        System.out.println("RoundGlyph.draw() radius = " + radius);
    }
}

class RectangleGlyph extends Glyph {
    private int length = 1;
    private int width = 1;

    RectangleGlyph(int l, int w) {
        length = l;
        width = w;
        System.out.println("RectangleGlyph.RectangleGlyph(), length = " + length + ", width = " + width);
        draw();
    }

    private void draw() {
        System.out.println("RectangleGlyph.draw(), length = " + length + ", width = " + width);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangleGlyph(2,5);
    }
}

/*
* Glyph() перед вызовом draw()
RoundGlyph.draw() radius = 0
Glyph() после вызова draw()
RoundGlyph.RoundGlyph(), radius = 5
Glyph() перед вызовом draw()
RectangleGlyph.draw(), length = 0, width = 0
Glyph() после вызова draw()
RectangleGlyph.RectangleGlyph(), length = 2, width = 5
*/

/* проблема легко решается, если в методы draw() добавить спецификатор private
* или вместо определения метода draw() в базовом классе, определить его только в наследниках.
* Glyph() перед вызовом draw()
Glyph.draw()
Glyph() после вызова draw()
RoundGlyph.RoundGlyph(), radius = 5
RoundGlyph.draw() radius = 5
Glyph() перед вызовом draw()
Glyph.draw()
Glyph() после вызова draw()
RectangleGlyph.RectangleGlyph(), length = 2, width = 5
RectangleGlyph.draw(), length = 2, width = 5
*/
