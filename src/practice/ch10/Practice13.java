package practice.ch10;

interface Prac13Interface1 {
    void method();
}

public class Practice13 {
    public Prac13Interface1 test() {
//        class Prac13Class1 implements Prac13Interface1 {
//            public void method() {
//                System.out.println("implement");
//            }
//        }
//        return new Prac13Class1();
        return new Prac13Interface1() {
            @Override
            public void method() {
                System.out.println("implement");
            }
        };
    }
    public static void main(String[] args) {
        Practice13 pr = new Practice13();
        Prac13Interface1 p = pr.test();
        p.method();
    }
}
