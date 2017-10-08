package practice.ch10.pack3;

import practice.ch10.pack1.Prac6Interface1;
import practice.ch10.pack2.Prac6Class1;

public class Prac6Class2 extends Prac6Class1 {
    public Prac6Interface1 getInner() {
        return new Inner();
    }
    public static void main(String[] args) {

    }
}
