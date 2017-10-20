package practice.ch12;

class Prac11Exception extends Exception {

}

public class Practice11 {
    public static void g() throws Prac11Exception {
        throw new Prac11Exception();
    }

    public static void f() throws Prac11Exception {
        try {
            g();
        } catch (Prac11Exception e) {
            e.initCause(new NullPointerException());
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Prac11Exception e) {
            e.printStackTrace();
        }
    }
}
