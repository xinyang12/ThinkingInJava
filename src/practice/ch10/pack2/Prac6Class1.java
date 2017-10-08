package practice.ch10.pack2;

import practice.ch10.pack1.Prac6Interface1;

public class Prac6Class1 {
    protected class Inner implements Prac6Interface1 {
        // TODO 这个构造函数删了之后就不行了
        public Inner() {}
        public void method1() {
            System.out.println("Prac6Class1.Inner");
        }
    }
}
