package confuse.ch9;

import confuse.ch8.Note;

interface Instrument1 {
    // interface 中默认是static 与 final的
    int VALUE = 5;
    void play(Note n);
    void adjust();
//    String toString();
}

class Wind1 implements Instrument1 {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() {
        return "Wind";
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion1 implements Instrument1 {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() {
        return "Percussion";
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed1 implements Instrument1 {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() {
        return "Stringed";
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass1 extends Wind1 {
    public String toString() {
        return "Brass";
    }
}

class Woodwind1 extends Wind1 {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Instrument1 i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument1[] e) {
        for (Instrument1 i : e) {
            tune(i);
        }
    }
    public static void main(String[] args) {
        Instrument1[] orchestra = {
                new Wind1(),
                new Percussion1(),
                new Stringed1(),
                new Brass1(),
                new Woodwind1()
        };
        tuneAll(orchestra);
    }
}
