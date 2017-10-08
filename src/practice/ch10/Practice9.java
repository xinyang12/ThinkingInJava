package practice.ch10;

interface Prac9Interface1 {
    void method();
}

public class Practice9 {
    public Prac9Interface1 test() {
        class Prac9Class1 implements Prac9Interface1 {
            public void method() {
                System.out.println("implement");
            }
        }
        return new Prac9Class1();
    }
    public static void main(String[] args) {
        Practice9 pr = new Practice9();
        Prac9Interface1 p = pr.test();
        p.method();
    }
}
