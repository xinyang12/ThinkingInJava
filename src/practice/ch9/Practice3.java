package practice.ch9;

abstract class P3Base {
    P3Base() {
        print();
    }
    abstract void print();
}

class P3Extend extends P3Base {
    private int color = 1;
    void print() {
        System.out.println("The color is " + color);
    }
}

public class Practice3 {
    // 同理于ch8 PolyConstructors
    // 先调用了基类的构造方法，以及其中的print()方法
    // 但是print()方法调用时，color未赋值，为默认值0
    // 因此先输出0， 然后调用了基类的print()

    // 注意，为什么调用了两次呢？
    // 因为，先是调用了基类的构造方法，它会调用一次print()
    // 然后是clint的调用，再调用了一次print()
    // 所以一共是两次
    public static void main(String[] args) {
        P3Extend p3Extend = new P3Extend();
        p3Extend.print();
    }
}
