package practice.ch12;

class Prac25Exception1 extends Exception {}
class Prac25Exception2 extends Prac25Exception1 {}
class Prac25Exception3 extends Prac25Exception2 {}

class A {
    public void method() throws Prac25Exception1 {

    }
}

class B extends A {
    public void method() throws Prac25Exception2 {

    }
}

class C extends B {
    public void method() throws Prac25Exception3 {

    }
}

public class Practice25 {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.method();
        } catch (Prac25Exception1 e) {
            e.printStackTrace();
        }
    }
}
