package practice.ch15;

import confuse.ch15.Holder3;

class Prac1A {}
class Prac1B extends Prac1A {}

public class Practice1 {
    public static void main(String[] args) {
        Holder3<Prac1A> h = new Holder3<>(new Prac1B());
        Holder3<Prac1A> h2 = new Holder3<>(new Prac1A());
    }
}
