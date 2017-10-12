package practice.ch10;

class Prac26Outer {
    class Inner {
        public Inner(int x) {
            System.out.println("x is " + x);
        }
    }
}

public class Practice26 {
    class Inner extends Prac26Outer.Inner {
        public Inner(Prac26Outer p) {
            p.super(12);
        }
    }
    public static void main(String[] args) {
        Practice26 p = new Practice26();
        Inner i = p.new Inner(new Prac26Outer());
    }
}
