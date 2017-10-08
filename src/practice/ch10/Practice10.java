package practice.ch10;

interface Prac10Interface1 {
    void method();
}

public class Practice10 {
    public Prac10Interface1 test(boolean b) {
        if (b) {
            class Prac10Class1 implements Prac10Interface1 {
                public void method() {
                    System.out.println("implement");
                }
            }
            return new Prac10Class1();
        }
        return null;
    }
    public static void main(String[] args) {
        Practice10 pr = new Practice10();
        Prac10Interface1 p = pr.test(false);
    }
}
