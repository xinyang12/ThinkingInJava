package practice.ch12;

class Prac10Exception1 extends Exception {

}

class Prac10Exception2 extends Exception {

}

public class Practice10 {
    public static void g() throws Prac10Exception1 {
        throw new Prac10Exception1();
    }

    public static void f() throws Prac10Exception2 {
        try {
            g();
        } catch (Prac10Exception1 e) {
            throw new Prac10Exception2();
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Prac10Exception2 e) {
            e.printStackTrace();
        }
    }
}
