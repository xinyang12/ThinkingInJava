package practice.ch7;

class Parent {
    Parent(int i) {
        System.out.println("This is parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super(2);
        System.out.println("non-parameter constructor");
    }
    Child(int i) {
        super(i);
        System.out.println("parameter constructor");
    }
}

public class Practice8 {
    public static void main(String[] args) {
        Child child = new Child(1);
    }

}
