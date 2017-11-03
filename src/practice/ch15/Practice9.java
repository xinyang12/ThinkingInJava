package practice.ch15;

public class Practice9 {
    public <A, B> void f(A a, B b, Integer c) {
        System.out.println("A is " + a.getClass().getSimpleName());
        System.out.println("B is " + b.getClass().getSimpleName());
        System.out.println("C is " + c.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        Practice9 p = new Practice9();
        p.f(3.2, "dff", 1);
        p.f("sdf", 'c', 2);
    }
}
