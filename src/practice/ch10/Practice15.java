package practice.ch10;

class Prac15Class1 {
    public Prac15Class1(int x) {
        System.out.println("x is " + x);
    }
}

public class Practice15 {
    public Prac15Class1 getClass1() {
        return new Prac15Class1(4) {

        };
    }
    public static void main(String[] args) {
        Practice15 pr = new Practice15();
        Prac15Class1 p = pr.getClass1();
    }
}
