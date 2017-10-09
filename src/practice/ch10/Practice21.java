package practice.ch10;

interface Prac21Interface {
    void method();
    class Test implements Prac21Interface {
        @Override
        public void method() {
            System.out.println("method in inner class");
        }
        public static void invoke(Prac21Interface p) {
            p.method();
        }
        public static void main(String[] args) {
            Test t = new Test();
            Test.invoke(t);
        }
    }
}

class Prac21Class implements Prac21Interface {
    @Override
    public void method() {
        System.out.println("method in implement");
    }
}

public class Practice21 implements Prac21Interface {
    @Override
    public void method() {
        System.out.println("method in main class");
    }
    public static void main(String[] args) {
        Prac21Interface p = new Prac21Interface.Test();
        Prac21Interface.Test.invoke(p);
    }

}