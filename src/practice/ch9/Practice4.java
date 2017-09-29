package practice.ch9;

abstract class Dad1 {

}

class Son1 extends Dad1 {
    public void print() {
        System.out.println("This is the dad1");
    }
}

abstract class Dad2 {
    abstract void print();
}

class Son2 extends Dad2 {
    public void print() {
        System.out.println("This is the dad2");
    }
}

public class Practice4 {
    public static void print1(Dad1 dad1) {
        ((Son1)dad1).print();
    }
    public static void print2(Dad2 dad2) {
        dad2.print();
    }
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        print1(son1);
        Son2 son2 = new Son2();
        print2(son2);
    }
}
