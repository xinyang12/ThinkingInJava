package practice.ch7;

class A {
    A(int i) {
        System.out.println("A constructor");
    }
}

class B {
    B(int i) {
        System.out.println("B constructor");
    }
}

class C extends A {
    C() {
        super(5);
        System.out.println("C constructor");
    }
    B b = new B(2);
}

public class Practice5 {
    public static void main(String[] args) {
        C c = new C();
    }
}
